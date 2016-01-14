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

/**
 *
 * @author 5110
 */
public class MoneyFormatCell extends ListCell<String> {
    public Rectangle rectangle;
        public Button changeFillButton;
        public Button changeStrokeButton;
        public HBox buttonHBox;

     public MoneyFormatCell() {    }
       
    @Override
    public void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);
        setEditable(false);
        if (item != null) {
            Label name = new Label(item.toString());                           
            Button actionBtn = new Button(item.toString());            
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
            setGraphic(pane);
        } else {
            setText(null);
            setGraphic(null);
        }
    }   
 }
