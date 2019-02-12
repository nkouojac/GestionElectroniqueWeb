package cm.objis.gestionelectroniquedesdocuments.utilitaires;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es(param�tres de connection � la base des donn�es)
		    public static String url = "jdbc:mysql://localhost/gestiondesdocuments";
		    public static String login = "root";//nom d'utilisateur de la base des donn�es
		    public static String passwd = "";
			public static Connection  connection;
			
			/**
			 * M�thode connection
			 * ELLE NE PREND RIEN EN PARAMETRE
			 * @return connection
			 */
			
			public  static Connection getInstance(){
				if(connection==null){
					try{
						connection=DriverManager.getConnection(url,login,passwd);
					}catch(SQLException e){
						
						System.out.println("Probllme de connection");
					}
				}
					
				return connection;
			}

}
