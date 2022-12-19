package model.modelShapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.Effect;
import javafx.scene.paint.Color;
import model.Shape;

public class Pentagon extends Shape {
    Color colorShape, colorStroke;
    double x,y, strokeWidth;
    Effect effect;
    public Pentagon() {type = "Пятиугольник";}
    @Override
    public void setColor(Color color) {colorShape = color;}

    @Override public void setStroke(Color color) {colorStroke = color;}

    @Override public void setStrokeWidth(double value) {strokeWidth = value;}

    @Override
    public void setEffect(Effect effect) {this.effect = effect;}

    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(colorShape);
        gc.setStroke(colorStroke);
        gc.setLineWidth(strokeWidth);
        gc.setEffect(effect);
        double[] pent1 = { x, x - 35, x - 20, x + 20, x + 35 };
        double[] pent2 = { y, y + 40, y + 75, y + 75, y + 40 };
        gc.strokePolygon(pent1, pent2, 5);
    }

    @Override
    public String toString() {return type;}
}
