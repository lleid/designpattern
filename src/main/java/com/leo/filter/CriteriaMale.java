package com.leo.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> males = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equals("Male")) {
                males.add(person);
            }
        }
        return males;
    }
}
