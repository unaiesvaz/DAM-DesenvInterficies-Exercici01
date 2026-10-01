package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML 
    //Vista1
    private TextField user_field;
    private TextField age_field;
    private Button next_button;
    private TextArea error_area;

    //Vista2
    private TextArea output_Text;
    private Button button_back;

    //Variables generales
    private String texto_username;
    private String texto_edad;
    private String texto_output;


    @FXML
    private void actionAdd(ActionEvent event) {
        texto_username = user_field.getText();
        texto_edad = age_field.getText();
        if (texto_username != "" && texto_edad != "") {
            
        } else {
            error_area.setText("Has de introducir usuario y contraseña!");
        }
    }


    @FXML
    private void siguienteVista() {
        // Código que se ejecutará al pulsar el botón
    }
    
}
