package models;

import models.Subscription;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String name;

    private List<Subscription> subscriptions;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void addSubscription(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public double totalPrice() {
        double amount = 0.0;
        for(Subscription subscription : this.subscriptions) {
            System.out.println(subscription.calculatePrice() + " for " + subscription.getOttPlatform().getName());
            amount += subscription.calculatePrice();
        }
        return amount;
    }
}
