package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo1 = context.getBean("fooFirst",Foo.class);
        Foo foo2 = context.getBean("fooSecond",Foo.class);

        Assertions.assertNotEquals(foo1,foo2);
    }
}
