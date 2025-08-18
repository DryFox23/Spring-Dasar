package bernadinusnaisau.spring.core.service;

import bernadinusnaisau.spring.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    @Getter
    @Qualifier(value = "normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Autowired
    @Getter
    @Qualifier(value = "premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
