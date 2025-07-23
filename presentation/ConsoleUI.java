package presentation;
import java.util.Scanner;
import service.*;
import models.*;
import enums.*;
import factory.*;

public class ConsoleUI{

    private ParkingLotService parkingService = new ParkingLotService();
    private Scanner scanner = new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("\n--- Smart Parking System ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Unpark Vehicle");
            System.out.println("3. Show Parking Slots");
            System.out.println("4. Exit");
            System.out.println("Enter choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1: parkVehicle(); break;
                case 2: unparkVehicle(); break;
                case 3: parkingService.displaySlots(); break;
                case 4: 
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");    
            }
        }
    }

    private void parkVehicle(){
        System.out.print("Enter Vehicle Type (CAR/BIKE/TRUCK): ");
        VehicleType type = VehicleType.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter Vehicle Number: ");
        String number = scanner.nextLine();
        System.out.print("Enter Owner Name: ");
        String owner = scanner.nextLine();
        Ticket ticket = parkingService.parkVehicle(VehicleFactory.createVehicle(type,number,owner),type);
        if(ticket != null){
            System.out.println("Vehicle parked successfully. Ticket ID: " + ticket.getTicketId());
        } else {
            System.out.println("No slots available for " + type);
        }
    }

    private void unparkVehicle(){
        System.out.print("Enter Ticket ID:");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        boolean success = parkingService.unparkVehicle(ticketId);
        if(success){
            System.out.println("Vehicle unparked successfully.");
        } else {
            System.out.println("Invalid Ticket ID or vehicle not found.");
        }
    }
}