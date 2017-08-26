/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

/**
 *
 * @author Minio
 */
public class Kalkulator extends Application 
{

    
    @Override
    public void start(Stage primaryStage) 
    {
        try 
        {
            FXMLLoader loader=new FXMLLoader(); //powołanie obiektu fxml
            loader.setLocation(this.getClass().getResource("/fxml/Gui.fxml")); //ustawienie lokalizcji dla sceny
            SplitPane splitpane=new SplitPane(); //utworzenie splitpane
            splitpane.setOrientation(Orientation.HORIZONTAL);
            
            
            
            splitpane=loader.load(); //załadowanie do stackpane całego wyglądu okna
            
            Scene scene=new Scene(splitpane);
            scene.getStylesheets().add("fxml/gui.css");
            
            
            primaryStage.setResizable(false);
            primaryStage.setScene(scene); //umieszczenie sceny w stage
            primaryStage.setTitle("Kalkulator"); //tytuł dla sceny
            primaryStage.show(); //pokazanie okna
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Kalkulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
    
}
