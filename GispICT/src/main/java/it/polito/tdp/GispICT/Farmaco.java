package it.polito.tdp.GispICT;

import java.util.Date;

public class Farmaco {
	private String Nome;
	private Date Scadenza;
    private int FID;
    private String Conservazione;
    private String Link;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
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
	public String getConservazione() {
		return Conservazione;
	}
	public void setConservazione(String conservazione) {
		Conservazione = conservazione;
	}
	public String getLink() {
		return Link;
	}
	public void setLink(String link) {
		Link = link;
	}
	
}
