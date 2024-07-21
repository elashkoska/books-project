package com.company;

import java.util.HashMap;

public class SpecificKey {

    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "Elena");
        student.put(2, "Bojan");

        if (student.containsKey(5)) {
            System.out.println("Key is present");
        } else
            System.out.println("Not present");
    }

    //same for object
    //containsValue()
}
