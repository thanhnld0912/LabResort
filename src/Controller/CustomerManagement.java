package Controller;
import Model.Customer;
import Service.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerManagement {
    private CustomerService customerService;

    public CustomerManagement(CustomerService customerService) {
        this.customerService = customerService;
    }

    public void displayAllCustomers() throws IOException {
        List<Customer> customers = customerService.getAllCustomers();

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            System.out.println("Customer List:");
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        }
    }

    public void addNewCustomer(Customer customer) throws IOException {
        customerService.addCustomer(customer);
        System.out.println("Customer added successfully.");
    }

    public void updateCustomerInformation(Customer customer) throws IOException {
        customerService.updateCustomer(customer);
        System.out.println("Customer information updated successfully.");
    }
}
