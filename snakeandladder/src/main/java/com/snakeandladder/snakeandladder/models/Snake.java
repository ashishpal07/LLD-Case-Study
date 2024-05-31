package com.snakeandladder.snakeandladder.models;

import com.snakeandladder.snakeandladder.exceptions.InvalidSnakePlacement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snake {
    private int startPoint;
    private int endPoint;

    public Snake(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    void validate(int startPoint, int endPoint) throws InvalidSnakePlacement {
        if(startPoint <= endPoint) {
            throw new InvalidSnakePlacement("Start point of snake should be greater than end point!");
        }
    }
}
