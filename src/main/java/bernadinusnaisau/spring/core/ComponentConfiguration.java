package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "bernadinusnaisau.spring.core.repository",
        "bernadinusnaisau.spring.core.service",
        "bernadinusnaisau.spring.core.configuration"
})
@Import({
        MultiFoo.class
})
public class ComponentConfiguration {
}
