package factory;

import models.*;
import enums.VehicleType;

public class VehicleFactory{
    public static Vehicle createVehicle(VehicleType type, String number, String owner){
        switch (type){
            case CAR: return new Car(number,owner);
            case BIKE: return new Bike(number,owner);
            case TRUCK: return new Truck(number,owner);
            default: return null;
        }
    }
} 