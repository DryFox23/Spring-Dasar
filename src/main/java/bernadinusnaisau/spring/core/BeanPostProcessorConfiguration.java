package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.aware.IdAware;
import bernadinusnaisau.spring.core.data.Car;
import bernadinusnaisau.spring.core.processor.IdGeneratorBeansPostProcessor;
import bernadinusnaisau.spring.core.processor.PrefixIdGeneratorBeansProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdGeneratorBeansPostProcessor.class,
        PrefixIdGeneratorBeansProcessor.class
})
public class BeanPostProcessorConfiguration {
}
