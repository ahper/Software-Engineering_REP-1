package model;

import javafx.scene.canvas.GraphicsContext;

public class Polygon extends Shape{
    @Override
    public void Draw(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(1d);
        graphicsContext.strokePolygon(new double[] { 210, 165, 190, 235, 260},
                new double[] { 50, 100, 150, 150, 100 }, 5);
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
