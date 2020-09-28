package model;

public enum Color {
    RED("Red", "#2313u132"),
    BLACK("Black", "#2313u132"),
    GREEN("Green", "#2313u132");

    private String name;
    private String code;

    Color(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
