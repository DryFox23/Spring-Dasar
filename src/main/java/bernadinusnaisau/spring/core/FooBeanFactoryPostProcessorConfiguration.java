package bernadinusnaisau.spring.core;

import bernadinusnaisau.spring.core.processor.FooBeanFactoryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooBeanFactoryPostProcessor.class
})
public class FooBeanFactoryPostProcessorConfiguration {
}
