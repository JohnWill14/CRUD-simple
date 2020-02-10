/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.janelas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.CategoriaDao;
import model.dao.ProdutoDao;

/**
 *
 * @author usuario
 */
public class Produto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Produto
     */
    public Produto() {
        initComponents();
        myCustomization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        js = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        novoButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        iDLabel = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        spinnerQtd = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        valorText = new javax.swing.JTextField();
        limparButton = new javax.swing.JButton();
        js1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Teste", "Teste"}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCategoriaMouseClicked(evt);
            }
        });
        tabelaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaCategoriaKeyReleased(evt);
            }
        });
        js.setViewportView(tabelaCategoria);

        setClosable(true);
        setIconifiable(true);
        setTitle("Produto");

        novoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/img/novo.png"))); // NOI18N
        novoButton.setText("Novo");
        novoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(novoButton);

        salvarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/img/salvar.png"))); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(salvarButton);

        excluirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/img/excluir.png"))); // NOI18N
        excluirButton.setText("Excluir");
        excluirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });
        jPanel1.add(excluirButton);

        sairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/midia/img/cancelar.png"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sairButton);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário"));
        jPanel2.setLayout(null);

        iDLabel.setText("ID");
        jPanel2.add(iDLabel);
        iDLabel.setBounds(30, 20, 14, 15);

        idText.setEditable(false);
        jPanel2.add(idText);
        idText.setBounds(110, 20, 70, 23);

        jLabel1.setText("Nome");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 60, 40, 15);

        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });
        jPanel2.add(nomeText);
        nomeText.setBounds(110, 60, 140, 23);

        jLabel2.setText("Categoria");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 100, 80, 15);

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboCategoria);
        comboCategoria.setBounds(113, 100, 150, 25);

        jLabel3.setText("Qtd");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 145, 51, 20);
        jPanel2.add(spinnerQtd);
        spinnerQtd.setBounds(78, 140, 50, 26);

        jLabel4.setText("Valor");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(160, 145, 37, 20);
        jPanel2.add(valorText);
        valorText.setBounds(220, 140, 110, 23);

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });
        jPanel2.add(limparButton);
        limparButton.setBounds(300, 10, 78, 31);

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Teste", "Teste"}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        tabelaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaProdutoKeyReleased(evt);
            }
        });
        js1.setViewportView(tabelaProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        // TODO add your handling code here:
        criaProduto();
        limpaCampo();
    }//GEN-LAST:event_novoButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
        altProduto();
        limpaCampo();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        // TODO add your handling code here:
        excProduto();
        limpaCampo();
    }//GEN-LAST:event_excluirButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void tabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriaMouseClicked
        // TODO add your handling code here:
//        selecionaRow();
    }//GEN-LAST:event_tabelaCategoriaMouseClicked

    private void tabelaCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaCategoriaKeyReleased
        // TODO add your handling code here:
//        selecionaRow();;
    }//GEN-LAST:event_tabelaCategoriaKeyReleased

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked
        // TODO add your handling code here:
      selecionaRow();
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void tabelaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutoKeyReleased
        // TODO add your handling code here:
        selecionaRow();
    }//GEN-LAST:event_tabelaProdutoKeyReleased

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        // TODO add your handling code here:
        limpaCampo();
        completaTabela();
    }//GEN-LAST:event_limparButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JButton excluirButton;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane js;
    private javax.swing.JScrollPane js1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JSpinner spinnerQtd;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField valorText;
    // End of variables declaration//GEN-END:variables
    private List<model.bean.Categoria> listaCategoria;
    private List<model.bean.Produto> listaProduto;
    private CategoriaDao catDao;
    private ProdutoDao proDao;
    private DefaultTableModel modelTable;
    public void myCustomization(){
        catDao=new CategoriaDao();
        proDao=new ProdutoDao();
        criaCombo();
        criaTabela();
        completaTabela();
    }
    private void criaCombo(){
        listaCategoria=catDao.findAll();
        comboCategoria.removeAllItems();
        comboCategoria.addItem("");
        for(model.bean.Categoria cat:listaCategoria){
            comboCategoria.addItem(cat.getNome());
        }
    }
    private void criaTabela(){
        modelTable=new DefaultTableModel(new Object[][]{}, new String[]{
            "ID","NOME","Categoria","Valor","QTD","IDCat"
        });
        
        tabelaProduto.setModel(modelTable);
        tabelaProduto.setAutoscrolls(true);
        tabelaProduto.getColumnModel().getColumn(5).setMinWidth(0);
        tabelaProduto.getColumnModel().getColumn(5).setMaxWidth(0);
        
        
    }
    private void completaTabela(){
        limpaTabela();
        listaCategoria=catDao.findAll();
        listaProduto=proDao.listar();
        for(model.bean.Produto pro:listaProduto){
            modelTable.addRow(new Object[]{
                pro.getId(),pro.getNome(),pro.getCategoria().getNome(),
                String.format("%.2f", pro.getValor()),pro.getQuantidade(),pro.getCategoria().getId()
            });
        }
    }
    private void limpaTabela(){
        int tam=modelTable.getRowCount();
        for(int i=0;i<tam;i++)
        modelTable.removeRow(0);
    }
    private void selecionaRow(){
        if(tabelaProduto.getSelectedRow()!=-1){
            int row=tabelaProduto.getSelectedRow();
            //"ID","NOME","Categoria","Valor","QTD"
            idText.setText(modelTable.getValueAt(row, 0).toString());
            nomeText.setText(modelTable.getValueAt(row,1).toString());
            int idCat=Integer.parseInt(modelTable.getValueAt(row,5).toString());
            
            int cont=0;
            for(model.bean.Categoria cat: listaCategoria){
                cont++;
                if(cat.getId()==idCat){
                    break;
                }
                
            }
            comboCategoria.setSelectedIndex(cont);
            valorText.setText(modelTable.getValueAt(row,3).toString());
            spinnerQtd.setValue(Integer.parseInt(modelTable.getValueAt(row,4).toString()));
        }
    }
    private boolean verificaCampo(){
        if(nomeText.getText().equals(""))return false;
        if(comboCategoria.getSelectedIndex()==0)return false;
        if(valorText.getText().equals(""))return false;
        try{
            int valor=Integer.parseInt(spinnerQtd.getValue().toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Erro no campo qtd.\nVerifique e tente outra vez.");
            return false;
        }
        
        return true;
    }
    private  void limpaCampo(){
        nomeText.setText("");
        idText.setText("");
        valorText.setText("");
        comboCategoria.setSelectedIndex(0);
        spinnerQtd.setValue(0);
    }
    private model.bean.Produto pegaProduto(){
        model.bean.Produto pro=new model.bean.Produto();
        if(verificaCampo()){
            if(!idText.getText().equals(""))
                pro.setId(Integer.parseInt(idText.getText()));
            else pro.setId(0);
            pro.setNome(nomeText.getText());
            pro.setCategoria(listaCategoria.get(comboCategoria.getSelectedIndex()-1));
            pro.setValor(Double.parseDouble(valorText.getText().replaceAll(",", ".")));
            pro.setQuantidade(Integer.parseInt(spinnerQtd.getValue().toString()));
        }else{
            JOptionPane.showMessageDialog(this, "Algum campo não está preenchido.");
            pro=null;
        }
        return pro;
    }
    private void criaProduto(){
        model.bean.Produto pro =pegaProduto();
        if(pro==null) return;
        proDao.save(pro);
        completaTabela();
       // System.out.println("OLA");
    }
    private void altProduto(){
        model.bean.Produto pro =pegaProduto();
        if(pro.getId()==0){
            JOptionPane.showMessageDialog(this, "Selecione um produto");
            return;
        }
        if(pro==null) return;
        proDao.update(pro);
        completaTabela();
       // System.out.println("OLA");
    }
    private void excProduto(){
        model.bean.Produto pro= this.pegaProduto();
        System.out.println("ID "+pro.getId());
         if(pro.getId()==0){
            JOptionPane.showMessageDialog(this, "Selecione um produto");
            return;
        }
         try {
             proDao.excluir(pro.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nao foi possivel excluir:\n");
        }
        
        completaTabela();
    }
}