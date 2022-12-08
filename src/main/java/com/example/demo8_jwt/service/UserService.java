package com.example.demo8_jwt.service;

import com.example.demo8_jwt.domain.Role;
import com.example.demo8_jwt.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
