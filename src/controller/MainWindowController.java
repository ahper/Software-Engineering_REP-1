package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.input.MouseEvent;
import model.Shape;
import model.modelShapes.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {
    @FXML ListView listViewShape, listViewEffect;
    @FXML Canvas myCanvas;
    @FXML ColorPicker colorPickerShape, colorPickerStroke;
    @FXML TextField tFStrokeWidth;
    private ObservableList<Shape> itemsShape;
    private ObservableList<Effect> itemsEffect;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        itemsShape = FXCollections.observableArrayList(new Rectangle(), new Circle(), new Triangle(),
                new Line(), new QuadraticCurve(), new Pentagon());
        listViewShape.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listViewShape.setItems(itemsShape);

        itemsEffect = FXCollections.observableArrayList(
                new DropShadow(), new GaussianBlur(), new Reflection(), new BoxBlur(), new Lighting(), new Shadow());
        listViewEffect.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listViewEffect.setItems(itemsEffect);
        listViewEffect.setCellFactory(lve -> new ListCell<Effect>() {
            @Override
            protected void updateItem(Effect item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null && !empty) {
                    setText(item.getClass().getSimpleName());
                } else {
                    setText("");
                }
            }
        });
    }

    public void OnMouseClickCanvas(MouseEvent mouseEvent) {
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        int indexShape = GetIndexListView(listViewShape);
        int indexEffect = GetIndexListView(listViewEffect);
        Shape shape = (Shape) itemsShape.get(indexShape).clone();
        shape.setEffect(itemsEffect.get(indexEffect));
        shape.setColor(colorPickerShape.getValue());
        shape.setStroke(colorPickerStroke.getValue());
        shape.setStrokeWidth(GetValueTextField());
        shape.setXY(mouseEvent.getX(), mouseEvent.getY());
        shape.draw(gc);
    }

    public void OnBtnClear() {
        GraphicsContext gc = myCanvas.getGraphicsContext2D();
        gc.setEffect(null);
        gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
    }

    private int GetIndexListView(ListView listView) {
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index == -1) {
            return 0;
        }
        return index;
    }

    private double GetValueTextField() {
        double value = 0;
        try {
            value = Double.parseDouble(tFStrokeWidth.getText());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
}
