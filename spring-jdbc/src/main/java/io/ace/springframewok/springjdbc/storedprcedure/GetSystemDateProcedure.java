package io.ace.springframewok.springjdbc.storedprcedure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Repository
public class GetSystemDateProcedure extends StoredProcedure {

    private static final String SQL = "sysdate";

    @Autowired
    public GetSystemDateProcedure(DataSource dataSource) {
        setDataSource(dataSource);
        setFunction(true);
        setSql(SQL);
        declareParameter(new SqlOutParameter("date", Types.DATE));
        compile();
    }

    public Date execute() {
        Map<String, Object> results = super.execute(new HashMap<>());
        return (Date) results.get("date");
    }
}
