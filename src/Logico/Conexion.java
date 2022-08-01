/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario Suárez
 */
public class Conexion {
    
    //base de datos global
    String ndb = "sql5510000";
    String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/";
    String user = "sql5510000";
    String password = "vunyRiSKdD";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    //base de datos local
    String db = "cuentas";
    String sitio = "jdbc:mysql://127.0.0.1:3306/";
    String usuario = "root";
    String clave = "mario_cs3103";
    String conector = "com.mysql.cj.jdbc.Driver";
    Connection dbL;

    //constructor
    public Conexion(){

    }
    //metodo conectar
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+ndb, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, "No se puedo conectar a la base de datos");
        }
        return cx;
    }

    public Connection conectLocal(){
        try {
            Class.forName(conector);
            dbL=DriverManager.getConnection(sitio+db, usuario, clave);
        } catch (ClassNotFoundException |SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puedo conectar a la base de datos");
        }
        return dbL;
    }
}
