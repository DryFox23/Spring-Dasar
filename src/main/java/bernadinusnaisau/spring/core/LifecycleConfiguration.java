package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Connection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }
}
