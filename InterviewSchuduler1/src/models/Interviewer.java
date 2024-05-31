package models;
import java.util.ArrayList;
import java.util.List;
public class Interviewer extends User {
    public Interviewer(int id, String name) {
        setId(id);
        setName(name);
    }

    public static List<Interviewer> generateInterviewers(int numberOfInterviewers) {
        List<Interviewer> interviewers = new ArrayList<>();
        for(int i = 0; i < numberOfInterviewers; ++i) {
            interviewers.add(new Interviewer(i, "Interviewer " + i));
        }
        return interviewers;
    }
}
