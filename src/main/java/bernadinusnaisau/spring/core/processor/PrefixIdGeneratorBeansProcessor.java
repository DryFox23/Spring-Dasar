package bernadinusnaisau.spring.core.processor;

import bernadinusnaisau.spring.core.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrefixIdGeneratorBeansProcessor  implements BeanPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Id Generator Processor for Bean : {}", beanName);
        if (bean instanceof BeanPostProcessor) {
            log.info("Prefix Set Id Generator for Bean : {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setId("prefixIdGenerator : " + idAware.getId());
        }
        return bean;
    }
}
