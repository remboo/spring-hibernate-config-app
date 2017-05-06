package com.johnremboo.controllers;

import com.johnremboo.models.User;
import com.johnremboo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public User findById(@PathVariable String id) {
            return userService.findById(Long.valueOf(id));
        }
}
