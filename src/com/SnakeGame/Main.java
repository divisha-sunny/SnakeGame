package com.SnakeGame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Snake can move in a given direction and when it eats thr food, the length of snake increases.
        // When snake crosses itself, the game will over.
        //Food will be generated at a given interval
        JFrame obj = new JFrame();// This is the window in which our game runs
        Gameplay gameplay = new Gameplay();

        obj.setBounds(10, 10, 905, 700);
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        obj.add(gameplay);
	    }
}

