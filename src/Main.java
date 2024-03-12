import View.CustomerValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.Customer;
import Repositories.CustomerRepository;
import Service.CustomerService;

public class Main {
    public static void main(String[] args) throws ParseException {
        String ID = "KH-2023";
        String name = "John Doe";
        Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        String gender = "Male";
        String cid = "123456789";
        String phoneNumber = "0123456789";
        String email = "abc@gmail.com";
        String customerType = "Diamond";
        String address = "230 Huye";

        try {
            CustomerValidation.validateCustomer(ID, name, dob, gender ,cid, phoneNumber, email, customerType, address);
            System.out.println("Valid input data.");

            // Create a new customer object
            Customer customer = new Customer(String ID, String name, Date dob, String gender, String cid, String phoneNumber,
                    String email, String customerType, String address);

            // Create a CustomerRepository object
            CustomerRepository customerRepository = new CustomerRepository();

            // Create a CustomerService object
            CustomerService customerService = new CustomerService(customerRepository);

            // Add the customer to the repository
            customerService.addCustomer(customer);

            System.out.println("Customer added successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the error and prompt the user to enter valid data
        }
    }
}