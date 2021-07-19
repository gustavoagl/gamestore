/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.gamestore.service;

import com.gustavo.gamestore.entity.Product;
import com.gustavo.gamestore.entity.repo.ProductRepo;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Gustavo
 */
@Service
@Transactional
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteProductById(id);
    }

    public List<Product> findAllProduct() {
        return productRepo.findAll();
    }
}
