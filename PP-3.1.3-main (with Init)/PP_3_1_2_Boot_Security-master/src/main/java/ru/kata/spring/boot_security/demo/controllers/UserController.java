package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.services.UserService;

import java.security.Principal;


@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user")
    public String showCurrentUser(Principal principal, Model model) {
        User user = userService.findByUsername(principal.getName());
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/user/{id}")
    public String showCurrentUserById(@PathVariable("id") long id, Principal principal, Model model) {
        User user1 = userService.findByUsername(principal.getName());
        if (user1.getRoles().contains("ROLE_ADMIN") || user1.getId() == id) {
            model.addAttribute("user", userService.showById(id));
            return "user";
        } else {
            return "redirect:/user";
        }
    }
}
