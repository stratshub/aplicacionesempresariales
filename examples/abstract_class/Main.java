import classes.Figure;
import classes.Square;

public class Main {

    public static void main(String[] args) {
        /*This is gona be a error because a abstract
        class can not be instantiaded
        Figure figure = new Figure();*/

        Square square = new Square("Blue", "This is a square blue", 3);
        
        System.out.println("Information of square\nColor: " + square.getColor() +
        "\nDescription: " + square.getDescription() + "\nArea: " + square.getArea());
    }

}