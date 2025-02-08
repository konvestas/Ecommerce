package com.proje.Ecommerce.service;

import com.proje.Ecommerce.dto.LoginRequest;
import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.dto.UserDTO;
import com.proje.Ecommerce.model.User;
import com.proje.Ecommerce.repository.UserRepository;
import com.proje.Ecommerce.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class UserService implements IUserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}


    @Override
    public Response register(@RequestBody UserDTO userInfo){
        Response response = new Response();
        try {

            if (userRepository.existsByEmail(userInfo.getEmail())) {
                response.setStatusCode(400);
                response.setMessage("Email " + userInfo.getEmail() + " already exists.");
                return response;
            }
            if (userRepository.existsByPhoneNumber(userInfo.getPhoneNumber())) {
                response.setStatusCode(400);
                response.setMessage("Phone number " + userInfo.getPhoneNumber() + " already exists.");
                return response;
            }

            User transferedUSer = Utils.userDTOToUser(userInfo);
            userRepository.save(transferedUSer);

            response.setUser(userInfo);
            response.setStatusCode(201);
            response.setMessage("User registered successfully");

        } catch (Exception e){
            response.setStatusCode(500);
            response.setMessage("Error during user registration: " + e.getMessage());
        }
    return response;
    }

    @Override
    public Response login(@RequestBody LoginRequest loginRequest) {
        Response response = new Response();

//        userRepository.findByUsername(userInfo.getEmail())
//                 .filter(u -> u.getPassword().equals(userInfo.getPassword())); // Şifre kontrolü
        return response;
    }

    @Override
    public Response authenticate(UserDTO userInfo) {
        Response response = new Response();

        return response;
    }

}
