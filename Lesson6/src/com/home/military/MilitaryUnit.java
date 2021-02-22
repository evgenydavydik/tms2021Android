package com.home.military;

import com.home.military.exceptions.MilitaryUnitIsFullException;
import com.home.military.exceptions.RecruitAlreadyServesException;
import com.home.military.model.Person;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MilitaryUnit {
    private static int unitNumberCounter = 0;
    private final int capacity;
    private final int unitNumber;
    private final Person[] recruitsArray;
    private final List<Person> recruits;
    private int takenPlacesCount = 0;

    public MilitaryUnit(int capacity) {
        this.capacity = capacity;
        unitNumber = unitNumberCounter++;
        recruitsArray = new Person[capacity];
        recruits = new LinkedList<>();
    }

    /**
     * @return true if person was added to the unit, false if unit is full or if person already serves in the unit
     */
    public boolean addRecruitToList(Person person) throws MilitaryUnitIsFullException {
        if (getFreePlacesFromList() == 0) {
            throw new MilitaryUnitIsFullException("Unit number " + unitNumber + " is full");
        }
        boolean recruitExists;
        try {
            recruitExists = doesRecruitAlreadyExists(person, recruits.toArray(new Person[0]));
        } catch (RecruitAlreadyServesException e) {
            e.printStackTrace();
            recruitExists = true;
        }
        if (recruitExists) {
            return false;
        }
        recruits.add(person);
        return true;
    }

    /**
     * @return true if person was added to the unit, false if unit is full or if person already serves in the unit
     */
    public boolean addRecruitToArray(Person person) throws MilitaryUnitIsFullException {
        if (getFreePlacesFromArray() == 0) {
            throw new MilitaryUnitIsFullException("Unit number " + unitNumber + " is full");
        }
        boolean recruitExists;
        try {
            recruitExists = doesRecruitAlreadyExists(person, recruitsArray);
        } catch (RecruitAlreadyServesException e) {
            e.printStackTrace();
            recruitExists = true;
        }
        if (recruitExists) {
            return false;
        }
        recruitsArray[takenPlacesCount++] = person;
        return true;
    }

    private boolean doesRecruitAlreadyExists(Person person, Person[] recruits) throws RecruitAlreadyServesException {
        for (Person recruit : recruits) {
            if (recruit != null && recruit.getName().equals(person.getName())
                    && recruit.getAge() == person.getAge()) {
                throw new RecruitAlreadyServesException("person " + person.getName() + "already serves here");
            }
        }
        return false;
    }

    public void infoRecrutsMilitaryUnit() {
        String[] namesRecruits = new String[recruitsArray.length];
        for (int i = 0; i < recruitsArray.length; i++) {
            if (recruitsArray[i].getSurname()!=null&&recruitsArray[i].getName()!=null){
                namesRecruits[i] = recruitsArray[i].getSurname() + " " + recruitsArray[i].getName();
            }
        }
        System.out.println("-------------------------");
        Arrays.sort(namesRecruits);
        for (int i = 0; i < namesRecruits.length; i++) {
            System.out.println(i + 1 + ". " + namesRecruits[i]);
        }
        System.out.println("-------------------------");
    }


    public int getFreePlacesFromList() {
        return capacity - recruits.size();
    }

    public int getFreePlacesFromArray() {
        return capacity - takenPlacesCount;
    }

    public void printRecruitsFromArray() {
        for (Person person : recruitsArray) {
            System.out.println(person.getName());
        }
    }

    public void printRecruitsFromList() {
        for (Person person : recruits) {
            System.out.println(person.getName());
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getUnitNumber() {
        return unitNumber;
    }
}
