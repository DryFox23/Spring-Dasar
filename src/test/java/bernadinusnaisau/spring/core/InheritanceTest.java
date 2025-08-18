package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.service.MerchentService;
import bernadinusnaisau.spring.core.service.MerchentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    }

    @Test
    void testMerchent() {
        MerchentService service2 = context.getBean(MerchentService.class);
        MerchentServiceImpl service1 = context.getBean(MerchentServiceImpl.class);

        Assertions.assertSame(service1, service2);
    }
}
