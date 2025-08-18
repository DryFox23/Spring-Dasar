package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext context;


    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    }

    @Test
    void testFactory() {
        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals(paymentGatewayClient.getEndpoint(), "http://localhost:8080/paymentGatewayClient");
        Assertions.assertEquals(paymentGatewayClient.getPrivateKey(), "privateKey");
        Assertions.assertEquals(paymentGatewayClient.getPublicKey(), "publicKey");
    }
}
