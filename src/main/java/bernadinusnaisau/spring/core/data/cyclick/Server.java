package bernadinusnaisau.spring.core.data.cyclick;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    public void start(){
        log.info("Server Started");
    }

    public void stop(){
        log.info("Server Stopped");
    }
}
