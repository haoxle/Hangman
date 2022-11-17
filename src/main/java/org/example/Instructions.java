package org.example;

import java.util.Arrays;

public class Instructions extends Main {
    public static void message() {
        System.out.println("  (づ｡◕‿‿◕｡)づ   Welcome to Hangman   (●´ω｀●) ");
        Arrays.fill(underscores, "_");
        System.out.println(newWord);
        System.out.println(Arrays.toString(wordArray));
        System.out.println(Arrays.toString(underscores));
    }
}
