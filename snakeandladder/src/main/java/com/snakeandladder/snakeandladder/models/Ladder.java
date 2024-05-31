package com.snakeandladder.snakeandladder.models;

import com.snakeandladder.snakeandladder.exceptions.InvalidLadderPlacement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ladder {

    private int startPoint;
    private int endPoint;

    public Ladder(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    void validate(int startPoint, int endPoint) throws InvalidLadderPlacement {
        if(startPoint >= endPoint) {
            throw new InvalidLadderPlacement("Start point should be less than end point");
        }
    }

}
