package com.leo.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equals("Single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
