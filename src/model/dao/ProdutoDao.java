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
import model.bean.Categoria;
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
    public void criaConexao(){
        try {
            con=ConectionFactory.getConnection();
        } catch (SQLException ex) {
            System.err.println("Erro ao inicializar Conexao:\n=>"+ex);
        }
    }
    public boolean save(Produto bean){
        this.criaConexao();
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
    public boolean update(Produto bean){
        this.criaConexao();
        String sql="update produto "
                + " set nome=?,qtd=?,valor=?,categoria=? "
                + "where "
                + "id=?;";
        PreparedStatement stm=null;
        try {
            stm=con.prepareStatement(sql);
            stm.setString(1, bean.getNome());
            stm.setInt(2, bean.getQuantidade());
            stm.setDouble(3, bean.getValor());
            stm.setInt(4, bean.getCategoria().getId());
            stm.setInt(5, bean.getId());
            stm.execute();
            ConectionFactory.closeConection(con, stm);
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao mudar "+ex);
            return false;
        }
        
    }
    public List<Produto> listar(){
        this.criaConexao();
        String sql="select * from "
                + "produto "
                + "inner join categoria on categoria.id=produto.categoria ";
        PreparedStatement stm=null;
        ResultSet rs=null;
        ArrayList<Produto> produtos=new ArrayList<>();
        try {
            stm=con.prepareStatement(sql);
            rs=stm.executeQuery();
            CategoriaDao catDao=new CategoriaDao();
            Produto bean;
            while(rs.next()){
                bean=new Produto();
                bean.setId(rs.getInt("id"));
                bean.setNome(rs.getString("nome"));
                bean.setQuantidade(rs.getInt("qtd"));
                bean.setValor(rs.getDouble("valor"));
                Categoria cat=catDao.find(rs.getInt("categoria"));
                bean.setCategoria(cat);
                produtos.add(bean);
            }
            ConectionFactory.closeConection(con, stm, rs);
            return produtos;
        } catch (SQLException ex) {
            throw new RuntimeException("Listar: "+ex);
            
        }
    }
    public Produto buscar( int id){
        this.criaConexao();
        String sql="select * from "
                + "produto "
                + "inner join categoria on categoria.id=produto.categoria "
                + "where "
                + "produto.id=?";
        PreparedStatement stm=null;
        ResultSet rs=null;
       
        try {
            stm=con.prepareStatement(sql);
            stm.setInt(1, id);
            rs=stm.executeQuery();
            CategoriaDao catDao=new CategoriaDao();
            Produto bean;
            rs.next();
            bean=new Produto();
            bean.setId(rs.getInt("id"));
            bean.setNome(rs.getString("nome"));
            bean.setQuantidade(rs.getInt("qtd"));
            bean.setValor(rs.getDouble("valor"));
            Categoria cat=catDao.find(rs.getInt("categoria"));
            bean.setCategoria(cat);
           

            ConectionFactory.closeConection(con, stm, rs);
            return bean;
        } catch (SQLException ex) {
            throw new RuntimeException("Buscar: "+ex);
            
        }
    }
    public void excluir(int id){
        this.criaConexao();
        String sql="delete from produto "
                + "where "
                + "id=?;";
        PreparedStatement stm=null;
        try {
            stm=con.prepareStatement(sql);
            stm.setInt(1, id);
            stm.execute();
            ConectionFactory.closeConection(con, stm);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir "+ex);
            
        }
    }
}
