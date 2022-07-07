package com.study.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.spring.model.UserModel;
import com.study.spring.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private List<UserModel> users = new ArrayList<>();

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public UserModel user() {
        UserModel user = new UserModel();
        user.setId(1L);
        user.setName("Luiz Inácio da Silva");
        user.setUserName("Lula13");
        return user;
    }

    @GetMapping("/list")
    public List<UserModel> getAll() {
        return this.userRepository.findAll();
    }

    @PostMapping("/")
    public UserModel postUser(@RequestBody UserModel user) {
        this.userRepository.save(user);
        return user;
    }
}
