package net.springboot.guide.ba.contoller;

import net.springboot.guide.ba.dto.AccountDto;
import net.springboot.guide.ba.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Build Create Bank Account REST API
    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto){
        AccountDto savedAccount = accountService.createAccount(accountDto);
        return new ResponseEntity<>(savedAccount, HttpStatus.CREATED);
    }

    //Build Get Bank Account REST API
    @GetMapping("{id}")
    public ResponseEntity<AccountDto> getAccount(@PathVariable("id") Long id){
        AccountDto getAccount = accountService.getAccount(id);
        return ResponseEntity.ok(getAccount);
    }
}
