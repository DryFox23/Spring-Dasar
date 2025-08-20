package bernadinusnaisau.spring.core.application;

import bernadinusnaisau.spring.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class FooApplication {

    @Bean(value = "Foo Bean")
    public Foo foo(){
        return new Foo();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        Foo foo = applicationContext.getBean("Foo Bean", Foo.class);
        System.out.println(foo);
    }
}
