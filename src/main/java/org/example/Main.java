package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.GameHandle.handleGuess;
import static org.example.Instructions.message;
import static org.example.WordGenerator.getRandomWord;

public class Main {
    public static void main(String[] args) {
        message();
        handleGuess();
    }
}