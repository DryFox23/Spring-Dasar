package bernadinusnaisau.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "bernadinusnaisau.spring.core.repository",
        "bernadinusnaisau.spring.core.service",
        "bernadinusnaisau.spring.core.configuration"
})
public class ComponentConfiguration {
}
