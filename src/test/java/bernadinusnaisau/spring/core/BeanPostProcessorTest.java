package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);
    }

    @Test
    void testGenerateUUIDCar() {
        Car car = context.getBean(Car.class);

        System.out.println(car);
        Assertions.assertNotNull(car);
    }
}
