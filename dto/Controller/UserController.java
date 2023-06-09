package com.example.dto.Controller;

import com.example.dto.DtoExample.Dto;
import com.example.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired

    private UserService userService;

    @GetMapping("/users-location")
    public List<Dto>getAllUsersLocation(){

        return userService.getAllUsersLocation();
    }
}
