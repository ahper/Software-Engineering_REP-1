package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{
    @Override
    public void Draw(GraphicsContext gc) {
        gc.setFill(Color.SKYBLUE);
        gc.fillRect(175, 50, 50, 50);
    }

    @Override
    public String Discriptor() {
        return "Название фигуры: " + this.getClass().getSimpleName();
    }
}
