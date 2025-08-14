package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Bar;
import bernadinusnaisau.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Bean
    @DependsOn(value = "bar")
    public Foo foo(){
        log.info("Creating Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Creating Bar");
        return new Bar();
    }
}
