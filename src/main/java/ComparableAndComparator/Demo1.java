package ComparableAndComparator;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {11, 343, 54534, 535, 345};
        Arrays.sort(arr);
        System.out.println("The sorted array");
        System.out.println(Arrays.toString(arr));
        String[] names = {"ari", "malice", "montreal", "laval"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        ArrayList<String> fruits = new ArrayList(); // upcasting
        fruits.add("apple");
        fruits.add("Apple");
        fruits.add("aPple");
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
