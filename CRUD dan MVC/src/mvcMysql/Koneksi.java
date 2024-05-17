/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcMysql;

import java.sql.*;
import javax.swing.JOptionPane;
import static mvcMysql.ModelMovie.DB_URL;
import static mvcMysql.ModelMovie.PASS;
import static mvcMysql.ModelMovie.USER;

/**
 *
 * @author ABDAN SM
 */
public class Koneksi {
     
      public static Connection Koneksi(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
            
            return koneksi;
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    
    }

}
