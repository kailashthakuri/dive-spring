package io.ace.springframework.core.ioc.javabased.config;

import io.ace.springframework.core.ioc.javabased.config.service.TransferService;
import io.ace.springframework.core.ioc.javabased.config.service.TransferServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Autowired
    RepositoryConfig repositoryConfig;

    @Bean
    public TransferService accountRepository() {
        return new TransferServiceImpl(repositoryConfig.accountRepository());
    }

}
