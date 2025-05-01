package org.ahmed.ete.web;


import org.ahmed.ete.entities.Product;
import org.ahmed.ete.model.Post;
import org.ahmed.ete.repositories.ProductRepo;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
public class ProductRestController {
    private ProductRepo productRepo;
    private RestClient restClient;

    public ProductRestController(ProductRepo productRepo, RestClient.Builder clientBuilder) {
        this.productRepo = productRepo;
        this.restClient = clientBuilder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    @GetMapping("/posts")
    public List<Post> allPosts(){
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {});
    }
}
