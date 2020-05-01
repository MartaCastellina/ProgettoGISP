package it.polito.tdp.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.polito.tdp.GispICT.FarmacoNelReparto;
public class LedaDAO {

		public List<FarmacoNelReparto>listaReparti(int codice){
			String sql = "SELECT IDWard,NameWard,Quantity, NamePharma, ExpDate FROM magazzinoreparti WHERE IDPharma="+codice;
			
			List<FarmacoNelReparto> result = new ArrayList<FarmacoNelReparto>();
			
			Connection conn = DBConnection.getConnection() ;
			
			try {
				PreparedStatement st = conn.prepareStatement(sql) ;
				
				ResultSet res = st.executeQuery() ;
				
				while(res.next()) {
					result.add( new FarmacoNelReparto(res.getString("NamePharma"), res.getDate("ExpDate").toLocalDate(),res.getInt(codice), res.getInt("Quantity"), res.getString("NameWard"), res.getInt("IDWard"))) ;
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
