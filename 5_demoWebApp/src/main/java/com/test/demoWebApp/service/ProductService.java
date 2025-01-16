package com.test.demoWebApp.service;

import com.test.demoWebApp.model.Product;
import com.test.demoWebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepo repo;


//    List<Product> products= new ArrayList<>(Arrays.asList(new Product(100,"Iphone",50000),new Product(101,"Canon",100000),new Product(102,"Mike",4000)));
    public List<Product> getProducts(){

        return repo.findAll();
    }

    public Product findById(int prodId) {

        //Logic 1
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==prodId){
//                return products.get(i);
//            }
//        }
//        return new Product(0,"0",0);

        // Logic 2
//        return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product(0,"0",0));

//        logic 3
        return repo.findById(prodId).orElse(new Product(0,"Nothing",0));
    }

    public void addProduct(Product product) {

//        products.add(product);
        repo.save(product);
    }

    public void updateProduct(Product product) {
//        int index=0;
//        for(int i=0;i< products.size();i++){
//            if(products.get(i).getProdId()==product.getProdId()){
//                index=i;
//                break;
//            }
//
//        }
//        products.set(index,product);

        repo.save(product);
    }

    public void deleteProduct(int prodId) {
//        int index=0;
//        for(int i=0;i< products.size();i++){
//            if(products.get(i).getProdId()==prodId){
//                index=i;
//                break;
//            }
//
//        }
//        products.remove(index);
        repo.deleteById(prodId);
    }
}
