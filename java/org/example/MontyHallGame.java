package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Random;

@Getter
@Setter
public class MontyHallGame {

    private final Random random = new Random();
    private int wins = 0;
    private int losses = 0;

    public void playGame(boolean switchDoor) {
        // Случайно выбираем дверь с призом
        int prizeDoor = random.nextInt(3);
        // Игрок выбирает дверь
        int playerChoice = random.nextInt(3);

        // Определяем, какую дверь откроет ведущий
        int hostChoice;
        do {
            hostChoice = random.nextInt(3);
        } while (hostChoice == prizeDoor || hostChoice == playerChoice);

        // Если игрок решает поменять дверь
        if (switchDoor) {
            playerChoice = 3 - playerChoice - hostChoice; // Меняем выбор
        }

        // Проверяем, выиграл ли игрок
        if (playerChoice == prizeDoor) {
            wins++;
        } else {
            losses++;
        }
    }

    public HashMap<String, Integer> getResults() {
        HashMap<String, Integer> results = new HashMap<>();
        results.put("Wins", wins);
        results.put("Losses", losses);
        return results;
    }
}