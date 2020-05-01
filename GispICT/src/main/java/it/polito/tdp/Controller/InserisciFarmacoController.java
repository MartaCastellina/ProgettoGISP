/**
 * Sample Skeleton for 'InserisciFarmaco.fxml' Controller Class
 */

package it.polito.tdp.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.GispICT.Farmaco;
import it.polito.tdp.GispICT.MartaModel;
import it.polito.tdp.GispICT.Reparto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InserisciFarmacoController {
	private MartaModel model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtIdFarmaco"
    private TextField txtIdFarmaco; // Value injected by FXMLLoader

    @FXML // fx:id="txtNomeFarmaco"
    private TextField txtNomeFarmaco; // Value injected by FXMLLoader

    @FXML // fx:id="qty"
    private Spinner<?> qty; // Value injected by FXMLLoader

    @FXML // fx:id="date"
    private DatePicker date; // Value injected by FXMLLoader

    @FXML // fx:id="comboReparti"
    private ComboBox<?> comboReparti; // Value injected by FXMLLoader

    @FXML // fx:id="btnBack"
    private Button btnBack; // Value injected by FXMLLoader

    @FXML // fx:id="btnConfirm"
    private Button btnConfirm; // Value injected by FXMLLoader
    @FXML // fx:id="allertText"
    private TextArea allertText; // Value injected by FXMLLoader
    @FXML // fx:id="btnVerifica"
    private Button btnVerifica; // Value injected by FXMLLoader


    @FXML
    void handleConfirm(ActionEvent event) throws IOException {
    	   	
    	Reparto selezionato=(Reparto) comboReparti.getValue();
    	//System.out.println(selezionato.toString());  	
    	//model.setRepartoSelezionato(selezionato);
    	
    	
    	try {

			if (txtIdFarmaco.getText().isEmpty()) {
				allertText.setText("Add the ID");
				return;
			}

			if (comboReparti.getValue() == null) {
				allertText.setText("Select a ward");
				return;
			}
		

			// Prendo l'ID in input
			int idFarmaco = Integer.parseInt(txtIdFarmaco.getText());

			// (opzionale)
			
			Farmaco farmaco = model.getFarmaco(idFarmaco);
			if (farmaco == null) {
				allertText.setText("There is no pharma with this ID, please add a new one");
				return;
			}

			txtNomeFarmaco.setText(farmaco.getNome());
			
/*
			// Ottengo il nome del corso
			Corso corso = comboCorso.getValue();

			// Controllo se lo studente Ã¨ giÃ  iscritto al corso
			if (model.isStudenteIscrittoACorso(studente, corso)) {
				txtResult.appendText("Studente giÃ  iscritto a questo corso");
				return;
			}

			// Iscrivo lo studente al corso.
			// Controllo che l'inserimento vada a buon fine
			if (!model.inscriviStudenteACorso(studente, corso)) {
				txtResult.appendText("Errore durante l'iscrizione al corso");
				return;
			} else {
				txtResult.appendText("Studente iscritto al corso!");
			}
			*/

		} catch (NumberFormatException e) {
			allertText.setText("Insert an IDPharma correct");
		} catch (RuntimeException e) {
			allertText.setText("ERRORE DI CONNESSIONE AL DATABASE!");
		}
    	
    	
    	
    	
    	
    	
    	//Da qui in poi è per passare alla prossima Scena
    	Parent secondaSchermataParent=FXMLLoader.load(getClass().getResource("/fxml/FarmacoInserito.fxml"));
    	Scene secondaSchermataScene=new Scene(secondaSchermataParent);
    	//Questa riga prende le informazioni dello stage
    	Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(secondaSchermataScene);
    	window.show();
   	

    }

    @FXML
    void handleGoBack(ActionEvent event) throws IOException {
    	Parent secondaSchermataParent=FXMLLoader.load(getClass().getResource("/fxml/FinestraHome.fxml"));
    	Scene secondaSchermataScene=new Scene(secondaSchermataParent);
    	//Questa riga prende le informazioni dello stage
    	Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
    	window.setScene(secondaSchermataScene);
    	window.show();

    }
    @FXML
    void handleVerifica(ActionEvent event) {
    	try {

			if (txtIdFarmaco.getText().isEmpty()) {
				txtIdFarmaco.setText("Add the ID");
				return;
			}
			int idFarmaco = Integer.parseInt(txtIdFarmaco.getText());
			Farmaco farmaco = model.getFarmaco(idFarmaco);
			txtNomeFarmaco.setText(farmaco.getNome());
    	} catch (NumberFormatException e) {
			allertText.setText("Inserire un ID nel formato corretto.");
		} catch (RuntimeException e) {
			allertText.setText("ERRORE DI CONNESSIONE AL DATABASE!");
		}
    }
    void setCombo() {
    	List reparti=new ArrayList <Reparto>();
    	reparti=model.getAllReparti();
    	comboReparti.getItems().addAll(reparti);
    	
    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	 assert txtIdFarmaco != null : "fx:id=\"txtIdFarmaco\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert txtNomeFarmaco != null : "fx:id=\"txtNomeFarmaco\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert qty != null : "fx:id=\"qty\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert comboReparti != null : "fx:id=\"comboReparti\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert btnBack != null : "fx:id=\"btnBack\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert btnConfirm != null : "fx:id=\"btnConfirm\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert allertText != null : "fx:id=\"allertText\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
         assert btnVerifica != null : "fx:id=\"btnVerifica\" was not injected: check your FXML file 'InserisciFarmaco.fxml'.";
    }

	public void setModel(MartaModel model) {
		 this.model=model;
		 
         setCombo();
		
	}
}
