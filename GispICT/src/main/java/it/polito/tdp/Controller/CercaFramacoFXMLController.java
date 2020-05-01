/**
 * Sample Skeleton for 'CercaFarmaco.fxml' Controller Class
 */

package it.polito.tdp.Controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.SplitMenuButton;

public class CercaFramacoFXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Invia"
    private Button Invia; // Value injected by FXMLLoader

    @FXML // fx:id="Indietro"
    private Button Indietro; // Value injected by FXMLLoader

    @FXML // fx:id="Cerca"
    private Button Cerca; // Value injected by FXMLLoader

    @FXML // fx:id="Menureparti"
    private MenuButton Menureparti; // Value injected by FXMLLoader

    @FXML // fx:id="MenuQuantita"
    private SplitMenuButton MenuQuantita; // Value injected by FXMLLoader

    @FXML
    void handleCercaAction(ActionEvent event) {

    }

    @FXML
    void handleIndietroAction(ActionEvent event) {

    }

    @FXML
    void handleInviaAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Invia != null : "fx:id=\"Invia\" was not injected: check your FXML file 'CercaFarmaco.fxml'.";
        assert Indietro != null : "fx:id=\"Indietro\" was not injected: check your FXML file 'CercaFarmaco.fxml'.";
        assert Cerca != null : "fx:id=\"Cerca\" was not injected: check your FXML file 'CercaFarmaco.fxml'.";
        assert Menureparti != null : "fx:id=\"Menureparti\" was not injected: check your FXML file 'CercaFarmaco.fxml'.";
        Menureparti.hide();
        assert MenuQuantita != null : "fx:id=\"MenuQuantita\" was not injected: check your FXML file 'CercaFarmaco.fxml'.";

    }
}
