package com.company;

import java.util.ArrayList;
import java.util.List;

public class Colours {


    public static void main(String[] args) {
        List<String> colours = new ArrayList<String>();
        // colours.add("blue");
        colours.add("red");
        colours.add("blue");
        colours.add("Yellow");
        //add pink on 1 position
        colours.add(1, "pink");
        //update an element in the array
        colours.set(0, "white");
        //remove element
        colours.remove(2);
        //search element
        if (colours.contains("pink")) {
            System.out.println("There is pink colour");
        } else
            System.out.println("there is no red colour");
        for (String count : colours) {
            System.out.println(count);
        }

        // System.out.println("Colours are:" + colours);

    }

}
