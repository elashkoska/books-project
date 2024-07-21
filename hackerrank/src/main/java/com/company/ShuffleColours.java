package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleColours {

    public static void main(String args[]) {

        List<String> colours = new ArrayList<>();

        colours.add("GREEN");
        colours.add("WHITE");
        colours.add("BLUE");
        colours.add("RED");
        Collections.shuffle(colours);

        System.out.println("Shuffeled" + colours);

        //reverse elements

        Collections.reverse(colours);
        System.out.println("Reversed elements" + colours);

        //extract portion of an array
        List<String> sub_colours = colours.subList(0, 2);
        System.out.println("Sublist is:" + sub_colours);



    }
}
