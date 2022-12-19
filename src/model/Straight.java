package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight extends Shape {
    @Override
    public void Draw(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(1);
        graphicsContext.setFill(Color.RED);

        graphicsContext.beginPath();
        graphicsContext.moveTo(250, 50);
        graphicsContext.lineTo(150, 150);
        graphicsContext.stroke();
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
