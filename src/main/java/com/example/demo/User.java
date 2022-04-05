package com.example.demo;

public class User {
    private String name;
    private int age;
    private String hobby;

    public User(String name, int age, String hobby){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
    }

    public void setName(String name){this.name=name;};

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getHobby(){
        return hobby;
    }

}
