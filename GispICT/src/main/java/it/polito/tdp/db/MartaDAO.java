package it.polito.tdp.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.GispICT.Farmaco;
import it.polito.tdp.GispICT.Reparto;

public class MartaDAO {

	public List<Reparto>listaReparti(){
		String sql = "SELECT NameWard, IDWard \n" + 
				"FROM magazzinoreparti \n" + 
				"GROUP BY IDWard";

		
		List<Reparto> result = new ArrayList<Reparto>();
		
		Connection conn = DBConnectionMarta.getConnection() ;
		
		try {
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while(res.next()) {
				result.add(new Reparto(res.getString("NameWard"), res.getInt("IDWard"))) ;
			}
			
			conn.close();
			return result ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
	}

	public List<Farmaco> listaFarmaci() {
		String sql = "SELECT IDPharma,Name,Conservation,Link,Reorder " + 
				"FROM farmaci ";

		
		List<Farmaco> result = new ArrayList<Farmaco>();
		
		Connection conn = DBConnectionMarta.getConnection() ;
		
		try {
			PreparedStatement st = conn.prepareStatement(sql) ;
			
			ResultSet res = st.executeQuery() ;
			
			while(res.next()) {
				result.add(new Farmaco(res.getInt("IDPharma"), res.getString("Name"), res.getInt("Conservation"),
						res.getString("Link"),res.getInt("Reorder"))) ;
			}
			
			conn.close();
			return result ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
	}
}
