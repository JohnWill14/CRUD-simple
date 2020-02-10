/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.gui;

import gui.TelaPrincipal;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author usuario
 */
public class Tela {
    public static void main(String[] args) {
        lookTest();
        TelaPrincipal tela=new TelaPrincipal();
        tela.setSize( 900,585);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    private static void lookTest(){
        try {
//            BasicLookAndFeel darcula=new com.bulenkov.darcula.DarculaLaf();
            javax.swing.UIManager.setLookAndFeel(new com.bulenkov.darcula.DarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
        catch(ExceptionInInitializerError ex){
            System.out.println("Erro inicializar => "+ex.getMessage());
            
        }
    }
}
