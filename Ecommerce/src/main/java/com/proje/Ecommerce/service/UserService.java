package com.proje.Ecommerce.service;

import com.proje.Ecommerce.dto.UserDTO;
import com.proje.Ecommerce.enums.Role;
import com.proje.Ecommerce.model.User;
import com.proje.Ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {this.userRepository = userRepository;}


    public User registerUser( UserDTO userDTO ){
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());

        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPhoneNumber(userDTO.getPhoneNumber());

        user.setRole(Role.USER);

        userRepository.save(user);
        return user;
    }

}
