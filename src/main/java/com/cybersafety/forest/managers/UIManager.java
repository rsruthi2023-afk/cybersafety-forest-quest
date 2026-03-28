package com.cybersafety.forest.managers;

import javax.swing.*;
import java.awt.*;

public class UIManager {

    private JFrame frame;
    private JPanel panel;

    public UIManager() {
        frame = new JFrame("Forest Quest");
        panel = new JPanel();
        setupUI();
    }

    private void setupUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());
        panel.setBackground(Color.GREEN);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void renderHUD(String playerHealth, String playerScore) {
        panel.removeAll(); // Clear the panel contents
        JLabel healthLabel = new JLabel("Health: " + playerHealth);
        JLabel scoreLabel = new JLabel("Score: " + playerScore);
        panel.add(healthLabel);
        panel.add(scoreLabel);
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        UIManager uiManager = new UIManager();
        uiManager.renderHUD("100", "0"); // Example HUD display
    }
}