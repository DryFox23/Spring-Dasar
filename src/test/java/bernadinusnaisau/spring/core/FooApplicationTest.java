package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.application.BarApplication;
import bernadinusnaisau.spring.core.application.FooApplication;
import bernadinusnaisau.spring.core.configuration.BarConfiguration;
import bernadinusnaisau.spring.core.data.Bar;
import bernadinusnaisau.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest(classes = {FooApplication.class, BarApplication.class})
public class FooApplicationTest {

    @Autowired
    Foo foo;

    @Autowired
    Bar bar;

    @Test
    void testFooApplication() {
        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
