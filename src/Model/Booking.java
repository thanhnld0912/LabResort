package Model;

import Repository.BookingRepository;
import Service.IBookingService;

import java.util.Date;

public class Booking implements IBookingService, BookingRepository {
    private String bookingId;
    private Date bookingDate;
    private Date beginDay;
    private Date endDay;
    private String customerID;
    private String serviceID;

    public Booking(String bookingId, Date bookingDate, Date beginDay, Date endDay, String customerID, String serviceID) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.beginDay = beginDay;
        this.endDay = endDay;
        this.customerID = customerID;
        this.serviceID = serviceID;
    }
    public Booking(){

    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(Date beginDay) {
        this.beginDay = beginDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", bookingDate=" + bookingDate +
                ", beginDay=" + beginDay +
                ", endDay=" + endDay +
                ", customerID='" + customerID + '\'' +
                ", serviceID='" + serviceID + '\'' +
                '}';
    }
}
