package Service;
import Model.Customer;

import java.io.IOException;
import java.util.List;
public interface ICustomerService {
    void addCustomer(Customer customer) throws IOException;
    List<Customer> getAllCustomers() throws IOException;
    void updateCustomer(Customer customer) throws IOException;
}
