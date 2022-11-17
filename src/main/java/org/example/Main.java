package org.example;
import java.util.ArrayList;
import static org.example.GameHandle.gameHandle;
import static org.example.Instructions.message;
import static org.example.WordGenerator.getRandomWord;

public class Main {
    public static String newWord = getRandomWord().toLowerCase();
    public static String[] underscores = new String[newWord.length()];
    public static String[] wordArray = newWord.toLowerCase().split("");
    public static int lives = 8;
    public static ArrayList<String> usedLetters = new ArrayList<>();
    public static final String REGEX = "[a-zA-Z]";

    public static void main(String[] args) {
        message();
        gameHandle();
    }
}