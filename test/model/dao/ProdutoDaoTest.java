/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author usuario
 */
public class ProdutoDaoTest {
    
    public ProdutoDaoTest() {
    }

    @Test
    @Ignore
    public void testSomeMethod() {
        Categoria cat=new Categoria();
        cat.setId(1);
        Produto bean=new Produto("pants",cat , 10, 60);
        ProdutoDao dao=new ProdutoDao();
        dao.save(bean);
        
    }
    @Test
    public void update() {
        Categoria cat=new Categoria();
        cat.setId(2);
        Produto bean=new Produto("pants",cat , 10, 60);
        bean.setId(1);
        ProdutoDao dao=new ProdutoDao();
        dao.update(bean);
        
    }
    @Test
    public void listar() {
        Categoria cat=new Categoria();
        ProdutoDao dao=new ProdutoDao();
        List<Produto> lista= dao.findAll();
        for(Produto p:lista){
            System.out.println("=====================");
            System.out.println("Nome "+p.getNome());
            System.out.println("Qtd "+p.getQuantidade());
            System.out.println("Categoria "+p.getCategoria().getNome());
            System.out.println("Valor:    "+String.format("%.2f", p.getValor()));
        }
        
    }
    @Test
    public void buscar() {
        Categoria cat=new Categoria();
        ProdutoDao dao=new ProdutoDao();
        Produto p= (Produto) dao.find(14);
        System.out.println("=====================");
        System.out.println("Nome "+p.getNome());
        System.out.println("Qtd "+p.getQuantidade());
        System.out.println("Categoria "+p.getCategoria().getNome());
        System.out.println("Valor:    "+String.format("%.2f", p.getValor()));
    }
        
    @Test
    public void excluir() {
        Categoria cat=new Categoria();
        ProdutoDao dao=new ProdutoDao();
        dao.deletar(14);
    }
}
