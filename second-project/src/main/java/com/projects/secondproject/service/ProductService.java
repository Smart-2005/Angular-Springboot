package com.projects.secondproject.service;

import com.projects.secondproject.dto.request.RequestProductDto;
import com.projects.secondproject.dto.response.ResponseProductDto;
import com.projects.secondproject.entity.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


public interface ProductService {
    public void saveProduct(RequestProductDto requestProductDto) throws IOException;
    public List<ResponseProductDto> getAllProducts();
    public void updateProduct(Long id,RequestProductDto requestProductDto) throws IOException;
    public void deleteProduct(Long id);
    public Optional<Product> getProductData(Long id);
}
