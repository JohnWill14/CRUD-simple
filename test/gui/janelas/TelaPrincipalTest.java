/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.janelas;

import javax.swing.JFrame;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class TelaPrincipalTest {
    
    public TelaPrincipalTest() {
    }

    @Test
    public void testaTela() {
        TelaPrincipal tela=new TelaPrincipal();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    
}
