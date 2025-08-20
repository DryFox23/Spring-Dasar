package bernadinusnaisau.spring.core.application;

import bernadinusnaisau.spring.core.data.Bar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class BarApplication {

    @Bean
    public Bar bar(){
        return new Bar();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BarApplication.class, args);
        Bar bar = context.getBean(Bar.class);
        System.out.println(bar);
    }
}
