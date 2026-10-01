package com.project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //Para ejecutar el ejercicio: .\run.ps1 com.project.Main

    //Variables generales
    static String texto_username;
    static String texto_edad;
    static String texto_output;
    
    final int WINDOW_WIDTH = 600;
    final int WINDOW_HEIGHT = 400;

    // Guardamos la ventana para poder cambiar su contenido
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

        // Carrega la vista inicial des del fitxer FXML
        Parent root = FXMLLoader.load(getClass().getResource("/assets/Vistes.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("JavaFX App");
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);
        stage.show();
    }

    public static void cambiarVista(String fxml) throws IOException { //Metodo para alternar entre FXMLs
        Parent root = FXMLLoader.load(Main.class.getResource("/assets/" + fxml) );
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }



    public static void main(String[] args) {
        launch(args);
    }
    
}
