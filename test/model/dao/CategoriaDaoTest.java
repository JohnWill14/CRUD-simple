/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Categoria;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class CategoriaDaoTest {
    
    public CategoriaDaoTest() {
    }

    @Test
    public void inserir() {
        Categoria cat=new Categoria("Roupas");
        CategoriaDao dao=new CategoriaDao();
        boolean s=dao.save(cat);
        if(!s)Assert.fail("Deu ruim");
    }
    
}
