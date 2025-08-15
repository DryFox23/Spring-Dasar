package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Foo;
import bernadinusnaisau.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class DoubletonConfiguration {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope(value = "doubleton")
    public Foo foo() {
        log.info("Creating Foo From Scope Doubleton");
        return new Foo();
    }
}
