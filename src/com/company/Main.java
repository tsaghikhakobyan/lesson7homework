package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.great();
        Student student = new Student();
        student.setAge(21);
        student.great();
        System.out.println(student.getAge());
        Teacher teacher = new Teacher();
        teacher.setAge(28);
        teacher.great();
        teacher.explain();
    }
}