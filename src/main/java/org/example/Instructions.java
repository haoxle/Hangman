package org.example;

import java.util.Arrays;

public class Instructions extends GameHandle{
    public static void message() {
        System.out.println("");
        System.out.println("  (づ｡◕‿‿◕｡)づ   Welcome to Hangman   (●´ω｀●)");
        System.out.println("");
        System.out.println("Some instructions: Type a letter and hit enter, if the letter is correct it will appear in the box, if it doesnt you lose a life!");
        System.out.println("ONE Letter at a time! ╚(•⌂•)╝  ╚(•⌂•)╝");
        System.out.println("");
        Arrays.fill(empty, "_");
        System.out.println(Arrays.toString(empty));
    }
}
