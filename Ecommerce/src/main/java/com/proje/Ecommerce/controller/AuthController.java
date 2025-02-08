package com.proje.Ecommerce.controller;


import com.proje.Ecommerce.dto.LoginRequest;
import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.dto.UserDTO;
import com.proje.Ecommerce.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/register")
    public ResponseEntity<Response> registerUser(@RequestBody UserDTO userfromWeb) {
        Response response = iUserService.register(userfromWeb);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response> loginUser(@RequestBody LoginRequest loginRequest) {
        Response response = iUserService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

}
