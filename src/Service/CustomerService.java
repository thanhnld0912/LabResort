package Service;
import Model.Customer;
import Repositories.CustomerRepository;

import java.io.IOException;
import java.util.List;
public class CustomerService implements ICustomerService{
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public CustomerService(){}

    @Override
    public void addCustomer(Customer customer) throws IOException {
        customerRepository.addCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() throws IOException {
        return customerRepository.getAllCustomers();
    }

    @Override
    public void updateCustomer(Customer customer) throws IOException {
        customerRepository.updateCustomer(customer);
    }
}
