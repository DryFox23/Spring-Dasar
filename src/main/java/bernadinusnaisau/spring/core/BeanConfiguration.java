package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public Foo foo(){
        Foo foo = new Foo();

        return foo;
    }
}
