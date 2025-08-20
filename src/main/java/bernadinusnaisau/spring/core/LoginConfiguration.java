package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.listener.LoginSuccesListener;
import bernadinusnaisau.spring.core.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        LoginSuccesListener.class,
        UserService.class
})
public class LoginConfiguration {
}
