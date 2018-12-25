package com.leo.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));


        Criteria male = new CriteriaMale();

        List<Person> list = male.meetCriteria(persons);
        for (Person p : list) {
            System.out.println(p.getName() + "," + p.getGender() + "," + p.getMaritalStatus());
        }


        List<Person> list2 = persons.stream().filter(p -> {
            if (p.getGender().equals("Female")) {
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        for (Person p : list2) {
            System.out.println(p.getName() + "," + p.getGender() + "," + p.getMaritalStatus());
        }
    }
}
