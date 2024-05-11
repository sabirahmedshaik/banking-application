package net.springboot.guide.ba.service.impl;

import net.springboot.guide.ba.dto.AccountDto;
import net.springboot.guide.ba.entity.Account;
import net.springboot.guide.ba.exception.AccountException;
import net.springboot.guide.ba.mapper.AccountMapper;
import net.springboot.guide.ba.repository.AccountRepository;
import net.springboot.guide.ba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccount(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new AccountException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }
}
