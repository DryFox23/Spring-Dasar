package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LoginConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testLogin() {
        UserService userService = context.getBean(UserService.class);
        userService.login("admin", "admin");
        userService.login("admin", "admin1");
        userService.login("admin", "admin2");
    }
}
