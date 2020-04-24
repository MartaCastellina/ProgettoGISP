package it.polito.tdp.GispICT;
/**
 * Sample Skeleton for 'FinestraHome.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCercaFarmaco"
    private Button btnCercaFarmaco; // Value injected by FXMLLoader

    @FXML // fx:id="btnAggiungi"
    private Button btnAggiungi; // Value injected by FXMLLoader

    @FXML // fx:id="btnStatistiche"
    private Button btnStatistiche; // Value injected by FXMLLoader

    @FXML // fx:id="btnMagazzinoReparti"
    private Button btnMagazzinoReparti; // Value injected by FXMLLoader

    @FXML
    void handleAggiungi(ActionEvent event) {

    }

    @FXML
    void handleCercaFarmaco(ActionEvent event) {

    }

    @FXML
    void handleMostraMagazzino(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCercaFarmaco != null : "fx:id=\"btnCercaFarmaco\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnAggiungi != null : "fx:id=\"btnAggiungi\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnStatistiche != null : "fx:id=\"btnStatistiche\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnMagazzinoReparti != null : "fx:id=\"btnMagazzinoReparti\" was not injected: check your FXML file 'FinestraHome.fxml'.";

    }
}
