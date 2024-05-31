package models;

public class Interview {
    private int id;
    private Attendee attendee;
    private Interviewer interviewer;
    private Slot slot;
    private Room room;

    public Interview(int id, Attendee attendee, Interviewer interviewer, Slot slot, Room room) {
        this.id = id;
        this.attendee = attendee;
        this.interviewer = interviewer;
        this.slot = slot;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Attendee getAttendee() {
        return attendee;
    }

    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    public Interviewer getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(Interviewer interviewer) {
        this.interviewer = interviewer;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String toString() {
        return "( Room id " + this.room.getId() + " interviewer name " + this.interviewer.getName() + " attendee name " + this.attendee.getName() + " slot is (" + this.slot.getStartTime() + " to " + this.slot.getEndTime() + "))";
    }
}
