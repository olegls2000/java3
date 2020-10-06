package pattern;

public class ERR implements Subscriber {
    @Override
    public void notifySubscriber(String event) {
        System.out.println("Err news is transmitting. TV: Weather : " + event);
        System.out.println("Err news is transmitting. WEB: Weather : " + event);
        System.out.println("Err news is transmitting. Radio: Weather : " + event);
    }
}
