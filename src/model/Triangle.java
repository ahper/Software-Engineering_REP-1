package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape{
    @Override
    public void Draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(Color.BLUE);
        graphicsContext.fillPolygon(new double[] {150,150,300}, new double[]{50,150,150}, 3);
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
