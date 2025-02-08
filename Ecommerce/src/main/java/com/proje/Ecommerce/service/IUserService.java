package com.proje.Ecommerce.service;

import com.proje.Ecommerce.dto.LoginRequest;
import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.dto.UserDTO;



public interface IUserService {

    Response register (UserDTO userInfo);
    Response login(LoginRequest loginRequest);
    Response authenticate(UserDTO userInfo);

}
