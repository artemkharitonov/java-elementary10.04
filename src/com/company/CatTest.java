package com.company;

public class CatTest {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age = 3;
        cat.color = "Gray";

        System.out.println("Cat: " + cat.name + ", " +  cat.age + ", " + cat.color);
        Cat cat1 = new Cat("John", 5 , "black");
        System.out.println("Cat: " + cat1.name + ", " +  cat1.age + ", " + cat1.color);
    }
}
