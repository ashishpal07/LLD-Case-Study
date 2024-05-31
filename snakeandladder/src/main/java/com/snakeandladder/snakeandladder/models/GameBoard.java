package com.snakeandladder.snakeandladder.models;

import java.util.*;

public class GameBoard {

    private Dice dice;
    private Queue<Player> nextTurn;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    Map<Integer, Integer> playerCurrentPosition;
    private int boardSize;

    public GameBoard(
            Dice dice, Queue<Player> nextTurn,
            List<Snake> snakes, List<Ladder> ladders,
            Map<Integer, Integer> playerCurrentPosition,
            int boardSize
    ) {
        this.boardSize = boardSize;
        this.ladders = ladders;
        this.snakes = snakes;
        this.nextTurn = nextTurn;
        this.playerCurrentPosition = playerCurrentPosition;
        this.dice = dice;
    }

    void startGame() {
        while(nextTurn.size() > 1) {
            Player player = nextTurn.poll();
            int currPosition = playerCurrentPosition.get(player.getId());
            int diceValue = dice.rollDice();
            int nextCell = currPosition + diceValue;

            if(nextCell > boardSize) {
                nextTurn.add(player);
            } else if (nextCell == boardSize) {
                System.out.println("Player " + player.getId() + " : "
                        + player.getName() + " has won the game!"
                );
            } else {
                int[] nextPosition = new int[1];
                nextPosition[0] = nextCell;

                for(Snake snake: snakes) {
                    if(snake.getStartPoint() == nextCell) {
                        nextPosition[0] = snake.getEndPoint();
                    }
                }

                if(nextPosition[0] != nextCell) {
                    System.out.println(
                            "Player " + player.getId() + " : "
                                    + player.getName() + " has bitten by snake at "
                                    + nextCell + " and come to " + nextPosition[0]
                    );
                }

                for(Ladder ladder: ladders) {
                    if(ladder.getStartPoint() == nextCell) {
                        nextPosition[0] = ladder.getEndPoint();
                    }
                }

                if(nextPosition[0] != nextCell) {
                    System.out.println(
                            "Player " + player.getId() + " : "
                                    + player.getName() + " has climb ladder at "
                                    + nextCell + " and come to " + nextPosition[0]
                    );
                }

                if(nextPosition[0] == boardSize) {
                    System.out.println("Player " + player.getId() + " : "
                            + player.getName() + " has won the game!"
                    );
                } else {
                    playerCurrentPosition.put(player.getId(), nextPosition[0]);
                    System.out.println(
                            "Player " + player.getId() + " : " + player.getName()
                                    + " is at position " + nextPosition[0]
                    );
                    nextTurn.add(player);
                }
            }
        }
    }

}
