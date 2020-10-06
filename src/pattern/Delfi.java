package pattern;

public class Delfi implements Subscriber {
    @Override
    public void notifySubscriber(String event) {
        System.out.println("Delfi news is transmitting. WEB: Weather : " + event);
    }
}
