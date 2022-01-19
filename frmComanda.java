/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ruy_s
 */
public class frmComanda extends javax.swing.JFrame  {

    public Connection con;
    public Statement st;
    public ResultSet rs;

    public frmComanda() {
        initComponents();
        Color minhaCor = new Color(255, 255, 255);
        getContentPane().setBackground(minhaCor);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");
            st = (Statement) con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");

        }
        listar();
    }

    public void listar() {

        try {
            float vTotal = 0;

            String sql = "select C.nome, x.nome, y.nome, z.nome, I.borda, B.nome, I.obs, I.valorf, I.qtd, I.tamanho, P.pagamento, E.taxa, E.logradouro, C.numero, E.cep from item_pedido as I "
                    + "left join pedido as P on I.id_pedido = P.id "
                    + "left join cliente as C on P.telefone_c = C.telefone "
                    + "left join bebida as B on I.id_bebida = B.id "
                    + "left join pizza as X on I.id_pizza = X.id "
                    + "left join pizza as Y on I.id_pizza2 = Y.id "
                    + "left join pizza as Z on I.id_pizza3 = Z.id "
                    + "left join endereco as E on C.fk_cep_endereco = E.cep "
                    + "where P.id = " + frmPedido_Pagamento.id;

            rs = st.executeQuery(sql);
            while (rs.next()) {

                String nome = (rs.getString("C.nome"));
                String pizza1 = (rs.getString("x.nome"));
                String pizza2 = (rs.getString("y.nome"));
                String pizza3 = (rs.getString("z.nome"));
                String borda = (rs.getString("I.borda"));
                String bebida = (rs.getString("B.nome"));
                float valor = (rs.getFloat("I.valorf"));
                int qtd = (rs.getInt("I.qtd"));
                String tamanho = (rs.getString("I.tamanho"));
                String pagamento = (rs.getString("P.pagamento"));
                String cep = (rs.getString("E.cep"));
                String endereco = (rs.getString("E.logradouro"));
                String numero = (rs.getString("C.numero"));
                String obs = (rs.getString("I.obs"));
                String taxa = (rs.getString("E.taxa"));

                vTotal += (valor * qtd);
                PNComanda.lblNP.setText("1");
                PNComanda.lblTaxa.setText("R$" + taxa);
                PNComanda.lblVTotal.setText("R$" + vTotal + "0");
                PNComanda.lblEndereco.setText(endereco + ", " + numero);
                PNComanda.lblPagamento.setText(pagamento);
                PNComanda.lblNome.setText(nome);

                if (pizza1 != null && pizza2 == null && pizza3 == null) {

                    if (obs != null || obs != "") {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   " + pizza1 + "\n" + "Borda: " + borda + "\n" + "\n" + "OBS: " + obs + "\n\n");
                    } else {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   " + pizza1 + "\n" + "Borda: " + borda + "\n\n");
                    }
                } else if (pizza1 != null && pizza2 != null && pizza3 == null) {

                    if (obs != null || obs != "") {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   1/2 " + pizza1 + "\n   1/2 " + pizza2 + "\n" + "Borda: " + borda + "\n" + "OBS: " + obs + "\n\n");
                    } else {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   1/2 " + pizza1 + "\n   1/2 " + pizza2 + "\n" + "Borda: " + borda + "\n\n");
                    }
                } else if (pizza1 != null && pizza2 != null && pizza3 != null) {

                    if (obs != null || obs != "") {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   1/3 " + pizza1 + "\n   1/3 " + pizza2 + "\n   1/3 " + pizza3 + "\n" + "Borda: " + borda + "\n" + "OBS: " + obs + "\n\n");
                    } else {
                        PNComanda.txtProduto.append(" " + qtd + " - " + tamanho + "\n   1/3 " + pizza1 + "\n   1/3 " + pizza2 + "\n   1/3 " + pizza3 + "\n" + "Borda: " + borda + "\n\n");
                    }

                } else if (pizza1 == null && pizza2 == null && pizza3 == null && bebida != null) {
                    PNComanda.txtProduto.setRows(PNComanda.txtProduto.getLineCount()+6);
                    PNComanda.txtProduto.append(" 1 - " + bebida + "\n\n");
                } else {

                }

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pNComanda1 = new Formularios.PNComanda();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(pNComanda1);

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImprimir)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnImprimir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(pNComanda1);
        if(job.printDialog()){
            try{
                job.print();
            }catch (PrinterException ex){ 
        }
        }else{
            JOptionPane.showMessageDialog(this, "Impressão cancelada");
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private Formularios.PNComanda pNComanda1;
    // End of variables declaration//GEN-END:variables

    
    
}
