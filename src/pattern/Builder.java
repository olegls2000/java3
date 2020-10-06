package pattern;

public class Builder {
    private Avionica avionica;
    private Wing[] wings;
    private Engine engine;

    public Airplane build() {
        return new Airplane(avionica, wings, engine);
    }

    public Builder setAvionica(Avionica avionica) {
        this.avionica = avionica;
        return this;
    }
    public Builder setWings(Wing[] wings) {
        this.wings = wings;
        return this;
    }
    public Builder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
}
