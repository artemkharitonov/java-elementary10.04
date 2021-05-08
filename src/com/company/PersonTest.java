package com.company;

public class PersonTest {

 public static void main(String[] args) {
    Person person = new Person("Mariana", "Ivanova" , 18);
     System.out.println(person);
     if (person.getAge() >=18) {
         System.out.println("Can buy alcohol");
     } else {
         System.out.println("Go away");
     }

 }
}