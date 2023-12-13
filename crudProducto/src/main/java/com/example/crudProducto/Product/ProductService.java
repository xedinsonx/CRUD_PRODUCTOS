package com.example.crudProducto.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final IProductRepository productRepository;

    @Autowired
    public ProductService(IProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public List<Product> getProducts(){
        return this.productRepository.findAll();

    }

    public void newProduct(Product product) {
        Optional<Product> res = productRepository.findProductByName(product.getName());
        if(res.isPresent()){
            throw new IllegalStateException("Ya existe el producto");
        }
        productRepository.save(product);
    }
    public void deleteproduct(Long id){
        this.productRepository.existsById(id);


        }
    }

