package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface IUserService {
    User saveUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
    User getUserByEmail(String email);
}
