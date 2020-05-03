package it.polito.tdp.GispICT;

import java.time.LocalDate;
import java.util.Date;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.beans.value.ObservableValue;

public class FarmacoNelReparto {
	private StringProperty NomeF1;
	private String NomeF;
	private LocalDate Scadenza;
    private int FID;
    private int Quantita;
    private String NomeR;
	private int RID;

	public FarmacoNelReparto(String nomeF, LocalDate localDate, int fID, int quantita, String nomeR, int rID) {
		super();
        NomeF=nomeF;
		Scadenza = localDate;
		FID = fID;
		Quantita = quantita;
		NomeR = nomeR;
		RID = rID;
	}
	public LocalDate getScadenza() {
		return Scadenza;
	}

	public void setScadenza(LocalDate scadenza) {
		Scadenza = scadenza;
	}
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}

	public void setNomeF(String nomeF) {
		NomeF = nomeF;
	}
	public int getQuantita() {
		return Quantita;
	}
	public void setQuantita(int quantita) {
		Quantita = quantita;
	}
	public String getNomeR() {
		return NomeR;
	}
	public void setNomeR(String nomeR) {
		NomeR = nomeR;
	}
	public int getRID() {
		return RID;
	}
	public void setRID(int rID) {
		RID = rID;
	}
	@Override
	public String toString() {
		return  NomeF + ","
				+ Quantita + " unità presenti nel reparto " + NomeR + " con scadenza" + Scadenza + ";\n";
	}
	public ObservableValue<String> FIDO;

	public String getNomeF() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
