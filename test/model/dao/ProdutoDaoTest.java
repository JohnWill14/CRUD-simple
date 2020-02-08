/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Categoria;
import model.bean.Produto;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ProdutoDaoTest {
    
    public ProdutoDaoTest() {
    }

    @Test
    public void testSomeMethod() {
        Categoria cat=new Categoria();
        cat.setId(1);
        Produto bean=new Produto("pants",cat , 10, 60);
        ProdutoDao dao=new ProdutoDao();
        dao.save(bean);
        
    }
    
}
