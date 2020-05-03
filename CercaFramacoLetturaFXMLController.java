package it.polito.tdp.GispICT;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class CercaFramacoLetturaFXMLController {
	private LedaDAO Leda= new LedaDAO();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Indietro;

    @FXML
    private Label label;

    @FXML
    private TextField Ricerca;

    @FXML
    private Text Reparti;
    
    @FXML
    private Button Cerca;

    @FXML
    void handleIndietroAction(ActionEvent event) {
    	System.out.format("Il farmaco non è presente in magazzino1");
    }
    @FXML
    void Cerca(ActionEvent event) {
    	String s;
    	s=Ricerca.getText();
    	setMenuReparti1(s);

    }
    
    void setMenuReparti1(String s) {
    	List farmaci= new ArrayList<FarmacoNelReparto>();
        farmaci=Leda.listaReparti(s);
        javafx.collections.ObservableList<FarmacoNelReparto> farmaco= FXCollections.observableList(farmaci);
        System.out.format(farmaco.toString());
        Reparti.setText(farmaco.toString());
      
        	for (int i=0; i<=farmaci.size();i++)
        		{
        		FarmacoNelReparto f=(FarmacoNelReparto) farmaci.get(i);
        	
        		System.out.format("Il farmaco non è presente in magazzino");
        		}
        	
        	
        
        }

    @FXML
    void initialize() {
        assert Indietro != null : "fx:id=\"Indietro\" was not injected: check your FXML file 'CercaFarmacoLettura.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'CercaFarmacoLettura.fxml'.";
        assert Ricerca != null : "fx:id=\"Ricerca\" was not injected: check your FXML file 'CercaFarmacoLettura.fxml'.";
        assert Reparti != null : "fx:id=\"Reparti\" was not injected: check your FXML file 'CercaFarmacoLettura.fxml'.";
        assert Cerca != null : "fx:id=\"Cerca\" was not injected: check your FXML file 'CercaFarmacoLettura.fxml'.";

    }
}
