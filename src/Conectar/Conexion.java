/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectar;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AngelArturo
 */
public class Conexion {
    
    static Connection con=null;
    
    static String bdName="sicicon";
    static String pass="1234";
    static String user="root";
    
    
    public static Connection conexion(){
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionBD= "jdbc:sqlserver://localhost:databaseName="
                    +bdName+";user="+user+";password="+pass+";";
            try {
                con=(Connection) DriverManager.getConnection(connectionBD);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
                    
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return con;
    }
    
    public static void main(String[] args){
        if (conexion()!=null){
            System.out.println("co");
        }
    }
    
}
