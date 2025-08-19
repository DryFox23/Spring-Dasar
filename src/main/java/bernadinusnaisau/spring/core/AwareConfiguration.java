package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.service.AuthService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AuthService.class
})
public class AwareConfiguration {
}
