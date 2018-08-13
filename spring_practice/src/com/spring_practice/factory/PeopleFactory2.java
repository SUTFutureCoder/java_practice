package com.spring_practice.factory;

import com.spring_practice.entity.People;

public class PeopleFactory2 {

    public static People createPeople() {
        People p = new People();
        p.setId(8);
        p.setName("QA8");
        p.setAge(88);
        return p;
    }

}
