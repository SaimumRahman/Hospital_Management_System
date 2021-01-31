/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saimum
 */
public class OracleConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Connection conn=null;

 try{
            String drivername="oracle.jdbc.driver.OracleDriver";
            Class.forName(drivername);
            String servername="DESKTOP-BLHS66F";
            String serverport="1522";
            String sid="XE";
            String url= "jdbc:oracle:thin:@" +servername + ":" + serverport + ":" + sid;
            String username= "Login";
            String password= "bacbd123";
            conn = DriverManager.getConnection(url,username,password );
            System.out.println("Successful");
            
           
            
        }catch (ClassNotFoundException e){
                System.out.println("Driver not found" + e.getMessage());
              }catch(SQLException e){ System.out.println("Database not connected" + e.getMessage());}

 }
    }
    

