package io.ace.springframework.core.ioc.javabased.config;

import io.ace.springframework.core.ioc.javabased.config.repo.AccountRepository;
import io.ace.springframework.core.ioc.javabased.config.repo.JdbcAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultRepositoryConfig implements RepositoryConfig {

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }
}
