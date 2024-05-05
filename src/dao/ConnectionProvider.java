/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class ConnectionProvider {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bajra_pharmacy";
            Connection con = DriverManager.getConnection(url, "root", "");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
