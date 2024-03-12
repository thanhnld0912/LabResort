package Model;

import Repositories.CustomerRepository;
import Service.ICustomerService;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class Customer extends Person implements ICustomerService, CustomerRepository {
    private String customerType;
    private String address;

    public Customer(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email, String customerType, String address) {
        super(ID, name, dob, gender, cid, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(){

    }
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }

    @Override
    public void addCustomer(Customer customer) throws IOException {

    }

    @Override
    public List<Customer> getAllCustomers() throws IOException {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) throws IOException {

    }
}