package com.cybersafety.forest.managers;

public class GameState {

    private int score;
    private int currentLevel;
    private boolean gameOver;

    public GameState() {
        this.score = 0;
        this.currentLevel = 1;
        this.gameOver = false;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        if (!gameOver) {
            score += points;
        }
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void levelUp() {
        if (!gameOver) {
            currentLevel++;
        }
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver() {
        this.gameOver = true;
    }

    @Override
    public String toString() {
        return "GameState{" +
                "score=" + score +
                ", currentLevel=" + currentLevel +
                ", gameOver=" + gameOver +
                '}';
    }
}