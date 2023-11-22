package com.mongo.com.controller;

import com.mongo.com.document.Account;
import com.mongo.com.repository.primary.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;


    @PostMapping("/create")
    public Account createAccount(@RequestBody Account account){
        return this.accountRepository.save(account);
    }}
