package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElements {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();

        colours.add("YELLOW");
        colours.add("GREEN");
        colours.add("BLUE");

        Collections.swap(colours, 0, 1);
        System.out.println(colours);

        //join two arrays
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("3");
        numbers.add("12");

        numbers.addAll(3, colours);
        System.out.println(numbers);


        //remove all empty list
        numbers.removeAll(numbers);
        System.out.println(numbers);

        //clone an arraylist
       // List<String> xyz = (ArrayList<String>)numbers.clone();

    }
}
