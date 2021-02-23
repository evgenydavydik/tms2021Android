package com.home.military.model;

import com.home.military.AdjustmentInfoPerson;
import com.home.military.exceptions.InvalidNameSurnameException;

import java.util.Locale;
import java.util.Random;

public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";

    private Address address;
    private int age;
    private String name;
    private String surname;
    //enum is definitely the better option here
    private String sex = FEMALE;

    public Person() {
    }

    public Person(Address address, int age, String name, String surname, String sex) {
        setAddress(address);
        setAge(age);
        setName(name);
        setSurname(surname);
        if (MALE.equals(sex) || FEMALE.equals(sex)) {
            this.sex = sex;
        }
    }

    public void info() {
        Random random = new Random();
        if (random.nextInt(40) < 20) {
            System.out.println("Hello, my name is " + name);
        } else {
            secureInfo();
        }
        System.out.println("I am living in " + address.toString());
    }

    private void secureInfo() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old");
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().replace(name.charAt(0), name.toUpperCase(Locale.ROOT).charAt(0));
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.trim().replace(surname.charAt(0), surname.toUpperCase(Locale.ROOT).charAt(0));
    }

    public String getSex() {
        return sex;
    }

}
