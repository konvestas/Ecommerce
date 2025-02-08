package com.proje.Ecommerce.controller;

import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.dto.UserDTO;
import com.proje.Ecommerce.model.User;
import com.proje.Ecommerce.service.IUserService;
import com.proje.Ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

//    @Autowired
//    private IUserService iUserService;
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody UserDTO userfromWeb) {
//        Response response = iUserService.register(userfromWeb);
//        return ResponseEntity.ok("User registered successfully!");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestBody UserDTO userfromWeb) {
//        Response response = iUserService.login(userfromWeb);
//        return ResponseEntity.ok("User login successfully!");
//    }

}

