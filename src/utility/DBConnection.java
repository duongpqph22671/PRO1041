/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBConnection {

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.getMessage();
        }
    }
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ShopPC", "sa", "2003");
        } catch (SQLException ex) {
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(new DBConnection().getConnection());
    }
}
