package pattern;

public class CNN implements Subscriber {
    @Override
    public void notifySubscriber(String event) {
        System.out.println("CNN news is transmitting. TV: Weather : " + event);
        System.out.println("CNN news is transmitting. WEB: Weather : " + event);
    }
}
