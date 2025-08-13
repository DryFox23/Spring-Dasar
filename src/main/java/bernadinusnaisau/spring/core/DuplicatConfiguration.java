package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicatConfiguration {

    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    }
    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    }
}
