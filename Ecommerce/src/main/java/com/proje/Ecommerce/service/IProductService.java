package com.proje.Ecommerce.service;

import com.proje.Ecommerce.dto.Response;
import com.proje.Ecommerce.dto.ProductDTO;


public interface IProductService {

    Response addProduct(ProductDTO product);

}
