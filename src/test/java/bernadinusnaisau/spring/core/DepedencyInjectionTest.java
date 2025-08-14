package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Bar;
import bernadinusnaisau.spring.core.data.Foo;
import bernadinusnaisau.spring.core.data.FooBar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DepedencyInjectionTest {
ApplicationContext context;
    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDepedencyInjection() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertEquals(foo, fooBar.getFoo());
        Assertions.assertEquals(bar, fooBar.getBar());

    }
}
