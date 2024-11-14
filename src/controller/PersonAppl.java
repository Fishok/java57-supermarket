package controller;

import model.Person;

public class PersonAppl {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 30);
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("Are person1 and person2 equals? " + person1.equals(person2));
        Person person3 = new Person("Alice", 30);
        System.out.println("=======================================");
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());
        System.out.println("Are person1 and person3 equals? " + person1.equals(person3));
        System.out.println("=======================================");
        person2.setName("Alice");
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("Are person1 and person2 equals? " + person1.equals(person2));

    }
}
