package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.HangMan.getHangman;
import static org.example.Instructions.message;
import static org.example.WordGenerator.getRandomWord;


public class GameHandle {
    static HandleLives handleLives = new HandleLives(7);
    public static String newWord = getRandomWord().toLowerCase();
    public static String[] empty = new String[newWord.length()];
    public static ArrayList<String> usedLetters = new ArrayList<>();
    public static String[] wordArray = newWord.toLowerCase().split("");
    public static final String REGEX = "[a-zA-Z]";


    public static void handleGuess() {
        message(empty);
        Scanner play = new Scanner(System.in);

            while (handleLives.getLives() != 0 && !winningCondition()) {

                String guess = play.nextLine();
                if (!guess.matches(REGEX)) {
                    guess = " ";
                    System.out.println("Please enter letters only!  (◕︵◕)  ");
                } else if (usedLetters.contains(guess)) {
                    System.out.println("letter entered already  ✌.ʕʘ‿ʘʔ.✌");
                } else if (newWord.contains(guess.toLowerCase())) {
                    usedLetters.add(guess);
                } else {
                    handleLives.reduceLives();
                    getHangman(handleLives.getLives());
                    System.out.println("");
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
            if (winningCondition()) {
                System.out.println("Well done!  ヽ(ｏ`皿′ｏ)ﾉ ");
            }
            System.out.println("");
            System.out.println("Your word was: " + newWord);
        }



    private static boolean winningCondition() {
        return Arrays.toString(empty).equals(Arrays.toString(wordArray));
    }

}
