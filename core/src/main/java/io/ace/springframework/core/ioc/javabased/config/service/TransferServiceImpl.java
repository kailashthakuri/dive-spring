package io.ace.springframework.core.ioc.javabased.config.service;


import io.ace.springframework.core.ioc.javabased.config.repo.AccountRepository;

public class TransferServiceImpl implements TransferService {
    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
