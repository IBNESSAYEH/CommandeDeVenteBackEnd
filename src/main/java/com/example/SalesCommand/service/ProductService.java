package com.example.SalesCommand.service;

import com.example.SalesCommand.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ProductService {
      List<ProductDTO> getAllProducts();
     ProductDTO getProductById(Long id);
      ProductDTO saveProduct(ProductDTO productDTO);
     ProductDTO updateProduct(Long id, ProductDTO productDTO);
     void deleteProduct(Long id);
}
