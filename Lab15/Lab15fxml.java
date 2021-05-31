package Lab15;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Lab15fxml {
    @FXML
    TextField text= new TextField();

    public void plus(ActionEvent actionEvent) {
        text.setEditable(false);
        if (Integer.parseInt(text.getText())<3)
            text.setText(String.valueOf(Integer.parseInt(text.getText())+1));
    }

    public void minus(ActionEvent actionEvent) {
        if (Integer.parseInt(text.getText())>-5)
            text.setText(String.valueOf(Integer.parseInt(text.getText())-1));
    }
}
