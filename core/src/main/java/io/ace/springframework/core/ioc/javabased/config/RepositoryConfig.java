package io.ace.springframework.core.ioc.javabased.config;

import io.ace.springframework.core.ioc.javabased.config.repo.AccountRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface RepositoryConfig {
    public AccountRepository accountRepository();
}
