package com.ecommerce.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ecommerce.webapp.model.Purchase;

@Component
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
