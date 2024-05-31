package com.snakeandladder.snakeandladder.models;

import com.snakeandladder.snakeandladder.exceptions.InvalidLadderPlacement;
import com.snakeandladder.snakeandladder.exceptions.InvalidSnakePlacement;

import java.util.*;

public class PlaySnakeAndLadder {

    public static void main(String[] args) throws InvalidSnakePlacement, InvalidLadderPlacement {
        Dice dice = new Dice(1);

        // create players
        Player player1 = new Player("Ashish", 1);
        Player player2 = new Player("Amit", 2);

        Queue<Player> allPlayers = new LinkedList<>();
        allPlayers.add(player1);
        allPlayers.add(player2);

        // create snakes on the board
        Snake snake1 = new Snake(99, 3);
        snake1.validate(99, 3);

        Snake snake2 = new Snake(61, 23);
        snake2.validate(61, 23);

        List<Snake> snakes = new ArrayList<>();
        snakes.add(snake1);
        snakes.add(snake2);

        // create ladders on the board
        Ladder ladder1 = new Ladder(12, 41);
        ladder1.validate(12, 41);
        Ladder ladder2 = new Ladder(33, 98);
        ladder2.validate(33, 98);

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(ladder1);
        ladders.add(ladder2);

        // players starting position
        Map<Integer, Integer> playersCurrentPositions = new HashMap<>();
        playersCurrentPositions.put(1, 0);
        playersCurrentPositions.put(2, 0);

        // start the game
        GameBoard gameBoard = new GameBoard(
                dice, allPlayers, snakes,
                ladders, playersCurrentPositions,
                100
        );

        gameBoard.startGame();
    }

}
