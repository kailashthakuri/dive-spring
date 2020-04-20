package io.ace.springframewok.springjdbc.translator;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DeadlockLoserDataAccessException;
import org.springframework.jdbc.support.SQLErrorCodeSQLExceptionTranslator;
import org.springframework.lang.Nullable;

import java.sql.SQLException;

public class CustomSQLErrorCodesTranslator extends SQLErrorCodeSQLExceptionTranslator {
    @Nullable
    @Override
    /**
     * here the specific error code -12345 is translated  while other error codes are left to be translated  by the
     * default translator implementation.
     */
    protected DataAccessException customTranslate(String task, @Nullable String sql, SQLException sqlEx) {
        if (sqlEx.getErrorCode() == -12345) {
            return new DeadlockLoserDataAccessException(task, sqlEx);
        }
        return null;
    }
}
