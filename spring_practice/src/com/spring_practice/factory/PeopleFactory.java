package com.spring_practice.factory;

import com.spring_practice.entity.People;

public class PeopleFactory {

    public People createPeople() {
        People p = new People();
        p.setId(6);
        p.setName("QA6");
        p.setAge(6);
        return p;
    }

}
