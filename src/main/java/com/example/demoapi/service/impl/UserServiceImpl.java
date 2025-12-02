package com.example.demoapi.service.impl;

import com.example.demoapi.entity.UserEntity;
import com.example.demoapi.repo.UserRepo;
import com.example.demoapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepo userRepo;

    @Override
    public List<UserEntity> GetAllUsers() throws SQLDataException,Exception {
        List<UserEntity> users = userRepo.findAll();
        if(users.isEmpty()){
        return null;
        }
        return users;
    }

    @Override
    public UserEntity getUserByGmailAndPassword(String gmail, String password) throws SQLDataException,Exception {
//        return userRepo.findByEmailAndPassword(gmail, password);

        UserEntity user = userRepo.findByEmailAndPassword(gmail, password);


        if (Objects.isNull(user)) {
            return null;
        } else {
            return user;
        }
    }

}

