package com.example.crudProducto.Product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    @PostMapping
    public  void RegistrarProducto(@RequestBody Product product){
        this.productService.newProduct(product);
    }
    @PutMapping
    public  void ActualizarProducto(@RequestBody Product product){
        this.productService.newProduct(product);
    }
    @DeleteMapping(path = "{productId}")
    public ResponseEntity<Object> eliminar(@PathVariable("productId") Long id){
        this.productService.deleteproduct(id);

        return null;
}
}

