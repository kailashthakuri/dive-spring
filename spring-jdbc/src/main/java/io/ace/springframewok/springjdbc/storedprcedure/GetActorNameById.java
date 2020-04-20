package io.ace.springframewok.springjdbc.storedprcedure;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

@Component
public class GetActorNameById extends StoredProcedure {

    private static final String SQL = "spGetActorNameById";

    GetActorNameById(DataSource dataSource) {
        setDataSource(dataSource);
        setFunction(true);
        setSql(SQL);
        declareParameter(new SqlParameter("in_id", Types.INTEGER));
        declareParameter(new SqlOutParameter("out_name", Types.VARCHAR));
        compile();
    }

    public String execute(int id) {
        Map<String, Object> inputs = new HashMap<>();
        inputs.put("in_id", id);
        Map<String, Object> results = super.execute(inputs);
        return (String) results.get("out_name");
    }

}
