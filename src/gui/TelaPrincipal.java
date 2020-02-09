/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        setIconImage(new ImageIcon(getClass().getResource("/midia/comercio-e-compras.png")).getImage());
       
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        CategoriaButton = new javax.swing.JButton();
        ProdutoCategoria = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        planoDeFundo = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(592, 544));
        setMinimumSize(new java.awt.Dimension(592, 544));
        setPreferredSize(new java.awt.Dimension(592, 544));
        setResizable(false);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(18, 60));
        jToolBar1.setMinimumSize(new java.awt.Dimension(18, 60));
        jToolBar1.setPreferredSize(new java.awt.Dimension(100, 60));

        CategoriaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/categoria.png"))); // NOI18N
        CategoriaButton.setText("  Categoria  ");
        CategoriaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CategoriaButton.setFocusable(false);
        CategoriaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CategoriaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CategoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(CategoriaButton);

        ProdutoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/produto.png"))); // NOI18N
        ProdutoCategoria.setText("  Produto  ");
        ProdutoCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProdutoCategoria.setFocusable(false);
        ProdutoCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ProdutoCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(ProdutoCategoria);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        planoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/artigo-java-1.png"))); // NOI18N

        desktop.setLayer(planoDeFundo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(planoDeFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CategoriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaButtonActionPerformed
        // TODO add your handling code here:
        telaCategoria=new gui.janelas.Categoria();
        telaCategoria.setSize(396, 463);
        desktop.add(telaCategoria);
        telaCategoria.setVisible(true);
    }//GEN-LAST:event_CategoriaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    private gui.janelas.Categoria telaCategoria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoriaButton;
    private javax.swing.JButton ProdutoCategoria;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel planoDeFundo;
    // End of variables declaration//GEN-END:variables
}