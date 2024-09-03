package com.evergent.corejava.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *Collections.max() and Collections.min()
These methods return the maximum and minimum elements in the specified collection, according to the natural ordering or a specified comparator.
 */
public class CC5_CollectionsMaxMin {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("hi");
        numbers.add("dee");
        numbers.add("lo");
        numbers.add("gi");
        numbers.add("ko");

        // Finding the maximum element
        String max = Collections.max(numbers);

        // Finding the minimum element
        String min = Collections.min(numbers);

        // Displaying the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}