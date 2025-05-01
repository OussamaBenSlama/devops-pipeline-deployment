package org.ahmed.ete;

import org.ahmed.ete.entities.Product;
import org.ahmed.ete.repositories.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringEndToEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEndToEndApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (ProductRepo productRepository){
        return args -> {
            productRepository.save(Product.builder().name("Computer").price(23000).build());
            productRepository.save(Product.builder().name("Smart Phone").price(1200).build());
            productRepository.save(Product.builder().name("Printer").price(300).build());
            productRepository.findAll().forEach(System.out::println);

        };
    }
}
