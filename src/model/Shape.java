package model;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    public abstract void Draw(GraphicsContext graphicsContext);
    public abstract String Discriptor();
}
