package com.company;

public class Person {
    private int age;

    public Person() {
    }

    public void great() {
        System.out.println("Hello");
    }

    //region Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //endregion
}
