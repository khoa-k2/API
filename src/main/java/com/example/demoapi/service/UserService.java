package com.example.demoapi.service;

import com.example.demoapi.entity.UserEntity;

import java.sql.SQLDataException;
import java.util.List;

public interface UserService {
    List<UserEntity> GetAllUsers() throws SQLDataException,Exception;
    UserEntity getUserByGmailAndPassword(String gmail, String password) throws SQLDataException,Exception;
}
