/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author ruy_s
 */
public class frmRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form frmRelatorio
     */
    public frmRelatorio() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnVenda = new javax.swing.JButton();
        btnPeriodo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblRelatorios = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGOTIPO2.png"))); // NOI18N

        btnVenda.setBackground(new java.awt.Color(0, 0, 255));
        btnVenda.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Relatório por Venda");
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnPeriodo.setBackground(new java.awt.Color(0, 0, 255));
        btnPeriodo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriodo.setText("Relatório por Período");
        btnPeriodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 693, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblRelatorios.setBackground(new java.awt.Color(204, 204, 204));
        lblRelatorios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GRAFICO.png"))); // NOI18N
        lblRelatorios.setText("Relatórios");
        lblRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatoriosMouseClicked(evt);
            }
        });

        lblCadastro.setBackground(new java.awt.Color(204, 204, 204));
        lblCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CADASTRO.png"))); // NOI18N
        lblCadastro.setText("Cadastro");
        lblCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroMouseClicked(evt);
            }
        });

        lblPedidos.setBackground(new java.awt.Color(204, 204, 204));
        lblPedidos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PIZZA.png"))); // NOI18N
        lblPedidos.setText("Pedidos");
        lblPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPedidosMouseClicked(evt);
            }
        });

        lblCardapio.setBackground(new java.awt.Color(204, 204, 204));
        lblCardapio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCardapio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CARDAPIO.png"))); // NOI18N
        lblCardapio.setText("Cardápio");
        lblCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCardapio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCardapioMouseClicked(evt);
            }
        });

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/HOME.png"))); // NOI18N
        lblMenu.setText(" Início");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPedidos)
                .addGap(18, 18, 18)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addComponent(lblRelatorios)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RELATÓRIO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseClicked
        // TODO add your handling code here:

        frmRelatorio tela = new frmRelatorio();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRelatoriosMouseClicked

    private void lblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroMouseClicked
        // TODO add your handling code here:
        frmCadastro tela = new frmCadastro();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCadastroMouseClicked

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
        frmPedido_Cliente tela = new frmPedido_Cliente();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void lblCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapioMouseClicked
        // TODO add your handling code here:
        frmCardapio_Pesquisa tela = new frmCardapio_Pesquisa();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCardapioMouseClicked

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lblMenuMouseClicked

    private void btnPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodoActionPerformed
        // TODO add your handling code here:
        frmRelatorio_Periodo tela = new frmRelatorio_Periodo();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPeriodoActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        // TODO add your handling code here:
        frmRelatorio_Venda tela = new frmRelatorio_Venda();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVendaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPeriodo;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRelatorios;
    // End of variables declaration//GEN-END:variables
}
