package io.ace.springframework.core.ioc.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

@Configuration
@Profile("production")
public class JNDIDataConfig {

    @Bean
    public DataSource dataSource() throws NamingException {
        Context context = new InitialContext();
        return (DataSource) context.lookup("java:comp/evn/jdbc/datasource");
    }

}
