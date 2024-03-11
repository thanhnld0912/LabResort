package Model;

public class House extends Facility {
    private String houseStandard;
    private int floorNumber;

    public House(String serviceID, String serviceName, double usableArea, double rentalCost, int maximumPeople, String rentalType, String houseStandard, int floorNumber) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPeople, rentalType);
        this.houseStandard = houseStandard;
        this.floorNumber = floorNumber;
    }
    public House(){

    }
    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                ", houseStandard='" + houseStandard + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
