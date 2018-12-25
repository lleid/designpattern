package com.leo.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> females = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equals("Female")) {
                females.add(person);
            }
        }
        return females;
    }
}
