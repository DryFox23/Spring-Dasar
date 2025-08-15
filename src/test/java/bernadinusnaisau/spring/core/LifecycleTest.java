package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Connection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testConnection() {
        Connection connection = context.getBean(Connection.class);
    }
}
