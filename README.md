# Smart Parking System (Java OOP Project)

A fully Object-Oriented programming-based **Smart Parking System** built in Java without any backend or database. This console application manages parking slots, vehicles, and ticketing using advanced Java OOP principles.

---

## 🚀 Features

* Park and unpark vehicles
* Vehicle types: Car, Bike, Truck
* Auto-assign nearest slot
* Generate tickets with entry time
* Strategy pattern for fee calculation
* Factory pattern for vehicle creation
* Easy-to-use console interface

---

## 🧱 OOP Concepts Used

| Concept        | Where it's Used                          |
| -------------- | ---------------------------------------- |
| Class & Object | Every component (Vehicle, Ticket, Slot)  |
| Inheritance    | Car, Bike, Truck inherit from Vehicle    |
| Abstraction    | Abstract Vehicle class                   |
| Encapsulation  | Private fields with getters/setters      |
| Polymorphism   | FeeStrategy Interface implementations    |
| Interface      | FeeStrategy                              |
| Design Pattern | Factory (VehicleFactory), Strategy (Fee) |
| Enum           | VehicleType, SlotStatus                  |

---

## 📁 Project Structure

```
SmartParkingSystem/
├── enums/
│   ├── VehicleType.java
│   └── SlotStatus.java
├── model/
│   ├── Vehicle.java
│   ├── Car.java
│   ├── Bike.java
│   ├── Truck.java
│   ├── ParkingSlot.java
│   └── Ticket.java
├── factory/
│   └── VehicleFactory.java
├── strategy/
│   ├── FeeStrategy.java
│   ├── CarFeeStrategy.java
│   ├── BikeFeeStrategy.java
│   └── TruckFeeStrategy.java
├── service/
│   └── ParkingLotService.java
├── presentation/
│   └── ConsoleUI.java
└── Main.java
```

---

## 🛠️ How to Run

```bash
# Compile
javac Main.java

# Run
java Main.java
```

---

## 🎥 Demo Video

You can watch a walkthrough and demo of the application here:
👉 [Watch the Demo on YouTube](https://www.youtube.com/watch?v=Th4BNEjvGlk)

---

## ✨ Future Enhancements

* GUI using JavaFX or Swing
* File-based or in-memory persistence
* Admin features (add/remove slots)
* Real-time simulation with random vehicle entries

---

## 🧑‍💻 Author

Simran Yelave and Raj Gupta

---
