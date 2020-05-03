package it.polito.tdp.GispICT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class LedaDAO {

		public List<FarmacoNelReparto>listaReparti(String nome){
			String sql = "SELECT IDWard,NameWard,Quantity, NamePharma,IDPharma,ExpDate FROM magazzinoreparti WHERE NamePharma LIKE '%"+nome+"%'";
			
			List<FarmacoNelReparto> result = new ArrayList<FarmacoNelReparto>();
			
			Connection conn = DBConnection.getConnection() ;
			
			try {
				PreparedStatement st = conn.prepareStatement(sql) ;
				
				ResultSet res = st.executeQuery() ;
				
				while(res.next()) {
					result.add( new FarmacoNelReparto(res.getString("NamePharma"), res.getDate("ExpDate").toLocalDate(),res.getInt("IDPharma"), res.getInt("Quantity"), res.getString("NameWard"), res.getInt("IDWard"))) ;
				}
				
				conn.close();
				return result ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null ;
			}
		}
		public void decrementa(FarmacoNelReparto f,int q) {
			int nuova= f.getQuantita()-q;
			System.out.print(nuova);
			Date data=java.sql.Date.valueOf(f.getScadenza());
			if(nuova==0){
				String sql="DELETE FROM magazzinoreparti WHERE IDWard=? AND IDPharma=? AND ExpDate=?;";
				Connection conn = DBConnection.getConnection() ;
			
			try {
				PreparedStatement st = conn.prepareStatement(sql) ;
				st.setInt(1,f.getRID());
				st.setInt(2,f.getFID());
				st.setDate(3,(java.sql.Date) data);
				
				st.executeUpdate();
				
				conn.close();
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
				
			}}
			else
			{   
				String sql="UPDATE magazzinoreparti SET Quantity = ? WHERE IDWard=? AND IDPharma=? AND ExpDate=?;";
				Connection conn = DBConnection.getConnection() ;
			
			try {
				PreparedStatement st = conn.prepareStatement(sql) ;
				st.setInt(1,nuova);
				st.setInt(2,f.getRID());
				st.setInt(3,f.getFID());
				st.setDate(4,(java.sql.Date) data);
				
				st.executeUpdate();
				
				conn.close();
				
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}}}
