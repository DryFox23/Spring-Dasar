package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.repository.CategoryRepository;
import bernadinusnaisau.spring.core.repository.CustomerRepository;
import bernadinusnaisau.spring.core.repository.ProductRepository;
import bernadinusnaisau.spring.core.service.CategoryService;
import bernadinusnaisau.spring.core.service.CustomerService;
import bernadinusnaisau.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean("productService",ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }



    @Test
    void testDiComponent() {
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Assertions.assertSame(productRepository, productService.getProductRepository());
    }

    @Test
    void testDiComponentUsingSetter() {
        CategoryService categoryService = context.getBean(CategoryService.class);
        Assertions.assertNotNull(categoryService);

        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testDiComponentUsingField() {
        CustomerService costumerService = context.getBean(CustomerService.class);
        CustomerRepository normaCustomerRepository = context.getBean("normalCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository.class);

        Assertions.assertSame(costumerService.getNormalCustomerRepository(), normaCustomerRepository);
        Assertions.assertSame(premiumCustomerRepository,costumerService.getPremiumCustomerRepository());
    }
}
