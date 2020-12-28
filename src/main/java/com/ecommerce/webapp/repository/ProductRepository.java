package com.ecommerce.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ecommerce.webapp.model.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Long> {

}
