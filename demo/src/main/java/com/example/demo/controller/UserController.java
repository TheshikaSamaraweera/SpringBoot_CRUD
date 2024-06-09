package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value ="api/v1/user")

public class UserController {

    @GetMapping("/getUser")
    public String getUser() {
        return "user found";
    }

    @PostMapping ("/saveUser")
    public String saveUser() {
        return "user saved";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "user updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "user deleted";
    }

}
