package models;
import java.time.LocalDateTime;

public class Ticket{
    private int ticketId;
    private Vehicle vehicle;
    private int slotId;
    private LocalDateTime entryTime;

    public Ticket(int ticketId, Vehicle vehicle, int slotId){
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.slotId = slotId;
        this.entryTime = LocalDateTime.now();
    }
    //getter

    public int getTicketId(){
        return ticketId;
    }
    public Vehicle getvehicle(){
        return vehicle;  
    }
    public int getSlotId(){
        return slotId;
    }
    public LocalDateTime getEntryTime(){
        return entryTime;
    }
}