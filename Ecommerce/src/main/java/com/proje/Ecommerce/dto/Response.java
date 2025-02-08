package com.proje.Ecommerce.dto;

import lombok.Data;

@Data
public class Response {

    private int statusCode;
    private String message;

    private String token;
    private String role;
    private String expirationTime;

    private UserDTO user;
    private ProductDTO product;

}
