package com.home.work;

import com.home.work.model.Civilair;
import com.home.work.model.Militaryair;
import com.home.work.model.Passenger;
import com.home.work.model.Truck;

import java.util.Scanner;

public class InputInfoObject {

    Passenger passenger;
    Truck truck;
    Militaryair militaryair;
    Civilair civilair;

    public Passenger createPessenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter power \t");
        int power = scanner.nextInt();
        System.out.print("Enter top speed \t");
        int top_speed = scanner.nextInt();
        System.out.print("Enter mass \t");
        int mass = scanner.nextInt();
        System.out.print("Enter brand \t");
        String brand = scanner.next();
        System.out.print("Enter count wheel \t");
        int countWheel = scanner.nextInt();
        System.out.print("Enter fuel consumption \t");
        int fuelConsumption = scanner.nextInt();
        System.out.print("Enter type of body \t");
        String typeOfBody = scanner.next();
        System.out.print("Enter count passengers \t");
        int countPassengers = scanner.nextInt();
        return passenger = new Passenger(power, top_speed, mass, brand, countWheel, fuelConsumption, typeOfBody, countPassengers);
    }

    public Truck createTruck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter power \t");
        int power = scanner.nextInt();
        System.out.print("Enter top speed \t");
        int top_speed = scanner.nextInt();
        System.out.print("Enter mass \t");
        int mass = scanner.nextInt();
        System.out.print("Enter brand \t");
        String brand = scanner.next();
        System.out.print("Enter count wheel \t");
        int countWheel = scanner.nextInt();
        System.out.print("Enter fuel consumption \t");
        int fuelConsumption = scanner.nextInt();
        System.out.print("Enter load capacity \t");
        int loadCapacity = scanner.nextInt();
        return truck = new Truck(power, top_speed, mass, brand, countWheel, fuelConsumption, loadCapacity);
    }

    public Civilair createCivilair() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter power \t");
        int power = scanner.nextInt();
        System.out.print("Enter top speed \t");
        int top_speed = scanner.nextInt();
        System.out.print("Enter mass \t");
        int mass = scanner.nextInt();
        System.out.print("Enter brand \t");
        String brand = scanner.next();
        System.out.print("Enter wingspan \t");
        int wingspan = scanner.nextInt();
        System.out.print("Enter minimum runway length for take-off \t");
        int minLengthRunway = scanner.nextInt();
        System.out.print("Enter count passengers \t");
        int countPassengers = scanner.nextInt();
        System.out.print("Enter business class \t");
        boolean isBusinessClass = scanner.nextBoolean();
        return civilair = new Civilair(power, top_speed, mass, brand, wingspan, minLengthRunway, countPassengers, isBusinessClass);
    }

    public Militaryair createMilitaryair() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter power \t");
        int power = scanner.nextInt();
        System.out.print("Enter top speed \t");
        int top_speed = scanner.nextInt();
        System.out.print("Enter mass \t");
        int mass = scanner.nextInt();
        System.out.print("Enter brand \t");
        String brand = scanner.next();
        System.out.print("Enter wingspan \t");
        int wingspan = scanner.nextInt();
        System.out.print("Enter minimum runway length for take-off \t");
        int minLengthRunway = scanner.nextInt();
        System.out.print("Enter count missiles \t");
        int countMissiles = scanner.nextInt();
        System.out.print("Enter ejection system \t");
        boolean isEjectionSystem = scanner.nextBoolean();
        return militaryair = new Militaryair(power, top_speed, mass, brand, wingspan, minLengthRunway, isEjectionSystem, countMissiles);
    }

}
