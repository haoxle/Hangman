package org.example;

import java.util.Scanner;

import static org.example.GameHandle.handleGuess;
import static org.example.Instructions.message;


public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String userInput = "";
        do {
            handleGuess();
            System.out.print("Do you want to play again ([Y] / n)? ");
            userInput = inputScanner.nextLine();
            System.out.println(userInput);
        } while (userInput.equals("Y") || userInput.equals(""));

    }
}