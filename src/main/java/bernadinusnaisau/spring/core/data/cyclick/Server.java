package bernadinusnaisau.spring.core.data.cyclick;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    public void start(){
        log.info("Server Started");
    }

    @PreDestroy
    public void stop(){
        log.info("Server Stopped");
    }
}
