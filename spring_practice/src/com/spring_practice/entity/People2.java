package com.spring_practice.entity;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.util.*;

public class People2 implements MethodReplacer {

    private int id;
    private String name;
    private int age;
    private Dog dog;
    private List<String> hobbies = new ArrayList<String>();
    private Set<String> loves = new HashSet<String>();
    private Map<String, String> works = new HashMap<String, String>();
    private Properties address = new Properties();

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Properties getAddress() {
        return address;
    }

    public void setAddress(Properties address) {
        this.address = address;
    }

    public Map<String, String> getWorks() {
        return works;
    }

    public void setWorks(Map<String, String> works) {
        this.works = works;
    }

    public Set<String> getLoves() {
        return loves;
    }

    public void setLoves(Set<String> loves) {
        this.loves = loves;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", hobbies=" + hobbies +
                ", loves=" + loves +
                ", works=" + works +
                ", address=" + address +
                '}';
    }

    public Dog getDog() {
        Dog dog = new Dog();
        dog.setName("Tom");
        return dog;
    }

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) {
        Dog dog = new Dog();
        dog.setName("Tom");
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People2() {
    }

    public People2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public People2(Dog dog) {
        System.out.println("Consturct");
        this.dog = dog;
    }
}
