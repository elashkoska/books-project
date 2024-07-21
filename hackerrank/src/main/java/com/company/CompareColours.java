package com.company;

import java.util.ArrayList;
import java.util.List;

public class CompareColours {

    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        names.add("Elena");
        names.add("Jonas");
        names.add("Bojan");

        List<String> names2 = new ArrayList<>();

        names2.add("Bojan");
        names2.add("Filip");
        names2.add("Sandra");

        List<String> names3 = new ArrayList<>();

        for (String e : names)
            names3.add(names2.contains(e) ? "YES" : "NO");
        System.out.println(names3);

    }
}
