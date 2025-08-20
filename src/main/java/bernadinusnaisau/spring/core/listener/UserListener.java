package bernadinusnaisau.spring.core.listener;

import bernadinusnaisau.spring.core.event.LoginSuccesEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserListener {

    @EventListener
    public void onLoginSuccesEvent1(LoginSuccesEvent event) {
        log.info("Succes Login for user2: " + event.getUser());
    }

    @EventListener
    public void onLoginSuccesEvent2(LoginSuccesEvent event) {
        log.info("Succes Login for user3: " + event.getUser());
    }

    @EventListener
    public void onLoginSuccesEven3(LoginSuccesEvent event) {
        log.info("Succes Login for user4: " + event.getUser());
    }
}
