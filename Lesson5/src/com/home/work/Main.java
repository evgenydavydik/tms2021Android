package com.home.work;

import com.home.work.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Passenger passenger = new Passenger(100, 220, 2300, "audi", 4,
                10, "sedan", 5);
        System.out.println(passenger.toString());
        passenger.infoMaxKmAndLitersFuel(5);
        Civilair civilair = new Civilair(1000, 500, 20000, "Boeng777", 10,
                50, 100, false);
        System.out.println(civilair.toString());
        System.out.println(InputInfoObject.createPessenger().toString());
        System.out.println(InputInfoObject.createCivilair().toString());
        InputInfoObject inputInfoObject = new InputInfoObject();
        inputInfoObject.createCivilair();
        System.out.println(inputInfoObject.civilair.toString());
        inputInfoObject.createPessenger();
        System.out.println(inputInfoObject.passenger.toString());
        System.out.println("Enter time");
        inputInfoObject.passenger.infoMaxKmAndLitersFuel(scanner.nextDouble());
*/
        InputInfoObject inputInfoObject = new InputInfoObject();
        boolean isTrue = true;
        Transport transport;

        do {
            System.out.println("Enter a number from the list below which object you want to create" +
                    "\n 1 - create object Passenger" +
                    "\n 2 - create object Truck" +
                    "\n 3 - create object Civilair" +
                    "\n 4 - create object Militaryair" +
                    "\n 0 - exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    transport = inputInfoObject.createPessenger();
                    System.out.println(transport.toString());
                    workWithObjPassenger((Passenger) transport);
                    break;
                case 2:
                    transport = inputInfoObject.createTruck();
                    System.out.println(transport.toString());
                    workWithObjTruck((Truck) transport);
                    break;
                case 3:
                    transport = inputInfoObject.createCivilair();
                    System.out.println(transport.toString());
                    workWithObjCivilair((Civilair) transport);
                    break;
                case 4:
                    transport = inputInfoObject.createMilitaryair();
                    System.out.println(transport.toString());
                    workWithObjMilitaryairShot((Militaryair) transport);
                    workWithObjMilitaryairEnjection((Militaryair) transport);
                    break;
                case 0:
                    isTrue = false;
                    break;
                default:
                    System.out.println("invalid value entered");
            }
        } while (isTrue);

    }

    public static void workWithObjPassenger(Passenger passenger) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to calculate how many kilometers the car will travel while moving at maximum " +
                "speed and how much fuel it will consume during this time?" +
                "\n 1 - yes" +
                "\n 0 - no");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter time");
                passenger.infoMaxKmAndLitersFuel(scanner.nextDouble());
                break;
            case 0:
                break;
        }
    }

    public static void workWithObjTruck(Truck truck) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to load cargo into a truck?" +
                "\n 1 - yes" +
                "\n 0 - no");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter cargo weight");
                truck.checkCargoLoad(scanner.nextInt());
                break;
            case 0:
                break;
        }
    }

    public static void workWithObjCivilair(Civilair civilair) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to check if the passengers will fit on the plane?" +
                "\n 1 - yes" +
                "\n 0 - no");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Enter the number of passengers");
                civilair.checkCapacity(scanner.nextInt());
                break;
            case 0:
                break;
        }
    }

    public static void workWithObjMilitaryairShot(Militaryair militaryair) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;
        do {
            System.out.println("Want to take a shot?" +
                    "\n 1 - yes" +
                    "\n 0 - no");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    militaryair.shot();
                    break;
                case 0:
                    yesNo = false;
                    break;
            }
        } while (yesNo);

    }

    public static void workWithObjMilitaryairEnjection(Militaryair militaryair) {
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;
        do {
            System.out.println("Want to check for a bailout system?" +
                    "\n 1 - yes" +
                    "\n 0 - no");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    militaryair.ejection();
                    break;
                case 0:
                    yesNo = false;
                    break;
            }
        } while (yesNo);

    }

}
