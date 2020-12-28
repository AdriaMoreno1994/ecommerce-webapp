package com.ecommerce.webapp.business;

import com.ecommerce.webapp.model.Product;
import com.ecommerce.webapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public List<Product> getProducts() {

        return getProductRepository().findAll();
    }



    /************************************************
     *               GETTERS AND SETTERS            *
     ************************************************/

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
