package View;

import java.util.Date;
import java.util.regex.Pattern;

public class CustomerValidation {
    public static void validateCustomer(String ID, String name, Date dob, String cid, String phoneNumber) throws Exception {
        // Kiểm tra mã khách hàng
        if (!Pattern.matches("KH-\\d{4}", ID)) {
            throw new Exception("Mã khách hàng không hợp lệ. Vui lòng nhập theo định dạng KH-YYYY.");
        }

        // Kiểm tra tên khách hàng
        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            if (!Pattern.matches("[A-Z][a-z]*", part)) {
                throw new Exception("Tên khách hàng không hợp lệ. Vui lòng viết hoa chữ cái đầu của mỗi từ.");
            }
        }

        // Kiểm tra tuổi
        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dob.getTime();
        long age = ageInMillis / 1000 / 60 / 60 / 24 / 365;
        if (age < 18) {
            throw new Exception("Khách hàng phải đủ 18 tuổi.");
        }

        // Kiểm tra số CMND
        if (!Pattern.matches("\\d{9}|\\d{12}", cid)) {
            throw new Exception("Số CMND không hợp lệ. Vui lòng nhập 9 hoặc 12 số.");
        }

        // Kiểm tra số điện thoại
        if (!Pattern.matches("0\\d{9}", phoneNumber)) {
            throw new Exception("Số điện thoại không hợp lệ. Vui lòng nhập bắt đầu từ 0 và đủ 10 số.");
        }
    }
}

