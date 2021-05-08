package com.company;

public class Cat {
    String name;
    int age;
    String color;

    public Cat() {
        this.name = "Deafult cat ";
        this.age = 3;
        this.color = "No color";
        System.out.println("Cat is created");
    }
    public Cat(String name, int age , String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name) {
        this.name = name;
    }
}
