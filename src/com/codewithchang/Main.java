package com.codewithchang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(dnaPair("ACTG"));
    }

    /* {A: T, T: A, C: G, G: C} */
    public static List<List<String>> dnaPair(String chain) {
        HashMap<String, String> dnaMapping = new HashMap<>() {{
            put("A", "T");
            put("T", "A");
            put("C", "G");
            put("G", "C");
        }};

        List<List<String>> dnaChain = new ArrayList<>();
        String[] chainArray = chain.split("");
        for (var letter : chainArray) {
            dnaChain.add(Arrays.asList(letter, dnaMapping.get(letter) ));
//            switch (letter) {
//                case "A":
//                    dnaChain.add(Arrays.asList("A", "T"));
//                    break;
//                case "T":
//                    dnaChain.add(Arrays.asList("T", "A"));
//                    break;
//                case "c":
//                    dnaChain.add(Arrays.asList("C", "G"));
//                    break;
//                case "G":
//                    dnaChain.add(Arrays.asList("G", "C"));
//                    break;
//            }
        }
        return dnaChain;
    }
}
