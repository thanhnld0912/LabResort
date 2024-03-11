package View;

import java.util.Calendar;
import java.util.Date;

public class Validation {
    public boolean validateEmployeeId(String employeeID) {
        return employeeID.matches("NV-\\d{4}");
    }
    public boolean validateName(String name) {
        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            if (!Character.isUpperCase(part.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public boolean validateAge(Date dob) {
        // Tính tuổi từ ngày sinh
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dobCalendar.get(Calendar.MONTH) ||
                (today.get(Calendar.MONTH) == dobCalendar.get(Calendar.MONTH) &&
                        today.get(Calendar.DAY_OF_MONTH) < dobCalendar.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age >= 18;
    }

    public boolean validateCid(String cid) {
        // Kiểm tra CMND có đủ 9 hoặc 12 số không
        return cid.length() == 9 || cid.length() == 12;
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("0\\d{9}");
    }

    public boolean validateSalary(double salary) {
        return salary > 0;
    }
}
