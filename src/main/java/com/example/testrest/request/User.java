package com.example.testrest.request;

public class User {

    public  User(){

    }

    public User(String email, String age, String name) {
        this.email = email;
        this.age = age;
        this.name = name;
    }

    private  String email;
    private String age;
    private  String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
