package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class AbstractShape {
    private double x, y, length, width;
    private Color color;
    public AbstractShape(double x, double y, double length, double width, Color color){
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public abstract double Area();
    public abstract void Draw(GraphicsContext graphicsContext);
    public abstract String toString();
}
