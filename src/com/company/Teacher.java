package com.company;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }
    public void explain(){
        System.out.println("Explanation begins");
    }

    //region Getters and Setters

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //endregion
}
