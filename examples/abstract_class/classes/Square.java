package classes;

public class Square extends Figure {
    private double side;

    public Square(String color, String description, double side) {
        super(color, description);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

}