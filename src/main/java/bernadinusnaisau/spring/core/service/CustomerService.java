package bernadinusnaisau.spring.core.service;

import bernadinusnaisau.spring.core.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
}
