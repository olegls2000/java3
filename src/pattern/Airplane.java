package pattern;

public class Airplane {
    private Avionica avionica;
    private Wing[] wings;
    private Engine engine;

    public Airplane(Avionica avionica, Wing[] wings, Engine engine) {
        this.avionica = avionica;
        this.wings = wings;
        this.engine = engine;
    }
}
