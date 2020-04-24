package it.polito.tdp.GispICT;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
        EntryPoint.main(args);
        String jdbcURL="jdbc:mysql://localhost/digitalmed?user=root&password=root";
		try {
			Connection conn=DriverManager.getConnection(jdbcURL);
			
			Statement st=conn.createStatement();
			String sql= "SELECT IDWard, NameWard, Quantity "+
					"FROM magazzinoreparti "+
					"WHERE IDPharma=1";
			ResultSet res = st.executeQuery(sql);
			while (res.next()) {
				int id=res.getInt("IDWard");
				String nomeReparto=res.getString("NameWard");
				int qty=res.getInt("Quantity");
				
				System.out.format("Il reparto %d ( %s ) ha %d quantita'  di Oki\n", id, nomeReparto, qty);
			}
			st.close();
			
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
}
