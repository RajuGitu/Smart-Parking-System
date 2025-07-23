package models;

import enums.SlotStatus;
import enums.VehicleType;

public class ParkingSlot {
    // encapsulation
    private int slotId;
    private VehicleType type;
    private SlotStatus status;
    private Vehicle parkedVehicle;

    // constructor
    public ParkingSlot(int slotId, VehicleType type) {
        this.slotId = slotId;
        this.type = type;
        this.status = SlotStatus.VACANT;
    }

    public void park(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
        this.status = SlotStatus.OCCUPIED;
    }

    public void unpark() {
        this.parkedVehicle = null;
        this.status = SlotStatus.VACANT;
    }

    public boolean isVacant() {
        return this.status == SlotStatus.VACANT;
    }

    // getter
    public int getSlotId() {
        return slotId;
    }

    public VehicleType getType() {
        return type;
    }

    public SlotStatus getStatus() {
        return status;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
