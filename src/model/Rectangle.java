package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends AbstractShape{
    private double x, y, length, width;
    private Color color;

    public Rectangle(double x, double y, double length, double width, Color color) {
        super(x, y, length, width, color);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public void Draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.beginPath();
        gc.rect(x, y, length, width);
        gc.fill();
        gc.stroke();
    }

    @Override
    public String toString(){
        return "Название фигуры: Прямоугольник. " + "Площадь фигуры: " + Area();
    }
}
