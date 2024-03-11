package Model;

public class Room extends Facility {
    private String freeServiceIncluded;

    public Room(String serviceID, String serviceName, double usableArea, double rentalCost, int maximumPeople, String rentalType, String freeServiceIncluded) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }
    public Room(){

    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }
}
