package bernadinusnaisau.spring.core.service;

import bernadinusnaisau.spring.core.data.Bar;
import bernadinusnaisau.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
@Import({
        Foo.class,
        Bar.class,
})
@Slf4j
public class ProductService {

    public Foo foo() {
        log.info("creating foo");
        return new Foo();
    }

}
