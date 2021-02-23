package com.home.military;

import com.home.military.exceptions.InvalidNameSurnameException;
import com.home.military.model.Person;

public class AdjustmentInfoPerson {
    private static boolean checkSpaceInFI(String str) throws InvalidNameSurnameException {
        if (str.indexOf(" ") != -1) {
            throw new InvalidNameSurnameException("Invalid name or surname!");
        }
        return true;
    }

    public static Person correctPerson(Person person) {
        try {
            checkSpaceInFI(person.getSurname());
        } catch (InvalidNameSurnameException e) {
            e.printStackTrace();
            person.setSurname("UnknownSurname");
        }
        try {
            checkSpaceInFI(person.getName());
        } catch (InvalidNameSurnameException e) {
            e.printStackTrace();
            person.setName("UnknownName");
        }
        return person;
    }
}
