package pattern;

import java.util.ArrayList;

public class MeteoStation {

    private ArrayList<Subscriber> subscribers = new ArrayList<>(6);

    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishEvent(String event) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifySubscriber(event);
        }
    }
}
