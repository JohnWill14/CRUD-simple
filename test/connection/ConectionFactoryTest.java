/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ConectionFactoryTest {
    
    public ConectionFactoryTest() {
    }

    @Test
    public void testSomeMethod() {
        try {
            ConectionFactory.getConnection();
        } catch (SQLException ex) {
            fail("Erro ao conectar");
        }
    }
    
}
