package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;



public interface UserService {

    void add(User user);
    void delete(long id);
    User change(User user);
    List<User> listUsers();
    User findUserById(long id);
    User findByName(String username);


}
