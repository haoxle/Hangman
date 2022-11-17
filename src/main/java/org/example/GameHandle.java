package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class GameHandle extends Main{

    public static void gameHandle() {
        Arrays.fill(empty, "_");
        System.out.println(newWord);
        System.out.println(Arrays.toString(wordArray));
        System.out.println(Arrays.toString(empty));
        while (lives > 0) {
            Scanner play = new Scanner(System.in);
            String guess = play.nextLine();
            if (Arrays.toString(empty).equals(Arrays.toString(wordArray))) {
                System.out.println("welldone!");
            }
            if (!guess.matches(REGEX)) {
                System.out.println("not a valid character  (◕︵◕)  ");
            } else if (usedLetters.contains(guess)) {
                System.out.println("letter entered already  ✌.ʕʘ‿ʘʔ.✌");
            } else if(newWord.contains(guess.toLowerCase())) {
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
                    empty[i] = guess;
                }
            }
            System.out.println(Arrays.toString(empty));
        }
    }
}

// stops the game when the word matches