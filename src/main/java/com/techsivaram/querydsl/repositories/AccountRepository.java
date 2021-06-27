package com.techsivaram.querydsl.repositories;

import java.util.List;

import com.techsivaram.querydsl.model.Account;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

@Repository
public interface AccountRepository extends MongoRepository<Account, String>, QuerydslPredicateExecutor<Account> {
    List<Account> findByName(String name);
}
