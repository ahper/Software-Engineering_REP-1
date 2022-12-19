package model;

public class ShapeFactory {

    public Shape createShape(int numberOfSides) {
        if (numberOfSides == 0) {
            return new Circle();

        } else if (numberOfSides == 1) {
            return new Straight();

        } else if (numberOfSides == 2) {
            return new Angle();

        } else if (numberOfSides == 3) {
            return new Triangle();
        }
        else if (numberOfSides == 4) {
            return new Square();
        }
        else if (numberOfSides == 5) {
            return new Polygon();
        }
        else return null;
    }
}