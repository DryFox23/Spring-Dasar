package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(AwareConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testAware() {
        AuthService authService = context.getBean(AuthService.class);

        Assertions.assertNotNull(authService);
        Assertions.assertEquals("bernadinusnaisau.spring.core.service.AuthService", authService.getBeanName());
        Assertions.assertSame(authService.getApplicationContext(), context);
    }
}
