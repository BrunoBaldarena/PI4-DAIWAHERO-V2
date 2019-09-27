/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.pi4.daiwahero.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Deyvid
 */
public class ConnectionUtils {
    
    // Classe que conecta com o banco de dados
        public static Connection getConnection(){
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
                return DriverManager.getConnection("jdbc:mysql://localhost/DAIWAHERO","root","");
            }catch(SQLException |ClassNotFoundException e){
                throw new RuntimeException(e);
                
            }
        }
    
}
