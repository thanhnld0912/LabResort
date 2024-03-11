package Repositories;

import Model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Repository implements EmployeeRepository{
    public ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public void readFile(){
        String filePath = "C:/Users/PC/Desktop/card.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                try {
                    Date dob = dateFormat.parse(tokens[2]);
                    Employee employee = new Employee(tokens[0],tokens[1],dob,tokens[3],tokens[4],tokens[5],tokens[6],tokens[7],tokens[8],120.0);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeFile() {

    }
}
