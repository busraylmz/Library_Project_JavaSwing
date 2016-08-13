package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	
	public Connection con=null;
	
		
		// TODO Auto-generated constructor stub
		public Connection baglantiOlustur()
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			String conString = "jdbc:oracle:thin:@localhost:1521:XE";
			try {
				con = DriverManager.getConnection(conString, "KITAPLAR", "KITAPLAR");
				
				if (con == null) {
					System.out.println("Baðlantýyý alamadýk");
					return null;
				} else {
					System.out.println("Baðlantýyý aldýk");
					return con;
				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

			
		}

	
		
		
	

}
