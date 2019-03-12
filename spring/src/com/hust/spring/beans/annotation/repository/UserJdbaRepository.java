package com.hust.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbaRepository implements UserRepository {

    @Override
    public void Save() {
        System.out.println("UserJdbcRepository Save...");
    }
}
