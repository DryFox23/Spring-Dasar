package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessortTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FooBeanFactoryPostProcessorConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testFactory() {
        Foo foo = context.getBean(Foo.class);

        Assertions.assertNotNull(foo);
    }
}
