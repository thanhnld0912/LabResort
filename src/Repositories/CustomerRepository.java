package Repositories;
import Model.Customer;

import java.io.IOException;
import java.util.List;
public interface CustomerRepository {
    void readFile();
    void writeFile();
    void addCustomer(Customer customer) throws IOException;
    List<Customer> getAllCustomers() throws IOException;
    void updateCustomer(Customer customer) throws IOException;
}
