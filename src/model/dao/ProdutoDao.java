/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Produto;

/**
 *
 * @author usuario
 */
public class ProdutoDao {
    private Connection con;
    {
        try {
            con= ConectionFactory.getConnection();
        } catch (SQLException ex) {
            System.err.println("Erro ao conectar");
        }
        
    }
    public boolean save(Produto bean){
        String sql="Insert into produto "
                + "(nome,qtd,valor,categoria) "
                + "values"
                + "(?,?,?,?);";
        PreparedStatement stm=null;
        try {
            stm=con.prepareStatement(sql);
            stm.setString(1, bean.getNome());
            stm.setInt(2, bean.getQuantidade());
            stm.setDouble(3, bean.getValor());
            stm.setInt(4, bean.getCategoria().getId());
            stm.execute();
            ConectionFactory.closeConection(con, stm);
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar "+ex);
            return false;
        }
        
    }
}
