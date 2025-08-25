package com.lcwd.user.service.controller;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //create user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.saveUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user = userService.getUser(userId);
        //User user1 = user.get();
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

}
