package it.polito.tdp.parole;

/**
 * Sample Skeleton for 'Parole.fxml' Controller Class
 */


import it.polito.tdp.parole.model.Parole;
import it.polito.tdp.parole.model.Parole2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ParoleController {
	Long ti;
	Long tf;
	Parole 	elenco ;
	Parole2 elenco2 ;

	String parola;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    @FXML
    private Button DelButton;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtParola"
    private TextArea txtActions; // Value injected by FXMLLoader

    
    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnReset;

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	ti=System.nanoTime();
    	parola=txtParola.getText().trim();
    	if(parola!=null && parola.compareTo("")!=0) {
    		elenco.addParola(parola);
    		
    	}
    	parola=""; //svuoto parola
    	String sn="";
    	for(String s:elenco.getElenco()) {
//    	txtResult.setText(elenco.getElenco().toString());
    		sn+=s+"\n";
    		txtResult.setText(sn+"\n");
    	}
    	tf=System.nanoTime();
    	Long delta=tf-ti;
    	txtActions.appendText("inserimento metodo 1 ha impiegato "+delta+"\n");
//    	
//  //METODO 2**************************************************************************
//    	ti=System.nanoTime();
//    	parola=txtParola.getText().trim();
//    	System.out.println("DEBUG "+parola);
//    	if(parola!=null && parola.compareTo("")!=0) {
//    		elenco2.addParola2(parola);
//    	}
//    	parola=""; //svuoto parola
//    	String sni="";
//    	for(String s:elenco2.getElenco2()) {
////    	txtResult.setText(elenco.getElenco().toString());
//    		sni+=s+"\n";
//    		txtResult.setText(sni+"\n");
//    	}
//    		txtParola.clear();
//    	tf=System.nanoTime();
//    	Long deltai=tf-ti;
//    	txtActions.appendText("inserimento metodo 2 ha impiegato "+deltai/100000000+"\n");
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	ti=System.nanoTime();
    	
    	elenco.reset();
    	txtResult.clear();
    	
    	tf=System.nanoTime();
    	Long delta=tf-ti;
    	txtActions.appendText("Reset ha impiegato "+delta+"\n");
    }
    @FXML
    void doDelete(ActionEvent event) {
    	ti=System.nanoTime();
    	String temp="";
    	String sn="";
    	temp=txtResult.getSelectedText();
    	elenco.getElenco().remove(temp);
    	
    	txtResult.clear();
    	for(String s:elenco.getElenco()) {
//        	txtResult.setText(elenco.getElenco().toString());
        		sn+=s+"\n";
        		txtResult.setText(sn+"\n");
        	}
    	tf=System.nanoTime();
    	Long delta=tf-ti;
    	txtActions.appendText("Delete ha impiegato "+delta+"\n");
    
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtActions != null : "fx:id=\"txtActions\" was not injected: check your FXML file 'Parole.fxml'.";
        assert DelButton != null : "fx:id=\"DelButton\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Parole.fxml'.";

        elenco = new Parole() ;
        
    }
}
