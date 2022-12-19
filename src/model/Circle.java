package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends AbstractShape{
    private double x, y, length, width;
    private Color color;
    public Circle(double x, double y, double length, double width, Color color) {
        super(x, y, length, width, color);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double Area() {
        var R = length / (2 * Math.PI);
        return Math.round(Math.PI * Math.pow(R, 2));
    }

    @Override
    public void Draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillOval(x, y, length, width);
    }

    @Override
    public String toString(){
        return "Название фигуры: Круг. " + "Площадь фигуры: " + Area();
    }
}
