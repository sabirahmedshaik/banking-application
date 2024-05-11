package net.springboot.guide.ba.mapper;

import net.springboot.guide.ba.dto.AccountDto;
import net.springboot.guide.ba.entity.Account;

public class AccountMapper {
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setAccountHolderName(account.getAccountHolderName());
        accountDto.setBalance(account.getBalance());

        return accountDto;
    }

    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());

        return account;
    }
}
