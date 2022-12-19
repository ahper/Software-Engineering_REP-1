package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape{
    @Override
    public void Draw(GraphicsContext gc) {
        gc.setLineWidth(10);
        gc.setStroke(Color.GRAY);
        gc.strokePolygon(new double[]{25, 250}, new double[]{25,25},2);
        gc.strokePolygon(new double[]{30, 30}, new double[]{25,250},2);
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
