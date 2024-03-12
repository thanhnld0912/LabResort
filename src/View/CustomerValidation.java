package View;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class CustomerValidation {
    public static void validateCustomer(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email, String customerType, String address) throws Exception {
        if (!Pattern.matches("KH-\\d{4}", ID)) {
            throw new Exception("Mã khách hàng không hợp lệ. Vui lòng nhập theo định dạng KH-YYYY.");
        }

        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            if (!Pattern.matches("[A-Z][a-z]*", part)) {
                throw new Exception("Tên khách hàng không hợp lệ. Vui lòng viết hoa chữ cái đầu của mỗi từ.");
            }
        }

        Date currentDate = new Date();
        long ageInMillis = currentDate.getTime() - dob.getTime();
        long age = ageInMillis / 1000 / 60 / 60 / 24 / 365;
        if (age < 18) {
            throw new Exception("Khách hàng phải đủ 18 tuổi.");
        }

        if (!Pattern.matches("\\d{9}|\\d{12}", cid)) {
            throw new Exception("Số CMND không hợp lệ. Vui lòng nhập 9 hoặc 12 số.");
        }

        if (!Pattern.matches("0\\d{9}", phoneNumber)) {
            throw new Exception("Số điện thoại không hợp lệ. Vui lòng nhập bắt đầu từ 0 và đủ 10 số.");
        }

        if (!Pattern.matches("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+", email)) {
            throw new Exception("Địa chỉ email không hợp lệ. Vui lòng nhập theo định dạng example@example.com.");
        }

        if (!Pattern.matches("Regular|Premium", customerType)) {
            throw new Exception("Loại khách hàng không hợp lệ. Vui lòng chọn Regular hoặc Premium.");
        }

        if (address.isEmpty()) {
            throw new Exception("Địa chỉ không được để trống.");
        }
    }
}

