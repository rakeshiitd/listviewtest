/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projavafx.starterapp.model;

import java.text.NumberFormat;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.controlsfx.control.GridCell;

/**
 *
 * @author 5110
 */
public class ColorGridCell2 extends GridCell<Dog> {
    public Rectangle rectangle;
        public Button changeFillButton;
        public Button changeStrokeButton;
        public HBox buttonHBox;

    public ColorGridCell2() {    }
       
    @Override
    public void updateItem(Dog item, boolean empty) {
        super.updateItem(item, empty);
        setEditable(false);
        if (item != null) {
            Label name = new Label(item.name);                           
            Button actionBtn = new Button(item.name);
Button actionBtn2 = new Button(item.name); 
Button actionBtn3 = new Button(item.name); 
            actionBtn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent arg0) {
                    System.out.println("hiiiiiiiii");

                }
            });                     

            GridPane pane = new GridPane();
            pane.getStyleClass().add("gridpane");           
            pane.add(name, 0, 0);
            pane.add(actionBtn, 0, 1);              
            setGraphic(actionBtn3);
        } else {
            setText(null);
            setGraphic(null);
        }
    }   
 }
