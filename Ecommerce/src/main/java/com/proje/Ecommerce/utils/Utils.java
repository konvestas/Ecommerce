package com.proje.Ecommerce.utils;

import com.proje.Ecommerce.dto.ProductDTO;
import com.proje.Ecommerce.dto.UserDTO;
import com.proje.Ecommerce.enums.Role;
import com.proje.Ecommerce.model.Product;
import com.proje.Ecommerce.model.User;

public class Utils  {

    public static User userDTOToUser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername(userDTO.getUsername());

        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setRole(Role.USER);
        return user;
    }

    public static Product productDTOToProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setCategory(productDTO.getCategory());
        product.setBrand(productDTO.getBrand());
        product.setProductAvailable(productDTO.isProductAvailable());
        product.setDescription(productDTO.getDescription());
        product.setReleaseDate(productDTO.getReleaseDate());
        product.setStockQuantity(productDTO.getStockQuantity());
        return product;


    }

}
