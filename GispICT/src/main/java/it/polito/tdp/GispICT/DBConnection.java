package it.polito.tdp.GispICT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DBConnection {
	
	private static String jdbcURL = "jdbc:mysql://localhost//digitalmed?user=root&password=" ;
	

	
	public static Connection getConnection() {
		
	
			// initialize DataSource
			try {
				Connection conn=DriverManager.getConnection(jdbcURL);
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(1);
			}
			return null;
			
	
		
		}
		
	}

