package com.kn.treeset;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private String name;
    private ArrayList<Integer> hand;
    private int score;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    public void drawCard() {
        int card = (int) (Math.random() * 13) + 1;
        hand.add(card);
    }

    public void reset() {
        hand.clear();
    }

    public int getScore() {
        return hand.stream().mapToInt(Integer::intValue).sum();
    }

    public void incrementScore() {
        score++;
    }

    public int getRoundScore() {
        return score;
    }
    public ArrayList<Integer> getHand() {
        return hand;
    }
    public String getName() {
        return name;
    }
}
