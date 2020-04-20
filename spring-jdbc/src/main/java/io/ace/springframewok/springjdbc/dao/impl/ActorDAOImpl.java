package io.ace.springframewok.springjdbc.dao.impl;

import io.ace.springframewok.springjdbc.dao.ActorDAO;
import io.ace.springframewok.springjdbc.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ActorDAOImpl implements ActorDAO {

    private SimpleJdbcInsert simpleJdbcInsert;
    private SimpleJdbcInsert simpleJdbcInsertWithAutoKey;
    private SimpleJdbcInsert simpleJdbcInsertWithColumns;

    private SimpleJdbcCall simpleJdbcCall;


    private SimpleJdbcCall simpleJdbcCallFunction;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("actor");

        this.simpleJdbcInsertWithAutoKey = new SimpleJdbcInsert(dataSource)
                .withTableName("actor")
                .usingGeneratedKeyColumns("id");

        this.simpleJdbcInsertWithColumns = new SimpleJdbcInsert(dataSource)
                .withTableName("actor")
                .usingColumns("name", "age");

        this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("spGetActorById");

        this.simpleJdbcCallFunction = new SimpleJdbcCall(dataSource)
                .withFunctionName("fnGetActorNameById");
    }

    @Override
    public Actor getActorByIdProc(int id) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", id);
        Map<String, Object> result = this.simpleJdbcCall
                .execute(in);
        Actor actor = new Actor();
        actor.setId(id);
        actor.setName((String) result.get("out_name"));
        actor.setAge((Integer) (result.get("out_age")));
        actor.setDob((Date) result.get("out_dob"));
        return actor;
    }

    @Override
    public String getActorNameByIdFunc(int id) {
        return this.simpleJdbcCallFunction
                .executeFunction(String.class, Map.of("in_id", id));
    }

    @Override
    public int add(Actor actor) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("name", actor.getName());
        parameterSource.addValue("age", actor.getAge());
        parameterSource.addValue("movie_played", actor.getMoviePlayed());
        parameterSource.addValue("pay_per_movie", actor.getPayPerMovie());
        return this.simpleJdbcInsert.execute(parameterSource);
    }

    @Override
    public int addAndReturnKey(Actor actor) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", actor.getName());
        params.put("age", actor.getAge());
        params.put("move_played", actor.getMoviePlayed());
        params.put("pay_per_movie", actor.getPayPerMovie());
        Number number = this.simpleJdbcInsertWithAutoKey.executeAndReturnKey(params);
        return number.intValue();
    }

    @Override
    public int addWithColumns(Actor actor) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", actor.getName());
        params.put("age", actor.getAge());
        return this.simpleJdbcInsertWithColumns.execute(params);
    }

    @Override
    public int addWithBeanProperty(Actor actor) {
        SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(actor);
        return this.simpleJdbcInsert.execute(sqlParameterSource);
    }
}
