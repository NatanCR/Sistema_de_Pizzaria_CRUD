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
 * @author natan
 */
public class frmPedido_Sacola extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public String id1= null, id2= null, id3= null, idb= null, qtd= null, borda= null, obs= null, tamanho= null, valorf= null;

    float vFinal = 0;

    public frmPedido_Sacola() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzaria", "root", "");
            st = (Statement) con.createStatement();
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso");
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "não, Conectado");
        }
        ListarP();
        ListarSacola();
        txtNomeCliente.setText(frmPedido_Cliente.nome);

        txtValor1.setText("0.00");
        txtValor2.setText("0.00");
        txtValor3.setText("0.00");

        lblCodItem2.setVisible(false);
        txtCod_produto2.setVisible(false);
        lblCodItem3.setVisible(false);
        txtCod_produto3.setVisible(false);
        lblProduto2.setVisible(false);
        txtProduto2.setVisible(false);
        lblProduto3.setVisible(false);
        txtProduto3.setVisible(false);
        lblvalor2.setVisible(false);
        txtValor2.setVisible(false);
        lblvalor3.setVisible(false);
        txtValor3.setVisible(false);

    }
    
    public void Limpar(){
        txtCod_produto1.setText("");
        txtCod_produto2.setText("");
        txtCod_produto3.setText("");
        txtProduto1.setText("");
        txtProduto2.setText("");
        txtProduto3.setText("");
        txtValor1.setText("0.00");
        txtValor2.setText("0.00");
        txtValor3.setText("0.00");
        txtVFinal.setText("");
        txtObs.setText("");
        txtQuantidade.setText("");
        vFinal = 0;
        cbxBorda.setSelectedIndex(0);
    }

    private void ListarP() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
            modelo.setNumRows(0);

            String sql = "SELECT id, nome, valor, valorbroto FROM pizza";

            rs = st.executeQuery(sql);
            while (rs.next()) {

                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));

                modelo.addRow(new Object[]{codigo, nome, valor, valorbroto});

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }

    private void ListarB() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
            modelo.setNumRows(0);

            String sql = "SELECT id, nome, valor FROM bebida";

            rs = st.executeQuery(sql);
            while (rs.next()) {

                String codigo = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));

                modelo.addRow(new Object[]{codigo, nome, valor});

            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }

    }

    private void ListarSacola() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jtSacola.getModel();
            modelo.setNumRows(0);

            String sql = "select x.nome, y.nome, z.nome, I.borda, B.nome, I.obs, I.valorf, I.qtd, I.tamanho from aux_item as I " +
                        "left join bebida as B on I.id_bebida = B.id " +
                        "left join pizza as X on I.id_pizza = X.id " +
                        "left join pizza as Y on I.id_pizza2 = Y.id " +
                        "left join pizza as Z on I.id_pizza3 = Z.id ";

            rs = st.executeQuery(sql);
            while (rs.next()) {
                float valorF = 0;

                String pizza = (rs.getString("X.nome"));
                String pizza2 = (rs.getString("Y.nome"));
                String pizza3 = (rs.getString("Z.nome"));
                String bebida = (rs.getString("B.nome"));
                int qtd = (rs.getInt("qtd"));
                String borda = (rs.getString("borda"));
                String obs = (rs.getString("obs"));
                float valor = (rs.getFloat("valorf"));
                String tamanho = (rs.getString("tamanho"));
                
                valorF = qtd * valor;

                if(pizza == null){
                 pizza = "-"  ; 
                }
                if(pizza2 == null){
                 pizza2 = "-"  ; 
                }
                if(pizza3 == null){
                 pizza3 = "-"  ; 
                }
                if(bebida == null){
                 bebida = "-"  ; 
                }
                if(obs == null){
                 obs = "-"  ; 
                }
                if(tamanho == null){
                 tamanho = "-"  ; 
                }
                if(borda == null){
                 borda = "-"  ; 
                }
                modelo.addRow(new Object[]{pizza, pizza2, pizza3, borda , tamanho, bebida, obs, valor, qtd, valorF});

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblRelatorios = new javax.swing.JLabel();
        lblCadastro = new javax.swing.JLabel();
        lblPedidos = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblControlPedidos = new javax.swing.JLabel();
        lblCodItem1 = new javax.swing.JLabel();
        txtProduto1 = new javax.swing.JTextField();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        btnIrPagmento = new javax.swing.JButton();
        btnCancelaPedido = new javax.swing.JButton();
        txtValor1 = new javax.swing.JTextField();
        txtCod_produto1 = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtSacola = new javax.swing.JTable();
        lblProduto1 = new javax.swing.JLabel();
        lblvalor1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPizza = new javax.swing.JTable();
        cbxProduto = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        cbxTamanho = new javax.swing.JComboBox<>();
        lblProduto2 = new javax.swing.JLabel();
        txtProduto2 = new javax.swing.JTextField();
        cbxDivisao = new javax.swing.JComboBox<>();
        lblProduto3 = new javax.swing.JLabel();
        txtProduto3 = new javax.swing.JTextField();
        lblCodItem2 = new javax.swing.JLabel();
        txtCod_produto2 = new javax.swing.JTextField();
        lblCodItem3 = new javax.swing.JLabel();
        txtCod_produto3 = new javax.swing.JTextField();
        lblvalor2 = new javax.swing.JLabel();
        txtValor2 = new javax.swing.JTextField();
        lblvalor3 = new javax.swing.JLabel();
        txtValor3 = new javax.swing.JTextField();
        lblVFinal = new javax.swing.JLabel();
        txtVFinal = new javax.swing.JTextField();
        cbxBorda = new javax.swing.JComboBox<>();
        lblObs = new javax.swing.JLabel();
        txtObs = new javax.swing.JTextField();
        btnMais1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dom Giolo - Pizzaria");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(575, 575, 575))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCardapio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblControlPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblControlPedidos.setForeground(new java.awt.Color(0, 153, 153));
        lblControlPedidos.setText("CONTROLE DE PEDIDOS:");

        lblCodItem1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodItem1.setText("Código Item:");

        txtProduto1.setEditable(false);
        txtProduto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNomeCliente.setText("Nome do Cliente:");

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblQuantidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnIrPagmento.setBackground(new java.awt.Color(0, 153, 51));
        btnIrPagmento.setForeground(new java.awt.Color(255, 255, 255));
        btnIrPagmento.setText("Ir para Pagamento");
        btnIrPagmento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIrPagmento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIrPagmentoMouseClicked(evt);
            }
        });

        btnCancelaPedido.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelaPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelaPedido.setText("Cancelar Pedido");
        btnCancelaPedido.setToolTipText("");
        btnCancelaPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaPedidoActionPerformed(evt);
            }
        });

        txtValor1.setEditable(false);
        txtValor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCod_produto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCod_produto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_produto1ActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 0, 0));
        btnMenos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(0, 153, 51));
        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtSacola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtSacola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parte 1", "Parte 2", "Parte 3", "Borda", "Tamanho", "Bebida", "Observação", "Valor", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtSacola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtSacolaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtSacola);

        lblProduto1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProduto1.setText("Produto:");

        lblvalor1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblvalor1.setText("Valor:");

        jtPizza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do produto", "Valor", "Valor Broto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane2.setViewportView(jtPizza);

        cbxProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizzas", "Bebidas" }));
        cbxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProdutoActionPerformed(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        btnPesquisa.setBackground(new java.awt.Color(0, 153, 51));
        btnPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisa.setText("PESQUISAR");
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        cbxTamanho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Broto" }));
        cbxTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTamanhoActionPerformed(evt);
            }
        });

        lblProduto2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProduto2.setText("Produto:");

        txtProduto2.setEditable(false);
        txtProduto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxDivisao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxDivisao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inteira", "1/2", "1/3" }));
        cbxDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDivisaoActionPerformed(evt);
            }
        });

        lblProduto3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblProduto3.setText("Produto:");

        txtProduto3.setEditable(false);
        txtProduto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCodItem2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodItem2.setText("Código Item:");

        txtCod_produto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCod_produto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_produto2ActionPerformed(evt);
            }
        });

        lblCodItem3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCodItem3.setText("Código Item:");

        txtCod_produto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCod_produto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_produto3ActionPerformed(evt);
            }
        });

        lblvalor2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblvalor2.setText("Valor:");

        txtValor2.setEditable(false);
        txtValor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblvalor3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblvalor3.setText("Valor:");

        txtValor3.setEditable(false);
        txtValor3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblVFinal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblVFinal.setText("Valor Final:");

        txtVFinal.setEditable(false);
        txtVFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbxBorda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbxBorda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sem borda recheada", "Borda de Catupiry", "Borda de Cheddar", "Borda de Cream Cheese", "Borda de Gergelim", "Borda de Mussarela", "Borda de Chocolate", "Borda de Catupiry + Gergelim", "Borda de Cheddar + Gergelim", "Borda de Cream Cheese + Gergelim", "Borda de Mussarela + Gergelim", " " }));

        lblObs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblObs.setText("Observação:");

        txtObs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnMais1.setBackground(new java.awt.Color(0, 153, 51));
        btnMais1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMais1.setForeground(new java.awt.Color(255, 255, 255));
        btnMais1.setText("+");
        btnMais1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMais1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblControlPedidos)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbxTamanho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbxDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCodItem1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod_produto1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCodItem2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod_produto2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCodItem3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCod_produto3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblProduto2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(lblProduto1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblvalor2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblvalor1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLimpar))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblProduto3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblvalor3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVFinal)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblQuantidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(btnMais1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(905, 905, 905)
                        .addComponent(txtVFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeCliente)
                        .addGap(249, 249, 249)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(724, 724, 724)
                        .addComponent(btnCancelaPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIrPagmento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblControlPedidos)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblNomeCliente)
                                        .addGap(1, 1, 1)
                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(cbxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addComponent(cbxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisa))
                        .addGap(0, 176, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodItem1)
                    .addComponent(txtCod_produto1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto1)
                    .addComponent(txtProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalor1)
                    .addComponent(txtValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVFinal)
                    .addComponent(txtVFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduto2)
                    .addComponent(txtProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodItem2)
                    .addComponent(txtCod_produto2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalor2)
                    .addComponent(txtValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto3)
                    .addComponent(lblCodItem3)
                    .addComponent(txtCod_produto3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblvalor3)
                    .addComponent(txtValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMais1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblObs))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIrPagmento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrPagmentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIrPagmentoMouseClicked
        // TODO add your handling code here:
        frmPedido_Pagamento tela = new frmPedido_Pagamento();
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIrPagmentoMouseClicked

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

    private void jtPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPizzaMouseClicked
        // TODO add your handling code here:

        if (cbxProduto.getSelectedItem().equals("Pizzas")) {
            int n = 0;
            String id = "";

            try {
                id = (jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());

                String sql = "SELECT nome, valor, valorbroto FROM pizza where id = " + id + "";
                rs = st.executeQuery(sql);
                while (rs.next()) {

                    if (txtCod_produto1.getText().equals("")) {
                        String nome = (rs.getString("nome"));
                        String valor = (rs.getString("valor"));
                        String valor2 = (rs.getString("valorbroto"));

                        txtProduto1.setText(nome);

                        if (cbxTamanho.getSelectedItem().equals("Grande")) {
                            txtValor1.setText(valor);
                            if (Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor3.getText())) {
                                vFinal = Float.parseFloat(txtValor1.getText());
                                txtVFinal.setText("" + vFinal);
                            }
                        } else {
                            txtValor1.setText(valor2);
                            if (Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor3.getText())) {
                                vFinal = Float.parseFloat(txtValor1.getText());
                                txtVFinal.setText("" + vFinal);
                            }
                        }
                        txtCod_produto1.setText(id);
                    } else if (txtCod_produto2.getText().equals("")) {

                        if (txtCod_produto2.isVisible()) {
                            String nome = (rs.getString("nome"));
                            String valor = (rs.getString("valor"));
                            String valor2 = (rs.getString("valorbroto"));

                            txtProduto2.setText(nome);

                            if (cbxTamanho.getSelectedItem().equals("Grande")) {
                                txtValor2.setText(valor);
                                if (Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor3.getText())) {
                                    vFinal = Float.parseFloat(txtValor2.getText());
                                    txtVFinal.setText("" + vFinal);
                                }
                            } else {
                                txtValor2.setText(valor2);
                                if (Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor3.getText())) {
                                    vFinal = Float.parseFloat(txtValor2.getText());
                                    txtVFinal.setText("" + vFinal);
                                }
                            }
                            txtCod_produto2.setText(id);
                        }
                    } else if (txtCod_produto3.getText().equals("")) {

                        if (txtCod_produto3.isVisible()) {
                            String nome = (rs.getString("nome"));
                            String valor = (rs.getString("valor"));
                            String valor2 = (rs.getString("valorbroto"));

                            txtProduto3.setText(nome);

                            if (cbxTamanho.getSelectedItem().equals("Grande")) {
                                txtValor3.setText(valor);
                                if (Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor2.getText())) {
                                    vFinal = Float.parseFloat(txtValor3.getText());
                                    txtVFinal.setText("" + vFinal);
                                }
                            } else {
                                txtValor3.setText(valor2);
                                if (Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor2.getText())) {
                                    vFinal = Float.parseFloat(txtValor3.getText());
                                    txtVFinal.setText("" + vFinal);
                                }
                            }
                            txtCod_produto3.setText(id);
                        }
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
        } else {
            String id = "";
            try {
                id = (jtPizza.getValueAt(jtPizza.getSelectedRow(), 0).toString());

                String sql = "SELECT * FROM bebida where id = " + id + "";
                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));

                    txtProduto1.setText(nome);
                    txtValor1.setText(valor);
                    txtCod_produto1.setText(id);
                }

                txtVFinal.setText(txtValor1.getText());
            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_jtPizzaMouseClicked

    private void cbxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProdutoActionPerformed
        // TODO add your handling code here:
        if ("Pizzas".equals(cbxProduto.getSelectedItem().toString())) {
            ListarP();
            cbxTamanho.setVisible(true);
            cbxBorda.setVisible(true);
            cbxBorda.setSelectedIndex(0);
            cbxDivisao.setVisible(true);
            cbxDivisao.setSelectedIndex(0);
            lblObs.setVisible(true);
            txtObs.setVisible(true);
            if (cbxDivisao.getSelectedItem().equals("Inteira")) {
                lblCodItem2.setVisible(false);
                txtCod_produto2.setVisible(false);
                lblCodItem3.setVisible(false);
                txtCod_produto3.setVisible(false);
                lblProduto2.setVisible(false);
                txtProduto2.setVisible(false);
                lblProduto3.setVisible(false);
                txtProduto3.setVisible(false);
                lblvalor2.setVisible(false);
                txtValor2.setVisible(false);
                lblvalor3.setVisible(false);
                txtValor3.setVisible(false);
            } else if (cbxDivisao.getSelectedItem().equals("1/2")) {
                lblCodItem2.setVisible(true);
                txtCod_produto2.setVisible(true);
                lblCodItem3.setVisible(false);
                txtCod_produto3.setVisible(false);
                lblProduto2.setVisible(true);
                txtProduto2.setVisible(true);
                lblProduto3.setVisible(false);
                txtProduto3.setVisible(false);
                lblvalor2.setVisible(true);
                txtValor2.setVisible(true);
                lblvalor3.setVisible(false);
                txtValor3.setVisible(false);
            } else {
                lblCodItem2.setVisible(true);
                txtCod_produto2.setVisible(true);
                lblCodItem3.setVisible(true);
                txtCod_produto3.setVisible(true);
                lblProduto2.setVisible(true);
                txtProduto2.setVisible(true);
                lblProduto3.setVisible(true);
                txtProduto3.setVisible(true);
                lblvalor2.setVisible(true);
                txtValor2.setVisible(true);
                lblvalor3.setVisible(true);
                txtValor3.setVisible(true);
            }
        } else {
            ListarB();
            cbxBorda.setVisible(false);
            cbxTamanho.setVisible(false);
            cbxDivisao.setVisible(false);
            lblObs.setVisible(false);
            txtObs.setVisible(false);
            lblCodItem2.setVisible(false);
            txtCod_produto2.setVisible(false);
            lblCodItem3.setVisible(false);
            txtCod_produto3.setVisible(false);
            lblProduto2.setVisible(false);
            txtProduto2.setVisible(false);
            lblProduto3.setVisible(false);
            txtProduto3.setVisible(false);
            lblvalor2.setVisible(false);
            txtValor2.setVisible(false);
            lblvalor3.setVisible(false);
            txtValor3.setVisible(false);

        }

    }//GEN-LAST:event_cbxProdutoActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        // TODO add your handling code here:

        if ("Pizzas".equals(cbxProduto.getSelectedItem().toString())) {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
                modelo.setNumRows(0);

                String sql = "SELECT * FROM pizza WHERE nome LIKE '%" + txtPesquisa.getText() + "%'"
                        + " OR id LIKE '%" + txtPesquisa.getText() + "%'";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String codigo = (rs.getString("id"));
                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));
                    String valorbroto = (rs.getString("valorbroto"));
                    String tipo = (rs.getString("tipo"));
                    String descricao = (rs.getString("descricao"));

                    modelo.addRow(new Object[]{codigo, nome, valor, valorbroto, tipo, descricao});

                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
        } else {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
                modelo.setNumRows(0);

                String sql = "SELECT * FROM bebida WHERE nome LIKE '%" + txtPesquisa.getText() + "%'"
                        + " OR id LIKE '%" + txtPesquisa.getText() + "%'";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String codigo = (rs.getString("id"));
                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));

                    modelo.addRow(new Object[]{codigo, nome, valor});

                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btnCancelaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaPedidoActionPerformed
        // TODO add your handling code here:
        frmPedido_Cliente.telefone = "";
        frmPedido_Cliente.nome = "";
        frmPedido_Cliente tela = new frmPedido_Cliente();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelaPedidoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
         
        if ("Pizzas".equals(cbxProduto.getSelectedItem().toString())) {
            try {
             
            DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
           modelo.setNumRows(0);
           
            
            String sql = "SELECT * FROM pizza WHERE id LIKE '%"+txtPesquisa.getText()+"%'"
                    +" OR nome LIKE '%"+txtPesquisa.getText()+"%'";
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                 
                
                String id = (rs.getString("id"));
                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valorbroto = (rs.getString("valorbroto"));
                
                modelo.addRow(new Object[]{id,nome,valor,valorbroto});      
            
            }
            
             }
         catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        } else {
            try {
                DefaultTableModel modelo = (DefaultTableModel) jtPizza.getModel();
                modelo.setNumRows(0);

                String sql = "SELECT * FROM bebida WHERE nome LIKE '%" + txtPesquisa.getText() + "%'"
                        + " OR id LIKE '%" + txtPesquisa.getText() + "%'";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String codigo = (rs.getString("id"));
                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));

                    modelo.addRow(new Object[]{codigo, nome, valor});

                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void cbxTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTamanhoActionPerformed
        // TODO add your handling code here:
        
            try {
                
                String sql = "SELECT valor, valorbroto FROM pizza WHERE id = " + txtCod_produto1.getText() + "";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String valor = (rs.getString("valor"));
                    String valor2 = (rs.getString("valorbroto"));

                    if (cbxTamanho.getSelectedItem().equals("Grande")) {
                        txtValor1.setText(valor);
                    } else {
                        txtValor1.setText(valor2);
                    }
                }
                sql = "SELECT valor, valorbroto FROM pizza WHERE id = " + txtCod_produto2.getText() + "";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String valor = (rs.getString("valor"));
                    String valor2 = (rs.getString("valorbroto"));

                    if (cbxTamanho.getSelectedItem().equals("Grande")) {
                        txtValor2.setText(valor);
                    } else {
                        txtValor2.setText(valor2);
                    }
                }
                sql = "SELECT valor, valorbroto FROM pizza WHERE id = " + txtCod_produto3.getText() + "";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String valor = (rs.getString("valor"));
                    String valor2 = (rs.getString("valorbroto"));

                    if (cbxTamanho.getSelectedItem().equals("Grande")) {
                        txtValor3.setText(valor);
                    } else {
                        txtValor3.setText(valor2);
                    }
                }
                
                if (Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor3.getText())) {
                vFinal = Float.parseFloat(txtValor1.getText());
                txtVFinal.setText("" + vFinal);
            }else if (Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor3.getText())) {
                vFinal = Float.parseFloat(txtValor2.getText());
                txtVFinal.setText("" + vFinal);
            }else if (Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor1.getText())) {
                vFinal = Float.parseFloat(txtValor3.getText());
                txtVFinal.setText("" + vFinal);
            }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }

        

    }//GEN-LAST:event_cbxTamanhoActionPerformed

    private void cbxDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDivisaoActionPerformed
        // TODO add your handling code here:

        if (cbxDivisao.getSelectedItem().equals("Inteira")) {
            lblCodItem2.setVisible(false);
            txtCod_produto2.setVisible(false);
            lblCodItem3.setVisible(false);
            txtCod_produto3.setVisible(false);
            lblProduto2.setVisible(false);
            txtProduto2.setVisible(false);
            lblProduto3.setVisible(false);
            txtProduto3.setVisible(false);
            lblvalor2.setVisible(false);
            txtValor2.setVisible(false);
            lblvalor3.setVisible(false);
            txtValor3.setVisible(false);
        } else if (cbxDivisao.getSelectedItem().equals("1/2")) {
            lblCodItem2.setVisible(true);
            txtCod_produto2.setVisible(true);
            lblCodItem3.setVisible(false);
            txtCod_produto3.setVisible(false);
            lblProduto2.setVisible(true);
            txtProduto2.setVisible(true);
            lblProduto3.setVisible(false);
            txtProduto3.setVisible(false);
            lblvalor2.setVisible(true);
            txtValor2.setVisible(true);
            lblvalor3.setVisible(false);
            txtValor3.setVisible(false);
        } else {
            lblCodItem2.setVisible(true);
            txtCod_produto2.setVisible(true);
            lblCodItem3.setVisible(true);
            txtCod_produto3.setVisible(true);
            lblProduto2.setVisible(true);
            txtProduto2.setVisible(true);
            lblProduto3.setVisible(true);
            txtProduto3.setVisible(true);
            lblvalor2.setVisible(true);
            txtValor2.setVisible(true);
            lblvalor3.setVisible(true);
            txtValor3.setVisible(true);
        }

    }//GEN-LAST:event_cbxDivisaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtCod_produto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_produto1ActionPerformed
        // TODO add your handling code here:
        if ("Pizzas".equals(cbxProduto.getSelectedItem().toString())) {
            try {
                String sql = "SELECT nome, valor, valorbroto FROM pizza WHERE id = " + txtCod_produto1.getText() + "";

                rs = st.executeQuery(sql);
                while (rs.next()) {

                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));
                    String valor2 = (rs.getString("valorbroto"));

                    txtProduto1.setText(nome);
                    if (cbxTamanho.getSelectedItem().equals("Grande")) {
                        txtValor1.setText(valor);
                    } else {
                        txtValor1.setText(valor2);
                    }
                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
            if (Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor1.getText()) > Float.parseFloat(txtValor3.getText())) {
                vFinal = Float.parseFloat(txtValor1.getText());
                txtVFinal.setText("" + vFinal);
            }
        } else {
            try {

                String sql = "SELECT * FROM bebida WHERE id = " + txtCod_produto1.getText() + "";

                rs = st.executeQuery(sql);
                while (rs.next()) {
                    String nome = (rs.getString("nome"));
                    String valor = (rs.getString("valor"));

                    txtProduto1.setText(nome);
                    txtValor1.setText(valor);
                }

            } catch (SQLException e) {
                System.err.println("Error: " + e);
            }
            txtVFinal.setText(txtValor1.getText());
        }
    }//GEN-LAST:event_txtCod_produto1ActionPerformed

    private void txtCod_produto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_produto2ActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "SELECT * FROM pizza WHERE id = " + txtCod_produto2.getText() + "";

            rs = st.executeQuery(sql);
            while (rs.next()) {

                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valor2 = (rs.getString("valorbroto"));

                txtProduto2.setText(nome);
                if (cbxTamanho.getSelectedItem().equals("Grande")) {
                    txtValor2.setText(valor);
                } else {
                    txtValor2.setText(valor2);
                }
            }

            if (Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor1.getText()) && Float.parseFloat(txtValor2.getText()) > Float.parseFloat(txtValor3.getText())) {
                vFinal = Float.parseFloat(txtValor2.getText());
                txtVFinal.setText("" + vFinal);
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_txtCod_produto2ActionPerformed

    private void txtCod_produto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_produto3ActionPerformed
        // TODO add your handling code here:
        try {

            String sql = "SELECT * FROM pizza WHERE id = " + txtCod_produto3.getText() + "";

            rs = st.executeQuery(sql);
            while (rs.next()) {

                String nome = (rs.getString("nome"));
                String valor = (rs.getString("valor"));
                String valor2 = (rs.getString("valorbroto"));

                txtProduto3.setText(nome);
                if (cbxTamanho.getSelectedItem().equals("Grande")) {
                    txtValor3.setText(valor);
                } else {
                    txtValor3.setText(valor2);
                }
            }
            if (Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor2.getText()) && Float.parseFloat(txtValor3.getText()) > Float.parseFloat(txtValor1.getText())) {
                vFinal = Float.parseFloat(txtValor3.getText());
                txtVFinal.setText("" + vFinal);
            }

        } catch (SQLException e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_txtCod_produto3ActionPerformed

    private void btnMais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMais1ActionPerformed
        // TODO add your handling code here:
        try{
            
            String cod1, cod2, cod3, valorF, borda, qtd, tamanho, obs;
        
            cod1 = txtCod_produto1.getText();
            cod2 = txtCod_produto2.getText();
            cod3 = txtCod_produto3.getText();
            valorF = txtVFinal.getText();
            borda = cbxBorda.getSelectedItem().toString();
            qtd = txtQuantidade.getText();
            tamanho = cbxTamanho.getSelectedItem().toString();
            obs = txtObs.getText();
            
            
            if(cbxProduto.getSelectedItem().equals("Bebidas")){
                String sql = "insert into aux_item (id_bebida, qtd, valorf) "
                    + "values ("+cod1+", "+qtd+", "+valorF+")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Adicionado");
            ListarSacola(); 
            Limpar();
            } else if(txtCod_produto2.isVisible() && txtCod_produto3.isVisible()){
            String sql = "insert into aux_item (id_pizza, id_pizza2, id_pizza3, qtd, borda, obs, tamanho, valorf) "
                    + "values ("+cod1+", "+cod2+", "+cod3+", "+qtd+", '"+borda+"', '"+obs+"', '"+tamanho+"', "+valorF+")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Adicionado");
            ListarSacola();
            Limpar();
            } else if(txtCod_produto2.isVisible() && txtCod_produto3.getText().equals("")){
                String sql = "insert into aux_item (id_pizza, id_pizza2, qtd, borda, obs, tamanho, valorf) "
                    + "values ("+cod1+", "+cod2+", "+qtd+", '"+borda+"', '"+obs+"', '"+tamanho+"', "+valorF+")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Adicionado");
            ListarSacola(); 
                Limpar();
            } else if(txtCod_produto2.getText().equals("") && txtCod_produto3.getText().equals("") && cbxProduto.getSelectedItem().equals("Pizzas")){
                String sql = "insert into aux_item (id_pizza, qtd, borda, obs, tamanho, valorf) "
                    + "values ("+cod1+", "+qtd+", '"+borda+"', '"+obs+"', '"+tamanho+"', "+valorF+")";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Adicionado");
            ListarSacola(); 
            Limpar();
            }
            
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos");
        }
    }//GEN-LAST:event_btnMais1ActionPerformed

    private void jtSacolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtSacolaMouseClicked
        // TODO add your handling code here:
        try{
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 0).toString().equals("-")){
            id1 = null;
        }else{
            id1 =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 0).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 1).toString().equals("-")){
            id2 = null;
        }else{
            id2 =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 1).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 2).toString().equals("-")){
            id3 = null;
        }else{
            id3 =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 2).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 3).toString().equals("-")){
            borda = null;
        }else{
            borda =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 3).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 4).toString().equals("-")){
            tamanho = null;
        }else{
            tamanho =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 4).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 5).toString().equals("-")){
            idb = null;
        }else{
            idb =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 5).toString());
        }
        if(jtSacola.getValueAt(jtSacola.getSelectedRow(), 6).toString().equals("-")){
            obs = null;
        }else{
            obs =(jtSacola.getValueAt(jtSacola.getSelectedRow(), 6).toString());
        }
        valorf = (jtSacola.getValueAt(jtSacola.getSelectedRow(), 7).toString());
        qtd = (jtSacola.getValueAt(jtSacola.getSelectedRow(), 8).toString());
        }catch (NullPointerException e) {
            System.err.println("Error: "+e);
            
        }
        
        try {
            if(id1 != null){
            String sql = "SELECT id FROM pizza WHERE nome = '"+id1+"'"; 
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                id1 = (rs.getString("id"));     
            
            }
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        
        try {
            
            if(id2 != null){
            String sql = "SELECT id FROM pizza WHERE nome = '"+id2+"'"; 
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                id2 = (rs.getString("id"));     
            
            }
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        try {
            
            if(id3 != null){
            String sql = "SELECT id FROM pizza WHERE nome = '"+id3+"'"; 
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                id3 = (rs.getString("id"));     
            
            }
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        try {
            
            if(idb != null){
            String sql = "SELECT id FROM bebida WHERE nome = '"+idb+"'"; 
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                
                idb = (rs.getString("id"));     
            
            }
            }
        } catch (SQLException e) {
            System.err.println("Error: "+e);
        }
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(borda);
        System.out.println(idb);
        System.out.println(tamanho);
        System.out.println(obs);
        System.out.println(qtd);
        System.out.println(valorf);
    }//GEN-LAST:event_jtSacolaMouseClicked

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        try{
            if(id1 != null && id2 == null && id3 == null && idb == null){
            String sql = "delete  from aux_item " +
                            "where id_pizza = "+id1+" " +
                            "and qtd = "+qtd+" " +
                            "and borda = '"+borda+"' " +
                            "and tamanho = '"+tamanho+"' " +
                            "and valorf = "+valorf;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Retirado");
            }else if(id1 != null && id2 != null && id3 == null && idb == null){
                String sql = "delete  from aux_item " +
                            "where id_pizza = "+id1+" " +
                            "and id_pizza2 = "+id2+" " +
                            "and qtd = "+qtd+" " +
                            "and borda = '"+borda+"' " +
                            "and tamanho = '"+tamanho+"' " +
                            "and valorf = "+valorf;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Retirado");
            }else if(id1 != null && id2 != null && id3 != null && idb == null){
                String sql = "delete  from aux_item " +
                            "where id_pizza = "+id1+" " +
                            "and id_pizza2 = "+id2+" " +
                            "and id_pizza3 = "+id3+" " +
                            "and qtd = "+qtd+" " +
                            "and borda = '"+borda+"' " +
                            "and tamanho = '"+tamanho+"' " +
                            "and valorf = "+valorf;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Retirado");
            }else if(id1 == null && id2 == null && id3 == null && idb != null){
                String sql = "delete  from aux_item " +
                            "where id_bebida = "+idb+" " +
                            "and qtd = "+qtd+" " +
                            "and valorf = "+valorf;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Item Retirado");
            }
        }catch(Exception e){
            System.out.println(e);
            
            JOptionPane.showMessageDialog(null, "Erro para retirar o pedido");
        }
        
        
        id1 = null;
        id2 = null;
        id3 = null;
        borda = null;
        tamanho = null;
        idb = null;
        obs = null;
        valorf = null;
        qtd = null;
        ListarSacola();
    }//GEN-LAST:event_btnMenosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPedido_Sacola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPedido_Sacola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPedido_Sacola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPedido_Sacola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPedido_Sacola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelaPedido;
    private javax.swing.JButton btnIrPagmento;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMais1;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JComboBox<String> cbxBorda;
    private javax.swing.JComboBox<String> cbxDivisao;
    private javax.swing.JComboBox<String> cbxProduto;
    private javax.swing.JComboBox<String> cbxTamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtPizza;
    private javax.swing.JTable jtSacola;
    private javax.swing.JLabel lblCadastro;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblCodItem1;
    private javax.swing.JLabel lblCodItem2;
    private javax.swing.JLabel lblCodItem3;
    private javax.swing.JLabel lblControlPedidos;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblObs;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JLabel lblProduto1;
    private javax.swing.JLabel lblProduto2;
    private javax.swing.JLabel lblProduto3;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblVFinal;
    private javax.swing.JLabel lblvalor1;
    private javax.swing.JLabel lblvalor2;
    private javax.swing.JLabel lblvalor3;
    private javax.swing.JTextField txtCod_produto1;
    private javax.swing.JTextField txtCod_produto2;
    private javax.swing.JTextField txtCod_produto3;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProduto1;
    private javax.swing.JTextField txtProduto2;
    private javax.swing.JTextField txtProduto3;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtVFinal;
    private javax.swing.JTextField txtValor1;
    private javax.swing.JTextField txtValor2;
    private javax.swing.JTextField txtValor3;
    // End of variables declaration//GEN-END:variables
}
