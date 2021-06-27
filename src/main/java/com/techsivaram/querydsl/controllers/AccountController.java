package com.techsivaram.querydsl.controllers;

import java.util.List;

import com.techsivaram.querydsl.model.Account;
import com.techsivaram.querydsl.services.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping(value = "/")
    public List<Account> getAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{name}")
    public List<Account> getByName(@PathVariable("name") String name) {
        return service.getAccountByName(name);
    }

    @GetMapping(value = "/querydsl/")
    public List<Account> getOnlyIds() {
        return service.getAccountsUsingQDSL();
    }
}
