package models;

import java.util.ArrayList;
import java.util.List;

public class Slot {
    private int startTime;
    private int endTime;

    public Slot(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String toString() {
        return "( start tim " + this.startTime + " to " + this.endTime + ")";
    }

    public static List<Slot> generateSlots(
            int dayStartTIme, int dayEndTime,
            int lunchStartTime,
            int lunchEndTime,
            int intervalTime
    ) {
        int time = dayStartTIme;
        List<Slot> slots = new ArrayList<>();

        while (time != dayEndTime) {
            int startTime = time;
            int endTime = time + intervalTime;

            if(endTime >= lunchStartTime && endTime <= lunchEndTime) {
                time = lunchEndTime;
                continue;
            }



            if(dayEndTime <= endTime) {
                break;
            }

            slots.add(new Slot(startTime, endTime));
            time = endTime;
        }

        return slots;
    }
}
