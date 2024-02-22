package org.example;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class TestStaticBinding {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting
        animal.sound(); // static binding
    }
}
