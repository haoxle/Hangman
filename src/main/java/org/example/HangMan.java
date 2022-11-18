package org.example;

public class HangMan {

    public static void getHangman(int lives) {

        if (lives == 6) {
            System.out.println("");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 5) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 4) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |          |");
            System.out.println("  |       (⊂•⊃_⊂•⊃)");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 3) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |          |");
            System.out.println("  |       (⊂•⊃_⊂•⊃)");
            System.out.println("  |         (   )");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 2) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |          |");
            System.out.println("  |       (⊂•⊃_⊂•⊃)");
            System.out.println("  |         (   )");
            System.out.println("  |         /   |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 1) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |          |");
            System.out.println("  |       (⊂•⊃_⊂•⊃)");
            System.out.println("  |        <(   )>");
            System.out.println("  |         /   |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
        if (lives == 0) {
            System.out.println("");
            System.out.println("  ____________");
            System.out.println("  |          |");
            System.out.println("  |       (⊂•⊃_⊂•⊃)            you are");
            System.out.println("  |        <(   )>              a loser.");
            System.out.println("  |         /   |");
            System.out.println("  |");
            System.out.println("  | ");
            System.out.println("__|____");
            System.out.println("");
        }
    }
}
