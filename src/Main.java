import View.CustomerValidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        String ID = "KH-2023";
        String name = "John Doe";
        Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
        String cid = "123456789";
        String phoneNumber = "0123456789";

        try {
            CustomerValidation.validateCustomer(ID, name, dob, cid, phoneNumber);
            System.out.println("Dữ liệu đầu vào hợp lệ.");
            // Tiếp tục thêm khách hàng vào file customer.csv
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
            // Xử lý lỗi, thông báo cho người dùng nhập lại dữ liệu hợp lệ
        }
    }
}