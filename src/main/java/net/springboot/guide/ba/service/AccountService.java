package net.springboot.guide.ba.service;

import net.springboot.guide.ba.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
    AccountDto getAccount(Long id);
    AccountDto deposit(Long id, double amount);

}
