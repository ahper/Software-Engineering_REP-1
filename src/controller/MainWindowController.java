
package controller;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class MainWindowController {
    @FXML Canvas myCanvas;
    @FXML Label myLabel;
    @FXML Button btn1, btn2, btn3;

    public void OnBtnClick1() {
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        Rectangle rectangle = new Rectangle(250, 100, 100, 50, Color.RED);
        rectangle.Draw(gc);
        myLabel.setText(rectangle.toString());
    }

    public void OnBtnClick2() {
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        Circle circle = new Circle(250, 50, 100, 100, Color.GREEN);
        circle.Draw(gc);
        myLabel.setText(circle.toString());
    }

    public void OnBtnClick3() {
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        Triangle triangle = new Triangle(300, 75, 200, 75, 3, Color.PURPLE);
        triangle.Draw(gc);
        myLabel.setText(triangle.toString());
    }

    public void OnBtnActionClear(){
        ClearRect();
    }

    public void ClearRect(){
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
    }
}