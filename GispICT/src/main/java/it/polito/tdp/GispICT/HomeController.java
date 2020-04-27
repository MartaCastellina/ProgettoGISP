/**
 * Sample Skeleton for 'FinestraHome.fxml' Controller Class
 */

package it.polito.tdp.GispICT;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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

    @FXML // fx:id="btnPreleva"
    private Button btnPreleva; // Value injected by FXMLLoader

    @FXML // fx:id="btnInScadenza"
    private Button btnInScadenza; // Value injected by FXMLLoader

    @FXML
    void handleAggiungi(ActionEvent event) throws IOException {

    	Parent secondaSchermataParent=FXMLLoader.load(getClass().getResource("/fxml/InserisciFarmaco.fxml"));
    	Scene secondaSchermataScene=new Scene(secondaSchermataParent);
   //Questa riga prende le informazioni dello stage
    	Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(secondaSchermataScene);
    	window.show();
    }

    @FXML
    void handleCercaFarmaco(ActionEvent event) throws IOException {

    	Parent secondaSchermataParent=FXMLLoader.load(getClass().getResource("/fxml/CercaFarmaco.fxml"));
    	Scene secondaSchermataScene=new Scene(secondaSchermataParent);
   //Questa riga prende le informazioni dello stage
    	Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(secondaSchermataScene);
    	window.show();
    }

    @FXML
    void handleInScadenza(ActionEvent event) {

    }

    @FXML
    void handleMostraMagazzino(ActionEvent event) {

    }

    @FXML
    void handlePreleva(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCercaFarmaco != null : "fx:id=\"btnCercaFarmaco\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnAggiungi != null : "fx:id=\"btnAggiungi\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnStatistiche != null : "fx:id=\"btnStatistiche\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnMagazzinoReparti != null : "fx:id=\"btnMagazzinoReparti\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnPreleva != null : "fx:id=\"btnPreleva\" was not injected: check your FXML file 'FinestraHome.fxml'.";
        assert btnInScadenza != null : "fx:id=\"btnInScadenza\" was not injected: check your FXML file 'FinestraHome.fxml'.";

    }
}
