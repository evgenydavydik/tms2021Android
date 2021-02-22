package com.home.military;

import com.home.military.exceptions.InvalidNameSurnameException;
import com.home.military.model.Address;
import com.home.military.model.Person;

public class Main {
    public static void main(String[] args) {
        Address konstantinsAddress = new Address("Belarus", "Vitebsk");
        Person konstantin = new Person(konstantinsAddress, 20, "Konstantin", "Davydov", Person.MALE);
        AdjustmentInfoPerson.correctPerson(konstantin);

        Address glebsAddress = new Address("Belarus", "Vitebsk");
        Person gleb = new Person(glebsAddress, 25, "Gleb", "Pup kin", Person.MALE);
        AdjustmentInfoPerson.correctPerson(gleb);

        Address olegsAddress = new Address("Belarus", "Braslav");
        Person oleg = new Person(olegsAddress, 38, "Oleg", "Ivanov", Person.MALE);
        AdjustmentInfoPerson.correctPerson(oleg);

        Address vadimsAddress = new Address("Belarus", "Smorgon'");
        Person vadim = new Person(vadimsAddress, 27, "Vadim", "Suprun", Person.MALE);
        AdjustmentInfoPerson.correctPerson(vadim);

        Address olgasAddress = new Address("Belarus", "Vitebsk'");
        Person olga = new Person(olgasAddress, 20, "Olga", "Pashkevich", Person.FEMALE);
        AdjustmentInfoPerson.correctPerson(olga);

        PersonRegistry registry = new PersonRegistry(new Person[]{gleb, konstantin, oleg, vadim, olga});

        MilitaryOffice office = new MilitaryOffice(registry,
                new MilitaryUnit[]{new MilitaryUnit(2), new MilitaryUnit(3)});
        System.out.println(office.getCapacity());
        office.addFitPeopleToTheUnits(new Address("Belarus", "Vitebsk"));
        System.out.println(office.getCapacity());
        office.getMilitaryInfo();
    }

}
