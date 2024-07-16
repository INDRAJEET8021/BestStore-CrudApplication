package com.CrudApplication.crud.services;

import com.CrudApplication.crud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {
}
