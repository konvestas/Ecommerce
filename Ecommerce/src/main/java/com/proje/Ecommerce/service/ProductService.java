package com.proje.Ecommerce.service;

import com.proje.Ecommerce.dto.ProductDTO;
import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService implements IProductService {
    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {this.productRepository = productRepository;}

    @Override
    public Response addProduct(@RequestBody ProductDTO product) {
        Response response = new Response();
        return response;
    }

}
