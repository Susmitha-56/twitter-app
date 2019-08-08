package com.dbs.twitterapp.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.twitterapp.model.User;
import com.dbs.twitterapp.repository.UserDao;
import com.dbs.twitterapp.service.UserService;

@Controller
@RequestMapping("/xyz")
public class UserController {
	@Autowired
    private UserService userService;
	@Autowired
    private UserDao dao;
    @GetMapping(value = "/login")
    public String login(Model model){
        
        List<User> listOfAllUsers  = userService.listAll();
        listOfAllUsers.forEach(user ->  System.out.println(user));
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,User user){
       
        if(dao.findByName(username) != null&&dao.findByPassword(password)!=null) {
        	model.addAttribute("user", username);
            return "success";
        }
        return "register";
    }

    @GetMapping("/listAll")
    public String listAllUsers(Model model){
        List<User> users = this.userService.listAll();
        this.userService.listAll().forEach(System.out::println);
        model.addAttribute("users", users);
        return "list";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser( @Valid @ModelAttribute("user") User user) {
        this.userService.saveUser(user);
        return "acknowledge";
    }
}
