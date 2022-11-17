package org.example;

import javax.management.relation.RelationTypeNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.WordGenerator.getRandomWord;

public class Main {
    public static String newWord = getRandomWord().toLowerCase();
    public static String[] underscores = new String[newWord.length()];
    public static String[] wordArray = newWord.toLowerCase().split("");
    public static int lives = 8;
    public static ArrayList<String> usedLetters = new ArrayList<>();
    private static final String REGEX = "[a-zA-Z]";

    public static void main(String[] args) {
        System.out.println("  (づ｡◕‿‿◕｡)づ   Welcome to Hangman   (●´ω｀●) ");
        Arrays.fill(underscores, "_");
        System.out.println(newWord);
        System.out.println(Arrays.toString(wordArray));
        System.out.println(Arrays.toString(underscores));
        while (lives > 0) {
            Scanner play = new Scanner(System.in);
            String guess = play.nextLine();
            if (!guess.matches(REGEX)) {
                System.out.println("not a valid character  (◕︵◕)  ");
            } else if (usedLetters.contains(guess)) {
                System.out.println("letter entered already  ✌.ʕʘ‿ʘʔ.✌");
            } else if (newWord.contains(guess.toLowerCase())) {
                System.out.println("the letter is there");
                usedLetters.add(guess);
            } else {
                System.out.println("Not part of the word");
                lives--;
                System.out.println(lives + " lives left （ミ￣ー￣ミ)");
                usedLetters.add(guess);
            }
            for (int i = 0; i < newWord.length(); i++) {
                if (wordArray[i].contains(guess.toLowerCase())) {
                    underscores[i] = guess;
                }
            }
            System.out.println(Arrays.toString(underscores));
        }
    }
}