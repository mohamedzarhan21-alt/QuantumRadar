Traffic Radar System

A Java-based Object-Oriented Programming (OOP) project that simulates a traffic radar system for detecting traffic violations and issuing fines.

Features
Detects seatbelt violations.
Detects speed violations based on vehicle type:
Private cars: maximum speed 80 km/h.
Trucks: maximum speed 60 km/h.
Supports multiple violations for the same vehicle.
Automatically generates a traffic fine with the total penalty amount.
Stores all issued fines.
Generates statistics showing the number of occurrences for each violation type.
Designed using OOP principles with extensible rule-based validation through interfaces.
Technologies
Java
Object-Oriented Programming (OOP)
Interfaces
Collections Framework (List, ArrayList, Map, HashMap)
Project Structure
Main
│
├── CarObservation
├── Violation
├── ViolationRule (Interface)
├── SeatbeltRule
├── PrivateSpeedRule
├── TruckSpeedRule
├── Radar
├── TrafficFine
└── TrafficSystem