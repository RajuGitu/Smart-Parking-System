package service;

import models.*;
import enums.*;
import strategy.*;

import java.util.*;

public class ParkingLotService {
    private List<ParkingSlot> slots = new ArrayList<>();
    private Map<Integer, Ticket> activeTickets = new HashMap<>();
    private int ticketCounter = 1;

    public ParkingLotService() {
        for (int i = 1; i <= 35; i++) {
            VehicleType type = (i <= 20) ? VehicleType.BIKE : (i <= 30) ? VehicleType.CAR : VehicleType.TRUCK;
            slots.add(new ParkingSlot(i, type));
        }
    }

    public Ticket parkVehicle(Vehicle v, VehicleType type) {
        for (ParkingSlot slot : slots) {
            if (slot.isVacant() && slot.getType() == type) {
                slot.park(v);
                Ticket ticket = new Ticket(ticketCounter++, v, slot.getSlotId());
                activeTickets.put(ticket.getTicketId(), ticket);
                return ticket;
            }
        }
        return null;
    }

    public boolean unparkVehicle(int ticketId) {
        Ticket ticket = activeTickets.get(ticketId);
        if (ticket != null) {
            for (ParkingSlot slot : slots) {
                if (slot.getSlotId() == ticket.getSlotId()) {
                    slot.unpark();
                    activeTickets.remove(ticketId);

                    long hours = 2;
                    FeeStrategy strategy = getFeeStrategy(slot.getType());
                    double fee = strategy.calculateFee(hours);
                    System.out.println("Parking Fee: Rs. " + fee);
                    return true;
                }
            }
        }
        return false;
    }

    private FeeStrategy getFeeStrategy(VehicleType type) {
        switch (type) {
            case CAR:
                return new CarFeeStrategy();
            case BIKE:
                return new BikeFeeStrategy();
            case TRUCK:
                return new TruckFeeStrategy();
            default:
                throw new IllegalArgumentException("Unknown vechicle type");
        }
    }

    public void displaySlots() {
        for (ParkingSlot slot : slots) {
            System.out.println("Slots " + slot.getSlotId() + " - " + slot.getType() + " - " + slot.getStatus());
        }
    }

}
