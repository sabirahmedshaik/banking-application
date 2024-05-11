package net.springboot.guide.ba.service.impl;

import net.springboot.guide.ba.repository.AccountRepository;
import net.springboot.guide.ba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
}
