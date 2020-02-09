/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.bean.Categoria;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class CategoriaDaoTest {
    
    public CategoriaDaoTest() {
    }

    @Test
  //  @Ignore//Ignora um metodo
    public void inserir() {
        Categoria cat=new Categoria("Roupas");
        CategoriaDao dao=new CategoriaDao();
        boolean s=dao.save(cat);
        if(!s)Assert.fail("Deu ruim");
    }
    @Test
    public void atualiza() {
        Categoria cat=new Categoria("Chocolate");
        cat.setId(1);
        CategoriaDao dao=new CategoriaDao();
        boolean s=dao.update(cat);
        if(!s)Assert.fail("Deu ruim");
        else System.out.println("OK");
    }
    @Test
    public void deleta() {
        
        CategoriaDao dao=new CategoriaDao();
        try{
            dao.deletar(1);
        }catch(Exception ex){
            System.out.println("Não foi possivel excluir: "+ex);
        }
    }
    @Test
    public void listar(){
        CategoriaDao dao=new CategoriaDao();
        List<Categoria> categorias=dao.findAll();
        for(Categoria c:categorias){
            System.out.println("\nID: "+c.getId());
            System.out.println("Nome: "+c.getNome());
        }
    }
    @Test
    public void busca(){
        CategoriaDao dao=new CategoriaDao();
        Categoria bean=dao.find(2);
        System.out.println(bean.getId()+" "+bean.getNome());
    }
    
}
