package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
     /*   Person konstantin = new Person(30, "Konstantin", 178, "man");
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        konstantin.setAddress(konstantinsAddress);
//        konstantin.info();

        Person gleb = new Person(40, "Gleb", 190, "man");
        Address glebsAddress = new Address("Belarus", "Vitebsk");
        gleb.setAddress(glebsAddress);
//        gleb.info();

        Person oleg = new Person(38, "Oleg", 189, "man");
        Address olegsAddress = new Address("Belarus", "Braslav");
        oleg.setAddress(olegsAddress);

        Person vadim = new Person(30, "Vadim", 180, "man");
        Address vadimsAddress = new Address("Belarus", "Smorgon'");
        vadim.setAddress(vadimsAddress);

        Person zhenya = new Person();
        Person elena = new Person();

      */

        List<Person> personsLinks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons to be added\t");
        int countPersons = scanner.nextInt();
        for (int i = 0; i < countPersons; i++) {
            personsLinks.add(new Person());
        }


        PersonRegistry registry = new PersonRegistry(personsLinks);
    /*
        System.out.println(registry.countPeople(new Address("Belarus", "Vitebsk")));
        System.out.println(registry.countPeople(new Address("Belarus", "Krarow")));
        System.out.println(registry.countPeople("Belarus"));
    */
        RecruitingOffice recruitingOffice = new RecruitingOffice(registry);

        System.out.println("Enter city to search fit for service");
        scanner.nextLine();
        String city = scanner.nextLine();

        List<Person> personList = recruitingOffice.getPeople(new Address("Belarus", city));

        System.out.println("List of those fit for service in the city of "+city);
        for (Person person : personList) {
            System.out.println(person.getName());
        }

    }

}