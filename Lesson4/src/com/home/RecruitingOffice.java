package com.home;

import com.home.model.Address;
import com.home.model.Person;

import java.util.LinkedList;
import java.util.List;

public class RecruitingOffice {
    private PersonRegistry registry;

    public RecruitingOffice(PersonRegistry registry) {
        this.registry = registry;
    }

    public List<Person> getPeople(Address address) {
        List<Person> conscripts = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : conscripts) {
            if (person.getAge() >= 18 && person.getAge() <= 27 && person.getGender().equals("man")) {
                fitPeople.add(person);
            }
        }
        return fitPeople;
    }
}
