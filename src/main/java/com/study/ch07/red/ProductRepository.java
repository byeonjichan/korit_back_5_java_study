package com.study.ch07.red;

public class ProductRepository {

    void saveProduct(Product product){
        ProductDB productDB =new ProductDB();
        productDB.insertProduct(product);
    }

}
