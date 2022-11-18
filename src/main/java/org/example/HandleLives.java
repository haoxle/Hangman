package org.example;

public class HandleLives {
    private int lives;

    public HandleLives(int lives){
        setLives(lives);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void reduceLives() {
        --lives;
    }
}
