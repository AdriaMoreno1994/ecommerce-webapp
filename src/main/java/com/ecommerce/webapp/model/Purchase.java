package com.ecommerce.webapp.model;

import javax.persistence.*;

@Entity
@Table(name = "PURCHASE", schema = "ecommerce")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @JoinColumn(name = "EMAIL")
    private String email;

    public Purchase() {
    }

    public Purchase(Product product, String email) {
        this.product = product;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
