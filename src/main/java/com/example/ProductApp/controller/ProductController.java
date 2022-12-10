package com.example.ProductApp.controller;

import com.example.ProductApp.dao.ProductDao;
import com.example.ProductApp.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to Product App Home";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewAll")
    public List<Products> ViewAll(){
        return (List<Products>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addProduct", consumes = "application/json", produces = "application/json")
    public String AddProduct(@RequestBody Products p){
        dao.save(p);
        return "Welcome to Add Product Page";
    }

    @PostMapping("/deleteProduct")
    public String DeleteProduct(){
        return "Welcome to Delete Product Page";
    }

    @PostMapping("/searchProduct")
    public String SearchProduct(){
        return "Welcome to Search Product Page";
    }

    @PostMapping("/editProduct")
    public String EditProduct(){
        return "Welcome to Edit Product Page";
    }

}
