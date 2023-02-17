package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }
    
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers() {
    	return ResponseEntity.ok(userService.getAllUsers());
    }
    
    @GetMapping("/getbyEmail/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable("email") String email) {
    	return ResponseEntity.ok(userService.getUserByEmail(email));
    }
}