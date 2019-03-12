package com.hust.spring.beans.annotation.repository;

import com.hust.spring.beans.annotation.Controller.UserController;
import com.hust.spring.beans.annotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired(required = false)
    private TestObject testObject;

    @Override
    public void Save() {
        System.out.println("UserRepository Save...");
        System.out.println(testObject);
    }
}
