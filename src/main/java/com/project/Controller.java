package com.project;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    //Vista1
    @FXML 
    private TextField user_field;
    @FXML 
    private TextField age_field;
    @FXML 
    private Button next_button;
    @FXML 
    private TextArea error_area;

    //Vista2
    @FXML 
    private TextArea output_Text;
    @FXML 
    private Button button_back;



    @FXML //Para que el programa sepa que boton se esta pulsando, se llama igual al metodo que al campo de OnAction en SceneBuilder
    private void botonNextPulsado(ActionEvent event) {
        if (!user_field.getText().isEmpty() && !age_field.getText().isEmpty()) { //Si ambos campos NO estan vacios 
            Main.texto_username = user_field.getText(); //Guardamos en las variables generales nombre y edad
            Main.texto_edad = age_field.getText();
            try {
                Main.cambiarVista("Vistes2.fxml"); //cambiar vista 
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } else { //Si ambos campos estan vacios
            error_area.setText("Has de introducir usuario y contraseña!");
        }
    }

    @FXML 
    private void botonBackPulsado(ActionEvent event) {
        try {
            Main.cambiarVista("Vistes.fxml"); //cambiar vista 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML // Cuando carga cada archivo FXML se ejecuta automaticamente
    public void initialize() { //Initialize nos sirve para inicializar los valores al cambiar de vista
        //En nuestro caso, para printar el texto del output
        if (output_Text != null) { //Esta comprobacion nos sirve para que escribe unicamente cuando exista el textArea del output
            output_Text.setText("Hola " + Main.texto_username + ", tens " + Main.texto_edad + " anys!"); 
        }
    }

    
}
