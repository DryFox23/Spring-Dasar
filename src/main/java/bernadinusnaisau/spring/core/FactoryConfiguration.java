package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@Import({PaymentGatewayClientFactoryBean.class})
public class FactoryConfiguration {
}
