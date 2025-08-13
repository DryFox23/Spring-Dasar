package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicatTest {

    @Test
    void testDuplicatConfiguration() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicatConfiguration.class);

        Foo foo1 = context.getBean("foo1",Foo.class);
        Foo foo2 = context.getBean("foo2",Foo.class);

       Assertions.assertNotEquals(foo1,foo2);
    }
}
