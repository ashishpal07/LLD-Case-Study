package models;

import java.util.ArrayList;
import java.util.List;

public class Attendee extends User {

    public Attendee(int id, String name) {
        this.setId(id);
        this.setName(name);
    }
    public static List<Attendee> generateAttendees(int numberOfAttendees) {
        List<Attendee> attendees = new ArrayList<>();
        for(int i = 0; i < numberOfAttendees; ++i) {
            attendees.add(new Attendee(i, "Ashish " + i));
        }
        return attendees;
    }
}
