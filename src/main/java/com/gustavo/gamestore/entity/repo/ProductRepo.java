/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.gamestore.entity.repo;


import com.gustavo.gamestore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gustavo
 */
public interface ProductRepo extends JpaRepository<Product, Long>{

    public void deleteProductById(Long id);
    
}
