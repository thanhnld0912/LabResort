package Model;

import Repositories.ContractRepository;
import Service.IContractService;

public class Contract implements IContractService, ContractRepository {
    public String contractNumber;
    public String bookingID;
    public double deposit;
    public double totalMoney;

    public Contract(String contractNumber, String bookingID, double deposit, double totalMoney) {
        this.contractNumber = contractNumber;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }
    public Contract(){

    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
