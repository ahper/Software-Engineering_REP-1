package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends AbstractShape{
    private double x, y, length, width;
    private int point;
    private Color color;

    public Triangle(double x, double y, double length, double width, int point, Color color) {
        super(x, y, length, width, color);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.point = point;
        this.color = color;
    }

    @Override
    public double Area() {
        return (length * width) / 2;
    }

    @Override
    public void Draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(color);
        graphicsContext.fillPolygon(new double[] {x, length * (0.5), length}, new double[] {y, width, 0}, point);
    }

    @Override
    public String toString(){
        return "Название фигуры: Треугольник. " + "Площадь фигуры: " + Area();
    }
}
