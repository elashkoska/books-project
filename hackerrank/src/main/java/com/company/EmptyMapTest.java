package com.company;

import java.util.HashMap;

public class EmptyMapTest {

    public static void main(String args[]) {

        HashMap<String, String> names = new HashMap<>();
        names.put("Elena", "Lashkoska");
        names.put("Bojan", "Trajkovski");

        boolean result = names.isEmpty();

        System.out.println("Result of the map is" + result);

        names.clear();

        result = names.isEmpty();
        System.out.println("Result is" + result);

        HashMap<String, String> new_names = new HashMap<>();
        new_names = (HashMap) names.clone();
        System.out.println("The new names contain copy of names" + new_names);
    }
}
