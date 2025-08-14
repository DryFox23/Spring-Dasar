package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.data.cyclick.CyclickA;
import bernadinusnaisau.spring.core.data.cyclick.CyclickB;
import bernadinusnaisau.spring.core.data.cyclick.CyclickC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclickConfiguration {

    @Bean
    public CyclickA cyclickA(CyclickB cyclickB) {
        return new CyclickA(cyclickB);
    }

    @Bean
    public CyclickB cyclickB(CyclickC cyclickC) {
        return new CyclickB(cyclickC);
    }

    @Bean
    public CyclickC cyclickC(CyclickA cyclickA) {
        return new CyclickC(cyclickA);
    }
}
