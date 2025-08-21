package bernadinusnaisau.spring.core.application;

import bernadinusnaisau.spring.core.data.Bar;
import bernadinusnaisau.spring.core.data.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class FooApplication {

    @Bean(value = "Foo Bean")
    public Foo foo() {
        return new Foo();
    }

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//        Foo foo = applicationContext.getBean("Foo Bean", Foo.class);
//        System.out.println(foo);
//    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FooApplication.class);
        app.setBannerMode(Banner.Mode.OFF);

        ConfigurableApplicationContext context = app.run(args);
        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
    }


}
