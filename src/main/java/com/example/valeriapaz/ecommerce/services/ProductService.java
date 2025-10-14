package com.example.valeriapaz.ecommerce.services;

import com.example.valeriapaz.ecommerce.dto.ProductDTO;
import com.example.valeriapaz.ecommerce.entities.Product;
import com.example.valeriapaz.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    // Escrita didática
    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        // Find by Id retorna um objeto do tipo Optional por padrão
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
    }
    // Escrita mais curta!!
//    @Transactional(readOnly = true)
//    public ProductDTO findById(Long id) {
//        Product product = repository.findById(id).get();
//        return new ProductDTO(product);
//    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> result = repository.findAll(pageable);
        return result.map(x -> new ProductDTO(x));
    }



}
