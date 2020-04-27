package it.polito.tdp.GispICT;

import java.util.List;

import it.polito.tdp.db.MartaDAO;

public class MartaModel {

	private MartaDAO mDAO;
	private Reparto selezionato=new Reparto();
	
	
	public MartaModel() {
		mDAO=new MartaDAO();
	}
	public List <Reparto> getAllReparti(){
		return mDAO.listaReparti();
	}
	public void setRepartoSelezionato(Reparto reparto) {
		this.selezionato=reparto;		
	}
	public Reparto getRepartoSelezionato() {
		return selezionato;
	}
	
	
	
}
