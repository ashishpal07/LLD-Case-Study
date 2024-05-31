package models;

import java.util.ArrayList;
import java.util.List;

public class InterviewScheduler {
    public static List<Interview> interviewScheduler(
            List<Room> rooms,
            List<Interviewer> interviewers,
            List<Slot> slots,
            List<Attendee> attendees
    ) {
        // interview can be schedule for attendee only when room, interviewer & slot will exist
        List<Interview> interviews = new ArrayList<>();
        int attendeeIndex = 0;
        int interviewId = 0;
        for(Slot slot: slots) {
            int interviewersIndex = 0;
            for(Room room: rooms) {
                if(interviewersIndex < interviewers.size() && attendeeIndex < attendees.size()) {
                    interviews.add(
                            new Interview(
                                    interviewId,
                                    attendees.get(attendeeIndex),
                                    interviewers.get(interviewersIndex),
                                    slot,
                                    room
                            )
                    );
                    ++interviewId;
                    ++interviewersIndex;
                    ++attendeeIndex;
                }
            }
        }

        return interviews;
    }
}
