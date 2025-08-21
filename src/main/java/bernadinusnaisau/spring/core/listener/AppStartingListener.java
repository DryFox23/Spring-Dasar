package bernadinusnaisau.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationFailedEvent> {

    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        log.info("Starting After Application Failed");
    }
}
