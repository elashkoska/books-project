package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyArray {

    public static void main(String arg[]) {
        List<String> colours = new ArrayList<>();

        colours.add("GREEN");
        colours.add("BLUE");
        colours.add("GREY");



        if (colours.isEmpty())
        {   System.out.println("Empty array");}
        else
            System.out.println("Not empty");
    }

}
