package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

	@FXML
    private Button btnCancella;
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doCancella(ActionEvent event) {
    	elenco.removeParola(txtResult.getSelectedText());
    	txtResult.clear();
    	String result="";
    	for(String p:elenco.getElenco()) {
    		result += p+"\n";
    	}
    	txtResult.setText(result);
    	txtParola.clear();
    	
    }
    
    @FXML
    void doInsert(ActionEvent event) {
    	String parolaInserita= txtParola.getText();
    	elenco.addParola(parolaInserita);
    	txtResult.clear();
    	String result="";
    	for(String p:elenco.getElenco()) {
    		result += p+"\n";
    	}
    	txtResult.setText(result);
    	txtParola.clear();
    }

    @FXML
    void doReset(ActionEvent event) {
    	elenco.reset();
    	txtResult.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
