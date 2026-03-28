package com.cybersafety.forest.entities;

public class Player {
    private String name;
    private int health;
    private int level;
    private int experience;

    public Player(String name) {
        this.name = name;
        this.health = 100; // default health
        this.level = 1; // default level
        this.experience = 0; // default experience
    }

    public void move(int x, int y) {
        // Logic to move the player to the new coordinates
        System.out.println(name + " moved to coordinates (" + x + ", " + y + ")");
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0; // prevent negative health
        }
        System.out.println(name + " took " + damage + " damage. Current health: " + health);
    }

    public void gainExperience(int exp) {
        experience += exp;
        if (experience >= 100) { // example threshold for level up
            levelUp();
        }
        System.out.println(name + " gained " + exp + " experience. Total experience: " + experience);
    }

    private void levelUp() {
        level++;
        experience = 0; // reset experience upon leveling up
        health += 20; // example increase of health upon leveling up
        System.out.println(name + " leveled up to level " + level + "! Health increased to " + health);
    }

    // Getters and setters (if needed) can be added here
}