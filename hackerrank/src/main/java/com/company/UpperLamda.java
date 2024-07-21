package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UpperLamda {

    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("white");
        colours.add("BLACk");
        colours.add("red");
//
        // List<String> abc = colours.stream().sorted().collect(Collectors.toList());
//        System.out.println(abc);

        Collections.reverse(colours);
        System.out.println(colours);

        List<String> example = colours.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println("EXAMPLE" + example);

        List<String> duplicate = colours.stream().map(s -> s.toLowerCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(duplicate);

        List<String> upperLetters = colours.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());


        //list of intewgers filter odd and even

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(1);
        numbers.add(3);
        numbers.add(10);
        numbers.add(8);
        numbers.add(77);

        List<Integer> collect = numbers.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> reverse = numbers.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println("REVERSe" + reverse);
    }
}
