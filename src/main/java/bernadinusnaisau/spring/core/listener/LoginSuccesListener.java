package bernadinusnaisau.spring.core.listener;

import bernadinusnaisau.spring.core.event.LoginSuccesEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoginSuccesListener implements ApplicationListener<LoginSuccesEvent> {

    @Override
    public void onApplicationEvent(LoginSuccesEvent event) {
        log.info("Succes Login for user: " + event.getUser());
    }
}
