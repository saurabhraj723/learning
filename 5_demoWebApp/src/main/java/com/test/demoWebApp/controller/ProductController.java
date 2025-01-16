package com.test.demoWebApp.controller;

import com.test.demoWebApp.model.Product;
import com.test.demoWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

//    @RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product findById(@PathVariable int prodId){
        return productService.findById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        productService.deleteProduct(prodId);
    }

}
