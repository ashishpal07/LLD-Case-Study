import exceptions.ViewingHourIsInvalid;
import models.Subscription;
import models.User;
import models.OTTPlatform;

public class Main {
    public static void main(String[] args) throws ViewingHourIsInvalid {

        OTTPlatform netflix = new OTTPlatform("Netflix", 10, 10);
        OTTPlatform amazonPrime = new OTTPlatform("Amazon Prime", 2, 5);
        OTTPlatform hotstar = new OTTPlatform("Hotstar", 1, 5);

        User user = new User(1L, "Ashish Pal");

        Subscription amazonSubscription = new Subscription(amazonPrime, 2);
        Subscription netflixSubscription = new Subscription(netflix, 10);
//        Subscription hotstarSubscription = new Subscription(hotstar, 100);

        user.addSubscription(amazonSubscription);
        user.addSubscription(netflixSubscription);
//        user.addSubscription(hotstarSubscription);

        System.out.println(user.totalPrice());
    }
}