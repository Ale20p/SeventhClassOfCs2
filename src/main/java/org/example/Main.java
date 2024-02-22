package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers;
        integers = new ArrayList<>();

        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Double> doubles = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits);  // [Apple, Banana, Strawberry]

        fruits.add(0, "AtIndex 0");
        System.out.println(fruits);
        fruits.add(2, "AtIndex 2");
        System.out.println(fruits);

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        fruits.set(2, "Orange");
        System.out.println(fruits);

        fruits.remove(1); // remove the element at index 1
        System.out.println(fruits);
        fruits.remove("Banana"); // remove "Banana"
        System.out.println(fruits);
        fruits.clear(); // remove all elements
        System.out.println(fruits);

        System.out.println(fruits.size()); // 3
        fruits.remove("Banana");
        System.out.println(fruits.size()); // 2
        fruits.add("Orange");
        System.out.println(fruits.size()); // 3

        for (int i = 0; i < fruits.size(); i++) {   // loop through the arrayList
            System.out.println(fruits.get(i) + " ");
        }

        System.out.println(fruits);
        Collections.sort(fruits); // sorts the arrayList
        System.out.println(fruits);

//        for (String animal : animals) {  // enhanced for loop
//            System.out.print(animal);
//            System.out.print(", ");
//        }





    }
}