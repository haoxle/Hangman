package org.example;

import java.util.ArrayList;

public class WordGenerator {
    public static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("Instantiate");
        words.add("Class");
        words.add("Morning");
        words.add("Object");
        words.add("Pig");
        words.add("Refactoring");
        words.add("Christmas");
        words.add("Canister");
    }

    public static String getRandomWord() {
        return words.get((int) (Math.random() * (words.size())));
    }
}
