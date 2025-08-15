package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.Connection;
import bernadinusnaisau.spring.core.data.cyclick.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifecycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }

    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
