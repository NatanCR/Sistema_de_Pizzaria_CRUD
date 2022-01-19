/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ruy_s
 */
public class frmCad_Produto extends javax.swing.JFrame {
   
        public Connection con;
        public Statement st;
        public ResultSet rs;
        
        public frmCad_Produto() 
        {initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
       
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root","");
            st = (Statement)con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");
        }
        ListarP();
       
    }
        private void ListarP(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM pizza";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String descricao = (rs.getString("descricao"));
               
               
                modelo.addRow(new Object[]{codigo,nome,valor,valorbroto,tipo,descricao});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
        private void ListarB(){
    try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM bebida";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
               
               
                modelo.addRow(new Object[]{codigo,nome,valor});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
    
    }
        private void Limpar(){
        txtNome.setText("");
        txtValor.setText("");
        txtValor2.setText("");
        txtDescricao.setText("");
        txtCodigo.setText("");
       
     }
     
        private void Sumir(){
        txtNome.setVisible(false);
        txtValor.setVisible(false);
        txtValor2.setVisible(false);
        txtDescricao.setVisible(false);
        txtCodigo.setVisible(false);
        lblNome.setVisible(false);
        lblValor.setVisible(false);
        lblValor2.setVisible(false);
        lblDescricao.setVisible(false);
        lblTipo.setVisible(false);
        lblCad.setVisible(false);
        lblDado.setVisible(false);
        lblCodigo.setVisible(false);
        cbxTipo.setVisible(false);
 
     }
        private void Aparecer(){
         if(lblCad.getText().equals("CADASTRO DE PIZZA:")){ 
        txtNome.setVisible(true);
        txtValor.setVisible(true);
        txtValor2.setVisible(true);
        txtDescricao.setVisible(true);
        txtCodigo.setVisible(true);
        lblNome.setVisible(true);
        lblValor.setVisible(true);
        lblValor2.setVisible(true);
        lblDescricao.setVisible(true);
        lblTipo.setVisible(true);
        lblCad.setVisible(true);
        lblDado.setVisible(true);
        lblCodigo.setVisible(true);
        cbxTipo.setVisible(true);
        
     }else{
             lblCad.setVisible(true);
        lblDado.setVisible(true);
        lblDescricao.setVisible(false);
        lblNome.setVisible(true);
        lblTipo.setVisible(false);
        lblValor.setVisible(true);
        lblValor2.setVisible(false);
        txtDescricao.setVisible(false);
        txtNome.setVisible(true);
        txtValor.setVisible(true);
        txtValor2.setVisible(false);
        txtCodigo.setVisible(true);
        jspDescricao.setVisible(false);
        lblCodigo.setVisible(true);
        cbxTipo.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBebida = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        btnPizza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPizza = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblCad = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jspDescricao = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextPane();
        txtValor = new javax.swing.JFormattedTextField();
        txtValor2 = new javax.swing.JFormattedTextField();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro de produtos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/HOME.png"))); // NOI18N
        lblMenu.setText(" Início");
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblCardapio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPedidos)
                .addGap(18, 18, 18)
                .addComponent(lblCadastro)
                .addGap(18, 18, 18)
                .addComponent(lblRelatorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("PRODUTO");

        btnBebida.setBackground(new java.awt.Color(0, 102, 204));
        btnBebida.setForeground(new java.awt.Color(255, 255, 255));
        btnBebida.setText("NOVA BEBIDA");
        btnBebida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidaActionPerformed(evt);
            }
        });

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

        btnPizza.setBackground(new java.awt.Color(0, 102, 204));
        btnPizza.setForeground(new java.awt.Color(255, 255, 255));
        btnPizza.setText("NOVA PIZZA");
        btnPizza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizzaActionPerformed(evt);
            }
        });

        jtPizza.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do produto", "Valor", "Valor Broto", "Tipo", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPizzaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPizza);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Pesquisar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblCad.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCad.setForeground(new java.awt.Color(0, 153, 153));
        lblCad.setText("CADASTRO DE PIZZA:");

        lblDado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDado.setText("Dados do Pizza:");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNome.setText("Nome da Pizza:");

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblValor.setText("Valor:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblValor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblValor2.setText("Valor da broto:");

        lblTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTipo.setText("Tipo:");

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR CADASTRO");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 153, 51));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CONCLUIR CADASTRO");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR CADASTRO");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jspDescricao.setViewportView(txtDescricao);

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtValor2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodigo.setText("Código:");

        cbxTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salgada", "Doce" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDado)
                    .addComponent(lblCad))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValor2))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTipo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(303, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCad)
                .addGap(16, 16, 16)
                .addComponent(lblDado)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblCodigo))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor2)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(lblDescricao)
                .addGap(18, 18, 18)
                .addComponent(jspDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidaActionPerformed
        // TODO add your handling code here:
        lblCad.setVisible(true);
        lblDado.setVisible(true);
        lblDescricao.setVisible(false);
        lblNome.setVisible(true);
        lblTipo.setVisible(false);
        lblValor.setVisible(true);
        lblValor2.setVisible(false);
        txtDescricao.setVisible(false);
        txtNome.setVisible(true);
        txtValor.setVisible(true);
        txtValor2.setVisible(false);
        txtCodigo.setVisible(true);
        jspDescricao.setVisible(false);
        lblCodigo.setVisible(true);
        cbxTipo.setVisible(false);
        lblCad.setText("CADASTRO DE BEBIDA:");
        lblNome.setText("Nome da Bebida:");
        lblDado.setText("Dados da Bebida:");
        
        Limpar();
        ListarB();
    }//GEN-LAST:event_btnBebidaActionPerformed

    private void btnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaActionPerformed
        // TODO add your handling code here:
        lblCad.setVisible(true);
        lblDado.setVisible(true);
        lblDescricao.setVisible(true);
        lblNome.setVisible(true);
        lblTipo.setVisible(true);
        lblValor.setVisible(true);
        lblValor2.setVisible(true);
        txtDescricao.setVisible(true);
        txtNome.setVisible(true);
        txtValor.setVisible(true);
        txtValor2.setVisible(true);
        txtCodigo.setVisible(true);
        jspDescricao.setVisible(true);
        lblCodigo.setVisible(true);
        cbxTipo.setVisible(true);
        lblCad.setText("CADASTRO DE PIZZA:");
        lblNome.setText("Nome da Pizza:");
        lblDado.setText("Dados da Pizza:");
        
        Limpar();
        ListarP();
    }//GEN-LAST:event_btnPizzaActionPerformed

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        frmTelaInicial tela = new frmTelaInicial();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblCardapioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCardapioMouseClicked
        // TODO add your handling code here:
        frmCardapio_Pesquisa tela = new frmCardapio_Pesquisa();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCardapioMouseClicked

    private void lblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPedidosMouseClicked
        // TODO add your handling code here:
        frmPedido_Cliente tela = new frmPedido_Cliente();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblPedidosMouseClicked

    private void lblCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroMouseClicked
        // TODO add your handling code here:
        frmCadastro tela = new frmCadastro();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblCadastroMouseClicked

    private void lblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatoriosMouseClicked
        // TODO add your handling code here:
        frmRelatorio tela = new frmRelatorio();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblRelatoriosMouseClicked

    private void jtPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPizzaMouseClicked
        // TODO add your handling code here:
        Aparecer();
        if(lblCad.getText().equals("CADASTRO DE PIZZA:")){
        int n = 0;
        txtCodigo.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());
        txtNome.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 1).toString());
        txtValor.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 2).toString());
        txtValor2.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 3).toString());
        if(cbxTipo.getSelectedItem().toString() == "Salgada" ||cbxTipo.getSelectedItem().toString() == "Doce" ){
             switch(jtPizza.getValueAt(jtPizza.getSelectedRow(), 4).toString()){
            
            case "Salgada":
                n = 0;
                break;
            case "Doce":
                n=1;
                break;
        }
             cbxTipo.setSelectedIndex(n);
        }
        txtDescricao.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 5).toString());
        }else{
            txtCodigo.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());
            txtNome.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 1).toString());
            txtValor.setText(jtPizza.getValueAt(jtPizza.getSelectedRow(), 2).toString());
        }
        
        
    }//GEN-LAST:event_jtPizzaMouseClicked

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        if(lblCad.getText().equals("CADASTRO DE PIZZA:")){
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM pizza WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR tipo LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR valor LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String descricao = (rs.getString("descricao"));
                
                modelo.addRow(new Object[]{codigo,nome,valor,valorbroto,tipo,descricao});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }else{
            try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM bebida WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR valor LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                
                modelo.addRow(new Object[]{codigo,nome,valor});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if(lblCad.getText().equals("CADASTRO DE PIZZA:")){
        try{
            String nome, valor, valorbroto, tipo, descricao;
            nome = txtNome.getText();
            valor = txtValor.getText().replaceAll(",", ".");
            valorbroto = txtValor2.getText().replaceAll(",", ".");
            tipo = cbxTipo.getSelectedItem().toString();
            descricao = txtDescricao.getText();
            String sql = "insert into pizza (nome, valor, valorbroto, tipo, descricao) values ('"+nome+"','"+valor+"','"+valorbroto+"','"+tipo+"','"+descricao+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro gravado");
            ListarP();
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não gravado");
            ListarP();
        }
        }else{
            try{
            String nome, valor;
            nome = txtNome.getText();
            valor = txtValor.getText().replaceAll(",", ".");   
            String sql = "insert into bebida (nome, valor) values ('"+nome+"','"+valor+"')";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro gravado");
            ListarB();
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não gravado");
            ListarB();
        }
        }

        Limpar();
        Sumir();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if(lblCad.getText().equals("CADASTRO DE PIZZA:")){ 
        try{
            
            String sql = "DELETE FROM pizza where id = '"+txtCodigo.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro Deletedo");
            ListarP();
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "não Deletado");
            ListarP();
        }
        }else{
          try{
            
            String sql = "DELETE FROM bebida where id = '"+txtCodigo.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro Deletedo");
            ListarB();
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "não Deletado");
            ListarB();
        }  
        }

        Limpar();
        Sumir();
         
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     if(lblCad.getText().equals("CADASTRO DE PIZZA:")){ 
         try{
            String nome, valor, valorbroto, tipo, descricao,codigo;
            
            nome = txtNome.getText();
            valor = txtValor.getText().replaceAll(",", ".");
            valorbroto = txtValor2.getText().replaceAll(",", ".");
            tipo = cbxTipo.getSelectedItem().toString();
            descricao = txtDescricao.getText();
            codigo = txtCodigo.getText();
            String sql = "UPDATE pizza SET nome = '"+nome+"',valor = '"+valor+"',valorbroto = '"+valorbroto+"',tipo = '"+tipo+"', descricao = '"+descricao+"' where id = '"+codigo+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro gravado");
            ListarP();
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não gravado");
            ListarP();
        }
     }else{
        try{
            String nome, valor, codigo;
            
            nome = txtNome.getText();
            valor = txtValor.getText().replaceAll(",", ".");
            codigo = txtCodigo.getText();
            String sql = "UPDATE bebida SET nome = '"+nome+"',valor = '"+valor+"' where id = '"+codigo+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Registro gravado");
            ListarB();
        }catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não gravado");
            ListarB();
        } 
     }

        Limpar();
        Sumir();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:
        if(lblCad.getText().equals("CADASTRO DE PIZZA:")){
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM pizza WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR tipo LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR valor LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                String tipo = (rs.getString("tipo"));
                String descricao = (rs.getString("descricao"));
                
                modelo.addRow(new Object[]{codigo,nome,valor,valorbroto,tipo,descricao});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }else{
            try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM bebida WHERE nome LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR id LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR valor LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                
                modelo.addRow(new Object[]{codigo,nome,valor});      
            
            }
            
    
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(frmCad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCad_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCad_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPizza;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jspDescricao;
    private javax.swing.JTable jtPizza;
    private javax.swing.JLabel lblCad;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextPane txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtValor;
    private javax.swing.JFormattedTextField txtValor2;
    // End of variables declaration//GEN-END:variables
}
