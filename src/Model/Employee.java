package Model;

import Repositories.EmployeeRepository;
import Service.IEmployeeService;

import java.util.Date;

public class Employee extends Person  {

    private String level;
    private String position;
    private double salary;

    public Employee(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email, String level,String position, double salary) {
        super(ID, name, dob, gender, cid, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(){

    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", level='" + level + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}