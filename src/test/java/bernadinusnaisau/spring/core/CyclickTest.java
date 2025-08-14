package bernadinusnaisau.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CyclickTest {


    @Test
    void testCyclick() {
        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclickConfiguration.class);
        });
    }
}
