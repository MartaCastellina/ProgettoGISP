package it.polito.tdp.GispICT;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.plaf.synth.SynthScrollBarUI;

import it.polito.tdp.db.DBConnectionMarta;

public class MartaMain {
	public static void main(String[] args) {
        EntryPoint.main(args);        
        	
			MartaModel model=new MartaModel(); //non posso fare le prove qui per cose del controller 	
			TimerTask task = new TimerTask() { //o new TimerTask
				
				
				String sql = "SELECT NameWard, IDWard \n" + 
						"FROM magazzinoreparti \n" + 
						"GROUP BY IDWard";				
				List<Reparto> result = new ArrayList<Reparto>();
				
				
		        @Override
		        public void run() {
		            Connection conn = DBConnectionMarta.getConnection();
		            try {
		            	PreparedStatement st = conn.prepareStatement(sql) ;
		    			
		    			ResultSet res = st.executeQuery() ;
		    			
		    			while(res.next()) {
		    				result.add(new Reparto(res.getString("NameWard"), res.getInt("IDWard"))) ;
		    				conn.close();
		    				System.out.println(result) ;
		    				}
		            } catch (Exception e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		                
		            }
		        }
		    };
		    Timer timer = new Timer(true);// true to run timer as daemon thread
		    
		    timer.schedule(task, 0, 5000);// Run task every 5 second
		    try {
		        Thread.sleep(60000); // Cancel task after 1 minute.
		    } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    timer.cancel();
			
		}
    
    }
	

