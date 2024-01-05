package com.study.ch07.red;

public class ProductService {

    boolean isEmptyString(String str){
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스 까지 데이터 전달함.");

        productRepository.saveProduct(product);
    }
}
