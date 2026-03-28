package com.cybersafety.forest.challenges;

public abstract class Challenge {

    private String challengeName;
    private String description;

    public Challenge(String challengeName, String description) {
        this.challengeName = challengeName;
        this.description = description;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public String getDescription() {
        return description;
    }

    public abstract void executeChallenge();
}