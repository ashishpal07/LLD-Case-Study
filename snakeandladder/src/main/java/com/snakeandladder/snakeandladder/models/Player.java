package com.snakeandladder.snakeandladder.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

}
