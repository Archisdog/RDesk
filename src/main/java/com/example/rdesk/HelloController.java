package com.example.rdesk;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    public CheckBox checkBox1;
    public TextField textField1;
    public Label label1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        if (checkBox1.isSelected()) {
            welcomeText.setText("Welcome to JavaFX Application!");
        } else {
            welcomeText.setText("Don't selected checkbox");
            label1.setText(textField1.getText());
        }
    }
}