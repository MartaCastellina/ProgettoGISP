package it.polito.tdp.GispICT;

import java.util.Date;

public class FarmacoNelReparto {
	private String NomeF;
	private Date Scadenza;
    private int FID;
    private int Quantita;
    private String NomeR;
	private int RID;
	
	public FarmacoNelReparto(String nomeF, Date scadenza, int fID, int quantita, String nomeR, int rID) {
		super();
		NomeF = nomeF;
		Scadenza = scadenza;
		FID = fID;
		Quantita = quantita;
		NomeR = nomeR;
		RID = rID;
	}
	public Date getScadenza() {
		return Scadenza;
	}
	public void setScadenza(Date scadenza) {
		Scadenza = scadenza;
	}
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}
	public String getNomeF() {
		return NomeF;
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
	
}
