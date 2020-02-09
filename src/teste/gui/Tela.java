/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.gui;

import gui.janelas.TelaPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class Tela {
    public static void main(String[] args) {
        TelaPrincipal tela=new TelaPrincipal();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
    private static void lookTest(){
        try {  
//            BasicLookAndFeel darcula=new com.bulenkov.darcula.DarculaLaf();
//            javax.swing.UIManager.setLookAndFeel(darcula.getName());
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

              
            
          } catch (Exception erro) {  
            erro.printStackTrace();  
          }  
    }
}
