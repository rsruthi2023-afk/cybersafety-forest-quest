package com.cybersafety.forest.challenges;

/**
 * A generic question class for challenges.
 */
public class Question {
    private String questionText;
    private String[] options;
    private int correctOptionIndex;

    // Constructor
    public Question(String questionText, String[] options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    // Getters
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    // Method to check if an answer is correct
    public boolean isCorrectAnswer(int index) {
        return index == correctOptionIndex;
    }
}