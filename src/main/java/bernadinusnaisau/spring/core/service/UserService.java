package bernadinusnaisau.spring.core.service;

import bernadinusnaisau.spring.core.data.User;
import bernadinusnaisau.spring.core.event.LoginSuccesEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSucess(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccesEvent(new User(username)));
            return true;
        }
        return false;
    }

    private boolean isLoginSucess(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
