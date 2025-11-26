package com.MarceloAugustoBra.dscommerce.repositories;

import com.MarceloAugustoBra.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long > {
}
