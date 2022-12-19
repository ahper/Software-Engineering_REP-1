package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    @Override
    public void Draw(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.fillOval(150, 50, 100, 100);
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
