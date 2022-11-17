package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.WordGenerator.getRandomWord;

public class GameHandle extends Main{
    static HandleLives handleLives = new HandleLives(8);
    public static String newWord = getRandomWord().toLowerCase();
    public static String[] empty = new String[newWord.length()];
    public static String[] wordArray = newWord.toLowerCase().split("");
    public static ArrayList<String> usedLetters = new ArrayList<>();
    public static final String REGEX = "[a-zA-Z]";

    public static void handleGuess() {
        Arrays.fill(empty, "_");
        System.out.println(newWord);
        System.out.println(Arrays.toString(empty));
        while (handleLives.getLives() > 0 && !winningCondition()) {
            Scanner play = new Scanner(System.in);
            String guess = play.nextLine();
            if (!guess.matches(REGEX)) {
                guess = " ";
                System.out.println("not a valid character  (◕︵◕)  ");
            } else if (usedLetters.contains(guess)) {
                System.out.println("letter entered already  ✌.ʕʘ‿ʘʔ.✌");
            } else if(newWord.contains(guess.toLowerCase())) {
                System.out.println("the letter is there");
                usedLetters.add(guess);
            } else {
                System.out.println("Not part of the word");
                handleLives.reduceLives();
                System.out.println(handleLives.getLives() + " lives left （ミ￣ー￣ミ)");
                usedLetters.add(guess);
            }
            for (int i = 0; i < newWord.length(); i++) {
                if (wordArray[i].contains(guess.toLowerCase())) {
                    empty[i] = guess;
                }
            }
            System.out.println(Arrays.toString(empty));
        }
        System.out.println("You win!");
    }

    private static boolean winningCondition() {
        return Arrays.toString(empty).equals(Arrays.toString(wordArray));
    }

}

// stops the game when the word matches