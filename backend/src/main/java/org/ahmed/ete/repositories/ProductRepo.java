package org.ahmed.ete.repositories;

import org.ahmed.ete.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
