package org.example;

import javax.management.relation.RelationTypeNotFoundException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.WordGenerator.getRandomWord;

public class Main {
    public static String newWord = getRandomWord();
    public static String[] underscores = new String[newWord.length()];
    public static String[] wordArray = newWord.split("");
    public static int lives = 8;

    public static void main(String[] args) {
        System.out.println("  (づ｡◕‿‿◕｡)づ   Welcome to Hangman   (●´ω｀●) ");
        Arrays.fill(underscores, "_");
        System.out.println(newWord);
        System.out.println(Arrays.toString(wordArray));
        System.out.println(Arrays.toString(underscores));
        while (lives > 0) {
            Scanner play = new Scanner(System.in);
            String guess = play.nextLine();

            if (newWord.contains(guess.toLowerCase())) {

                System.out.println("the letter is there");
            } else System.out.println("nope");
        }

    }
}