package org.example;

public class HangMan extends GameHandle {

    public static void getHangman() {

        if (handleLives.getLives() == 6) {
            System.out.println("");
            System.out.println("__|____");
            System.out.println("");
        }
        if (handleLives.getLives() == 5) {
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
        if (handleLives.getLives() == 4) {
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
        if (handleLives.getLives() == 3) {
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
        if (handleLives.getLives() == 2) {
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
        if (handleLives.getLives() == 1) {
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
        if (handleLives.getLives() == 0) {
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
