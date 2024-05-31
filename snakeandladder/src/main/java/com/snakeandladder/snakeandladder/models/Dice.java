package com.snakeandladder.snakeandladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dice {
    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    int rollDice() {
        return ((int) (Math.random() * (6 * numberOfDice - numberOfDice))) + numberOfDice;
    }
}
