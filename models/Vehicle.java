package models;

// abstract isliye kyu ki iska object nahi banega
public abstract class Vehicle {
    private String vehicleNumber;
    private String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }
}