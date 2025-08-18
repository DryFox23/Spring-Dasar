package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.factory.PaymentGatewayClientFactoryBean;
import bernadinusnaisau.spring.core.service.MerchentServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MerchentServiceImpl.class})
public class InheritanceConfiguration {
}
