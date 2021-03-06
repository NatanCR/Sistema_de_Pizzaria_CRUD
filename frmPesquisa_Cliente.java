/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmPesquisa_Cliente extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    
    
    
    public frmPesquisa_Cliente() {
        initComponents();
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root","");
            st = (Statement)con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");
            
        }
        Listar();
    }

   

    private void Listar(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
           modelo.setNumRows(0);

            String sql = "select * from cliente as C inner join endereco as E on C.fk_cep_endereco = E.cep;";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
 
                String nome = (rs.getString("nome"));
                String telefone = (rs.getString("telefone"));
                String cep = (rs.getString("fk_cep_endereco"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("logradouro"));
                String numero = (rs.getString("numero"));
                String complemento = (rs.getString("complemento"));
                String obs = (rs.getString("obs"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{nome, telefone, cep, bairro, endereco, numero, complemento, obs, taxa});     
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEndereco = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("SELECIONE E CLIQUE NO CLIENTE");

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        jtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtEndereco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "CEP", "Bairro", "Endereço", "Número", "Complemento", "Obs", "Taxa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEnderecoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtEndereco);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("FILTRAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("NA TABELA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

        try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
            modelo.setNumRows(0);

            String sql = "SELECT * FROM cliente WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR cep LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR telefone LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR logradouro LIKE '%"+txtPesquisa.getText()+"%'";

            rs = st.executeQuery(sql);
            while (rs.next()){

                String nome = (rs.getString("nome"));
                String telefone = (rs.getString("telefone"));
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("logradouro"));
                String numero = (rs.getString("numero"));
                String complemento = (rs.getString("complemento"));
                String obs = (rs.getString("obs"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{nome, telefone, cep, bairro, endereco, numero, complemento, obs, taxa});


            }

        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtEndereco.getModel();
            modelo.setNumRows(0);

            String sql = "SELECT * FROM cliente as C inner join endereco as E on C.fk_cep_endereco = E.cep WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR fk_cep_endereco LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR telefone LIKE '%"+txtPesquisa.getText()+"%'"
            +" OR logradouro LIKE '%"+txtPesquisa.getText()+"%'";

            rs = st.executeQuery(sql);
            while (rs.next()){

                String nome = (rs.getString("nome"));
                String telefone = (rs.getString("telefone"));
                String cep = (rs.getString("cep"));
                String bairro = (rs.getString("bairro"));
                String endereco = (rs.getString("logradouro"));
                String numero = (rs.getString("numero"));
                String complemento = (rs.getString("complemento"));
                String obs = (rs.getString("obs"));
                String taxa = (rs.getString("taxa"));
                
                modelo.addRow(new Object[]{nome, telefone, cep, bairro, endereco, numero, complemento, obs, taxa});

            }

        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }

    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void jtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEnderecoMouseClicked
        // TODO add your handling code here:
        frmPedido_Cliente.telefone = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 1).toString());
        frmPedido_Cliente.bairro = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 3).toString());
        frmPedido_Cliente.endereco = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 4).toString());
        frmPedido_Cliente.nome = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 0).toString());
        frmPedido_Cliente.numero = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 5).toString());
        frmPedido_Cliente.taxa = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 8).toString());
        frmPedido_Cliente.cep = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 2).toString());
        frmPedido_Cliente.complemento = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 6).toString());
        frmPedido_Cliente.obs = (jtEndereco.getValueAt(jtEndereco.getSelectedRow(), 7).toString());
   
        this.dispose();
    }//GEN-LAST:event_jtEnderecoMouseClicked

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
            java.util.logging.Logger.getLogger(frmPesquisa_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPesquisa_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPesquisa_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPesquisa_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPesquisa_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtEndereco;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nome
     */
    
}
