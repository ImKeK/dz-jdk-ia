package org.example;

import java.util.HashMap;

public class MontyHallSimulation {

    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();

        for (int i = 0; i < 1000; i++) {
            game.playGame(true); // Игрок всегда меняет дверь
        }

        HashMap<String, Integer> results = game.getResults();

        System.out.println("Results after 1000 games with switching doors:");
        System.out.println("Wins: " + results.get("Wins"));
        System.out.println("Losses: " + results.get("Losses"));
    }
}