import models.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Interview Will Schedule need some details");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start day time : ");
        int startDayTime = sc.nextInt();

        System.out.println("Enter end day time : ");
        int endDayTime = sc.nextInt();

        System.out.println("Enter start lunch time : ");
        int startLunchTime = sc.nextInt();

        System.out.println("Enter end lunch time : ");
        int endLunchTime = sc.nextInt();

        System.out.println("Enter duration of interview : e.g (1, 2, 3, 4 ...) hrs ");
        int interviewDuration = sc.nextInt();

        System.out.println("Enter number of attendees : ");
        int numberOfAttendees = sc.nextInt();

        System.out.println("Enter number of interviewers : ");
        int numberOfInterviewers = sc.nextInt();

        System.out.println("Enter number of rooms : ");
        int numberOfRooms = sc.nextInt();
//        sc.close();

        List<Room> rooms = Room.generateRooms(numberOfRooms);
        List<Attendee> attendees = Attendee.generateAttendees(numberOfAttendees);
        List<Interviewer> interviewers = Interviewer.generateInterviewers(numberOfInterviewers);

        List<Slot> slots = Slot.generateSlots(
                startDayTime,
                endDayTime,
                startLunchTime,
                endLunchTime,
                interviewDuration
        );

        List<Interview> interviews = InterviewScheduler.interviewScheduler(
                rooms, interviewers, slots, attendees
        );

        for(Interview interview: interviews) {
            System.out.println(interview.toString());
        }

    }
}