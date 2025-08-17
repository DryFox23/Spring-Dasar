package bernadinusnaisau.spring.core.service;
import bernadinusnaisau.spring.core.repository.ProductRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }

}
