/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Categoria;

/**
 *
 * @author usuario
 */
public class CategoriaDao {
    private Connection con;
    
    public CategoriaDao() {
    }
    public void criaConexao(){
        try {
            con=ConectionFactory.getConnection();
        } catch (SQLException ex) {
            System.err.println("Erro ao inicializar Conexao:\n=>"+ex);
        }
    }
    public boolean save(Categoria categoria){
        this.criaConexao();
        String sql="Insert into categoria "
                + "(nome) "
                + "values"
                + "(?);";
        PreparedStatement stm=null;
        try {
            stm=this.con.prepareStatement(sql);
            stm.setString(1, categoria.getNome());
            stm.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar\n=>"+ex);
            return false;
        }finally{
            ConectionFactory.closeConection(con, stm);
        }
        
    }
    public boolean update(Categoria categoria){
        this.criaConexao();
        String sql="update categoria "
                + "set nome=? "
                + "where "
                + "id=?;";
        PreparedStatement stm=null;
        try {
            stm=this.con.prepareStatement(sql);
            stm.setString(1, categoria.getNome());
            stm.setInt(2, categoria.getId());
            stm.execute();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar\n=>"+ex);
            return false;
        }finally{
            ConectionFactory.closeConection(con, stm);
        }
        
    }
    public List<Categoria> findAll(){
        this.criaConexao();
         String sql="select * from categoria; ";
        PreparedStatement stm=null;
        ResultSet rs=null;
        List<Categoria> lista=new ArrayList<>();
        
        try {
            stm=this.con.prepareStatement(sql);
            rs=stm.executeQuery();
            Categoria cat;
            while(rs.next()){
                cat=new Categoria();
                cat.setId(rs.getInt("id"));
                cat.setNome(rs.getString("nome"));
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
            System.err.println("Erro ao salvar\n=>"+ex);
            return null;
        }finally{
            ConectionFactory.closeConection(con, stm,rs);
        }
    }
    public Categoria find(int id){
        this.criaConexao();
         String sql="select * from categoria where id=?; ";
        PreparedStatement stm=null;
        ResultSet rs=null;
        
        try {
            stm=this.con.prepareStatement(sql);
            stm.setInt(1, id);
            rs=stm.executeQuery();
            Categoria cat;
            rs.next();
            cat=new Categoria();
            cat.setId(rs.getInt("id"));
            cat.setNome(rs.getString("nome"));
                
            ConectionFactory.closeConection(con, stm,rs);
            return cat;
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar\n=>"+ex);
            
        }
    }
    public void deletar(int i){
        this.criaConexao();
        String sql="delete from categoria where id=?; ";
        PreparedStatement stm=null;
        try {
            stm=con.prepareStatement(sql);
            stm.setInt(1, i);
            stm.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro deletar: "+ex);
        }
    }
}
