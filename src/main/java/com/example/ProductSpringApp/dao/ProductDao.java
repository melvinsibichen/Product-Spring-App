package com.example.ProductApp.dao;

import com.example.ProductApp.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Products,Integer> {
}