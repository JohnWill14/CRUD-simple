/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class ConectionFactory {
//    private static final String 
    private static final String DRIVER;
    private static final String URL;
    private static final String USER;
    private static final String PASS;
    static{
        DRIVER="com.mysql.jdbc.Driver";
        URL="jdbc:mysql://localhost:3306/descompila";
        USER="usermysql";
        PASS="cursomysql";
    }
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erro na conexão",ex);
        }
    } 
    public static void closeConection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro fechar conexao: "+ex);
            }
        }
    }
    public static void closeConection(Connection con,PreparedStatement stm){
        if(stm!=null){
            try {
                stm.close();
            } catch (SQLException ex) {
                System.err.println("Erro fechar statement: "+ex);
            }
        }
        
        closeConection(con);
    }
    public static void closeConection(Connection con,PreparedStatement stm,ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro fechar resultSet: "+ex);
            }
        }
        
        closeConection(con,stm);
        closeConection(con);
    }
}
