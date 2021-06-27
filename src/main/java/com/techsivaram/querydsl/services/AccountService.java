package com.techsivaram.querydsl.services;

import java.util.List;

import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.techsivaram.querydsl.model.Account;
import com.techsivaram.querydsl.model.QAccount;
import com.techsivaram.querydsl.repositories.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repo;

    private EntityManager entityManager;

    public List<Account> findAll() {
        return repo.findAll();
    }

    public List<Account> getAccountByName(String name) {
        return repo.findByName(name);
    }

    // spring boot does not support it by default
    public List<Account> getAccountsUsingQDSL() {
        QAccount acc = QAccount.account;
        return (List<Account>) repo.findAll(acc.name.eq("siva"));
    }
}
