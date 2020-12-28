package com.ecommerce.webapp.business;

import com.ecommerce.webapp.model.Purchase;
import com.ecommerce.webapp.repository.PurchaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Transactional
    public void savePurchase(Purchase purchase) {
        getPurchaseRepository().save(purchase);
    }


    /************************************************
     *               GETTERS AND SETTERS            *
     ************************************************/

    public PurchaseRepository getPurchaseRepository() {
        return purchaseRepository;
    }

    public void setPurchaseRepository(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
}
