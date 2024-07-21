package com.company;

import java.util.HashMap;
import java.util.Map;

public class KeyValues {

    public static void main(String[] args) {
        HashMap<String, String> studentData = new HashMap<>();
        studentData.put("ABC", "123");
        studentData.put("XYZ", "456");

        for (Map.Entry<String, String> x : studentData.entrySet()) {

            System.out.println(x.getKey() + ":" + x.getValue());
        }

        System.out.println("Size of the map is: " + studentData.size());


        HashMap<String, String> duplicateMap = new HashMap<>(studentData);

        for (Map.Entry<String, String> y : duplicateMap.entrySet()) {
            System.out.println(y.getKey() + ":" + y.getValue());
        }

        //remove all mappings
        duplicateMap.clear();
        System.out.println("Empty map" + duplicateMap);
    }
}
