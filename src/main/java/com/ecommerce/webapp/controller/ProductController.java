package com.ecommerce.webapp.controller;

import com.ecommerce.webapp.business.ProductService;
import com.ecommerce.webapp.business.PurchaseService;
import com.ecommerce.webapp.model.Product;
import com.ecommerce.webapp.model.Purchase;
import com.ecommerce.webapp.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private PurchaseService purchaseService;

    /**
     * Retrieves all products
     * @return
     */
    @RequestMapping(value = "/products/", method = RequestMethod.POST, headers = {"Accept=application/json"},
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getProducts() {

        return getProductService().getProducts();
    }

    /**
     * Inserts purchase when the user buys a product
     * @param purchase object that we are inserting
     * @return
     */
    @RequestMapping(value = "/purchase/", method = RequestMethod.POST, headers = {"Accept=application/json"},
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void createUser(@RequestBody Purchase purchase) {

        getPurchaseService().savePurchase(purchase);
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

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public PurchaseService getPurchaseService() {
        return purchaseService;
    }

    public void setPurchaseService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }
}
