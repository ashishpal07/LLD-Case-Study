package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Room {
    private int id;

    public Room(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Room> generateRooms(int numberOfRooms) {
        List<Room> rooms = new ArrayList<>();
        for(int i = 0; i < numberOfRooms; ++i) {
            rooms.add(new Room(i));
        }
        return rooms;
    }
}
