package classes;

public abstract class Figure {
    private String color;
    private String description;

    public Figure(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public abstract double getArea();

    public String getColor() {
        return this.color;
    }

    public String getDescription() {
        return this.description;
    }
}