/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nusasearch;

/**
 *
 * @author Jamalludin
 */ 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class db {
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if (connection == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
               
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_nusa","root","");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
    return connection;
    }
    
    public static void main(String[] args) {
        
      db.getConnection();
    }

}

