package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedColours {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        List<String> moreColours = new ArrayList<>();

        colours.add("red");
        colours.add("blue");
        colours.add("white");

        moreColours.add("gold");
        moreColours.add("silver");

        //sort the list;
        Collections.sort(colours);

        //shuffle elements
        Collections.shuffle(colours);
//copy the list to another moreColours to colours

        Collections.copy(colours, moreColours);
        System.out.println(moreColours);

        System.out.println(colours);
    }
}
