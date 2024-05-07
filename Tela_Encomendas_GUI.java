package View;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Encomendas_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    //---Variáveis - ENCOMENDA
    static int cod_encomenda = 0;
    static String produto_encomenda = "";
    static int qtde_encomenda = 0;
    static String tam_enco = "";
    static BigDecimal tamanho_encomenda;
    static String val_enco = "";
    static BigDecimal valor_encomenda;
    static String forma_pgt_encomenda = "";
    static String data_enco = "";
    static String enco_data_entrega = "";
    static String data_entrega_encomenda = "";
    //---Variáveis - CLIENTE
    static String nome_cliente = "";
    static String telefone_cliente = "";
    static String rua_cliente = "";
    static String num_cliente = "";
    static String bairro_cliente = "";
    static String cidade_cliente = "";
    
    //---REFRESH
    public void refresh(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            
            System.out.println("Realizado com sucesso");
            
            String sql = "SELECT enco_cod, enco_prod, enco_qtde, enco_data_entrega, enco_tamanho, enco_valor FROM encomenda";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabela_encomenda.setModel(Model.Atualizar_MOD.encomenda(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Tela_Encomendas_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atelie?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        encomendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Encomenda e");
        encomendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : encomendaQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        Caixa = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFormaPgtEnco = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCodEnco = new javax.swing.JTextField();
        txtRuaCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Excluir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtQtdeEnco = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTamanhoEnco = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JFormattedTextField();
        txtDataEnco = new javax.swing.JFormattedTextField();
        txtValorEnco = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        SalvarAlteracao = new javax.swing.JButton();
        txtProdutoEnco = new javax.swing.JTextField();
        Recibo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_encomenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jPanel4.setBackground(new java.awt.Color(255, 221, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        Sair.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Sair.setText("SAIR");
        Sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sair.setContentAreaFilled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel4.add(Sair);
        Sair.setBounds(10, 430, 110, 60);

        Encomenda.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Encomenda.setText("ENCOMENDAS");
        Encomenda.setToolTipText("Você está aqui");
        Encomenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Encomenda.setContentAreaFilled(false);
        jPanel4.add(Encomenda);
        Encomenda.setBounds(10, 150, 110, 60);

        Historico.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Historico.setText("HISTÓRICO");
        Historico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Historico.setContentAreaFilled(false);
        Historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoricoActionPerformed(evt);
            }
        });
        jPanel4.add(Historico);
        Historico.setBounds(10, 220, 110, 60);

        Cliente.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Cliente.setText("CLIENTES");
        Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cliente.setContentAreaFilled(false);
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        jPanel4.add(Cliente);
        Cliente.setBounds(10, 80, 110, 60);

        Estoque.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Estoque.setText("ESTOQUE");
        Estoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Estoque.setContentAreaFilled(false);
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        jPanel4.add(Estoque);
        Estoque.setBounds(10, 290, 110, 60);

        NovoPedido.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        NovoPedido.setText("NOVO PEDIDO");
        NovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NovoPedido.setContentAreaFilled(false);
        NovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoPedidoActionPerformed(evt);
            }
        });
        jPanel4.add(NovoPedido);
        NovoPedido.setBounds(10, 10, 110, 60);

        Caixa.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Caixa.setText("CAIXA");
        Caixa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Caixa.setContentAreaFilled(false);
        Caixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaActionPerformed(evt);
            }
        });
        jPanel4.add(Caixa);
        Caixa.setBounds(10, 360, 110, 60);

        jPanel7.setBackground(new java.awt.Color(255, 221, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setText("PRODUTO:");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(10, 40, 130, 20);

        txtBairroCliente.setEditable(false);
        txtBairroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtBairroCliente);
        txtBairroCliente.setBounds(250, 140, 180, 22);

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel18.setText("DATA DE ENTREGA:");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(10, 160, 130, 20);

        txtFormaPgtEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtFormaPgtEnco);
        txtFormaPgtEnco.setBounds(10, 140, 180, 22);

        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel19.setText("FORMA DE PAGAMENTO:");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 110, 160, 40);

        jLabel20.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel20.setText("CÓDIGO DA ENCOMENDA:");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(10, 0, 180, 20);

        txtCodEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCodEnco);
        txtCodEnco.setBounds(10, 20, 180, 22);

        txtRuaCliente.setEditable(false);
        txtRuaCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtRuaCliente);
        txtRuaCliente.setBounds(250, 100, 180, 22);

        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel26.setText("NÚMERO DA CASA:");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(250, 200, 130, 20);

        Excluir.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Excluir.setText("EXCLUIR");
        Excluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Excluir.setContentAreaFilled(false);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        jPanel7.add(Excluir);
        Excluir.setBounds(110, 255, 80, 30);

        jLabel24.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel24.setText("OUTRAS ESPECIFICAÇÕES:");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(20, 360, 170, 20);

        jLabel31.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel31.setText("OUTRAS ESPECIFICAÇÕES:");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(20, 360, 170, 20);

        jLabel25.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel25.setText("QUANTIDADE:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(10, 70, 130, 40);

        txtQtdeEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtQtdeEnco);
        txtQtdeEnco.setBounds(10, 100, 180, 22);

        jLabel28.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel28.setText("TAMANHO (KG):");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(10, 200, 110, 20);

        txtTamanhoEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtTamanhoEnco);
        txtTamanhoEnco.setBounds(10, 220, 70, 22);

        jLabel29.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel29.setText("CIDADE:");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(250, 160, 130, 20);

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNomeCliente);
        txtNomeCliente.setBounds(250, 20, 180, 22);

        jLabel30.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel30.setText("NOME DO CLIENTE:");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(250, 0, 130, 20);

        jLabel32.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel32.setText("TELEFONE:");
        jPanel7.add(jLabel32);
        jLabel32.setBounds(250, 40, 130, 20);

        jLabel33.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel33.setText("RUA:");
        jPanel7.add(jLabel33);
        jLabel33.setBounds(250, 80, 130, 20);

        txtCidadeCliente.setEditable(false);
        txtCidadeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(250, 180, 180, 22);

        jLabel34.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel34.setText("BAIRRO:");
        jPanel7.add(jLabel34);
        jLabel34.setBounds(250, 120, 130, 20);

        jLabel35.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel35.setText("VALOR (R$):");
        jPanel7.add(jLabel35);
        jLabel35.setBounds(120, 200, 80, 20);

        txtNumeroCliente.setEditable(false);
        txtNumeroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNumeroCliente);
        txtNumeroCliente.setBounds(250, 220, 180, 22);

        txtTelCliente.setEditable(false);
        try {
            txtTelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtTelCliente);
        txtTelCliente.setBounds(250, 60, 180, 20);

        try {
            txtDataEnco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtDataEnco);
        txtDataEnco.setBounds(10, 180, 180, 22);

        txtValorEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtValorEnco);
        txtValorEnco.setBounds(120, 220, 70, 22);

        Pesquisar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Pesquisar.setText("PESQUISAR");
        Pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pesquisar.setContentAreaFilled(false);
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        jPanel7.add(Pesquisar);
        Pesquisar.setBounds(10, 255, 80, 30);

        SalvarAlteracao.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        SalvarAlteracao.setText("ALTERAR");
        SalvarAlteracao.setToolTipText("Alteração somente da encomenda");
        SalvarAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalvarAlteracao.setContentAreaFilled(false);
        SalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAlteracaoActionPerformed(evt);
            }
        });
        jPanel7.add(SalvarAlteracao);
        SalvarAlteracao.setBounds(250, 255, 80, 30);

        txtProdutoEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtProdutoEnco);
        txtProdutoEnco.setBounds(10, 60, 180, 22);

        Recibo.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Recibo.setText("RECIBO");
        Recibo.setToolTipText("Emitir recibo do cliente");
        Recibo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Recibo.setContentAreaFilled(false);
        Recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReciboActionPerformed(evt);
            }
        });
        jPanel7.add(Recibo);
        Recibo.setBounds(350, 255, 80, 30);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(140, 205, 480, 300);

        tabela_encomenda.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, encomendaList, tabela_encomenda);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoCod}"));
        columnBinding.setColumnName("CÓDIGO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoProd}"));
        columnBinding.setColumnName("PRODUTO");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoQtde}"));
        columnBinding.setColumnName("QTDE");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoDataEntrega}"));
        columnBinding.setColumnName("DATA ENTREGA");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoTamanho}"));
        columnBinding.setColumnName("TAMANHO");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${encoValor}"));
        columnBinding.setColumnName("VALOR");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_encomenda);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(140, 10, 480, 190);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 636, 510);

        bindingGroup.bind();

        setSize(new java.awt.Dimension(636, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja sair?", "SAIR", 0, 3, null, op, "Sim");

            if (escolha == 0){
                System.exit(0);
            }else{}
    }//GEN-LAST:event_SairActionPerformed

    private void HistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoricoActionPerformed
        new Tela_Historico_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HistoricoActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        new Tela_Clientes_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClienteActionPerformed

    private void NovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoPedidoActionPerformed
        new Tela_Pedidos_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NovoPedidoActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        new Tela_Estoque_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstoqueActionPerformed

    private void CaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaActionPerformed
        new Tela_Caixa_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaixaActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        Controler.Driver.conexao();
        
        try{
            cod_encomenda = Integer.valueOf(txtCodEnco.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT cliente.cli_nome, cliente.cli_tel, cliente.cli_rua, cliente.cli_num, cliente.cli_bairro, cliente.cli_cidade, encomenda.enco_prod, encomenda.enco_qtde, encomenda.enco_tamanho, encomenda.enco_valor, encomenda.enco_forma_pgt, encomenda.enco_data_entrega from cliente, encomenda where encomenda.cli_cod = cliente.cli_cod and encomenda.enco_cod = " + cod_encomenda;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    
                    while(rs.next()){
                        String enco_prod = rs.getString("enco_prod");
                        String enco_qtde = rs.getString("enco_qtde");
                        String enco_tamanho = rs.getString("enco_tamanho");
                        String enco_valor = rs.getString("enco_valor");
                        String enco_forma_pgt = rs.getString("enco_forma_pgt");
                        String enco_data = rs.getString("enco_data_entrega");
                        String cli_nome = rs.getString("cli_nome");
                        String cli_tel = rs.getString("cli_tel");
                        String cli_rua = rs.getString("cli_rua");
                        String cli_num = rs.getString("cli_num");
                        String cli_bairro = rs.getString("cli_bairro");
                        String cli_cidade = rs.getString("cli_cidade");
                        
                        try{
                            SimpleDateFormat data_formato = new SimpleDateFormat("yyyy-MM-dd");
                            Date data = data_formato.parse(enco_data);

                            SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MM/yyyy");
                            enco_data_entrega = data_formatada.format(data);
                        }catch (ParseException ex){
                            JOptionPane.showMessageDialog(null, "Erro ao pesquisar data.");
                        }
                        
                        i++;
                        
                        txtProdutoEnco.setText(String.valueOf(enco_prod));
                        txtQtdeEnco.setText(String.valueOf(enco_qtde));
                        txtFormaPgtEnco.setText(String.valueOf(enco_forma_pgt));
                        txtDataEnco.setText(String.valueOf(enco_data_entrega));
                        txtTamanhoEnco.setText(String.valueOf(enco_tamanho));
                        txtValorEnco.setText(String.valueOf(enco_valor));
                        txtNomeCliente.setText(String.valueOf(cli_nome));
                        txtTelCliente.setText(String.valueOf(cli_tel));
                        txtRuaCliente.setText(String.valueOf(cli_rua));
                        txtBairroCliente.setText(String.valueOf(cli_bairro));
                        txtCidadeCliente.setText(String.valueOf(cli_cidade));
                        txtNumeroCliente.setText(String.valueOf(cli_num));
                    }
                    
                    if(i == 0){
                        JOptionPane.showMessageDialog(null, "Dado não cadastrado.", "ATENÇÃO", 2);
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro ao consultar.");
                }
                
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.");
            }
           
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
            txtCodEnco.setText("");
        }
        
        //----------INCLUSÃO - HISTÓRICO_ENCOMENDA----------
        cod_encomenda = Integer.valueOf(txtCodEnco.getText());
        produto_encomenda = txtProdutoEnco.getText();
        qtde_encomenda = Integer.valueOf(txtQtdeEnco.getText());
        forma_pgt_encomenda = txtFormaPgtEnco.getText();
            
        tam_enco = txtTamanhoEnco.getText();
        tam_enco = tam_enco.replace(".", ",");
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        double numeroTamanho = 0;
        try{
            numeroTamanho = nf.parse(tam_enco).doubleValue();
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o tamanho da encomenda.");
        }
        tamanho_encomenda = new BigDecimal(numeroTamanho).setScale(2, RoundingMode.HALF_EVEN);
        
        val_enco = txtValorEnco.getText();
        val_enco = val_enco.replace(".", ",");
        NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        double numeroValor = 0;
        try{ 
            numeroValor = nf2.parse(val_enco).doubleValue();
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o valor da encomenda.");
        }
        valor_encomenda = new BigDecimal(numeroValor).setScale(2, RoundingMode.HALF_EVEN);
        
        data_enco = txtDataEnco.getText();
        SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
        data_formato.setLenient(false);
        try{
            java.sql.Date data_entrega = new java.sql.Date(data_formato.parse(data_enco).getTime());
            data_entrega_encomenda = String.valueOf(data_entrega);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao salvar a data de entrega da encomenda.");
            txtDataEnco.setText("");
        }
        
        try{
            
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO historico_encomenda(hist_enco_prod, hist_enco_qtde, hist_enco_tamanho, hist_enco_valor, hist_enco_forma_pgt, hist_data_entrega) values ('" + produto_encomenda + "','" + qtde_encomenda + "','" + tamanho_encomenda + "','" + valor_encomenda + "','" + forma_pgt_encomenda + "','" + data_entrega_encomenda + "')";
            
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute();
                //JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
            
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtQtdeEnco.setText("");
            txtTamanhoEnco.setText("");
            txtValorEnco.setText("");
        }
        
        refresh();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Sim", "Não"};
	int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir?", "EXCLUIR", 0, 3, null, op, "");
	
	if (escolha == 0){
            //Exclusão com o txtProdutoEnco vazio
            if(txtProdutoEnco.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Não foi possível excluir com os demais campos vazios. Clique em Pesquisar.");
            }else{
                
                try{
                    cod_encomenda = Integer.valueOf(txtCodEnco.getText());
                    
                    Connection con = null;
                    
                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "DELETE FROM encomenda WHERE enco_cod = " + cod_encomenda;
                    
                    try{
                        PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                        excluir.execute();
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        txtCodEnco.setText("");
                        txtProdutoEnco.setText("");
                        txtQtdeEnco.setText("");
                        txtFormaPgtEnco.setText("");
                        txtDataEnco.setText("");
                        txtTamanhoEnco.setText("");
                        txtValorEnco.setText("");
                        txtNomeCliente.setText("");
                        txtTelCliente.setText("");
                        txtRuaCliente.setText("");
                        txtBairroCliente.setText("");
                        txtCidadeCliente.setText("");
                        txtNumeroCliente.setText("");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                    }
                    
                }catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
                    txtCodEnco.setText("");
                }
            }
            
	}else{
            JOptionPane.showMessageDialog(null, "Registro não deletado.");
	}
        
        refresh();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAlteracaoActionPerformed
        Controler.Driver.conexao();
        
            produto_encomenda = txtProdutoEnco.getText();
            qtde_encomenda = Integer.valueOf(txtQtdeEnco.getText());
            forma_pgt_encomenda = txtFormaPgtEnco.getText();
            
            tam_enco = txtTamanhoEnco.getText();
            tam_enco = tam_enco.replace(".", ",");
            NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
            double numeroTamanho = 0;
            try{
                numeroTamanho = nf.parse(tam_enco).doubleValue();
            }catch (ParseException ex){
                JOptionPane.showMessageDialog(null, "Erro ao salvar o tamanho da encomenda.");
            }
            tamanho_encomenda = new BigDecimal(numeroTamanho).setScale(2, RoundingMode.HALF_EVEN);
        
            val_enco = txtValorEnco.getText();
            val_enco = val_enco.replace(".", ",");
            NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
            double numeroValor = 0;
            try{ 
                numeroValor = nf2.parse(val_enco).doubleValue();
            }catch (ParseException ex){
                JOptionPane.showMessageDialog(null, "Erro ao salvar o valor da encomenda.");
            }
            valor_encomenda = new BigDecimal(numeroValor).setScale(2, RoundingMode.HALF_EVEN);
        
            data_enco = txtDataEnco.getText();
            SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
            data_formato.setLenient(false);
            try{
                java.sql.Date data_entrega = new java.sql.Date(data_formato.parse(data_enco).getTime());
                data_entrega_encomenda = String.valueOf(data_entrega);
            }catch (ParseException ex){
                JOptionPane.showMessageDialog(null, "Erro ao salvar a data de entrega da encomenda.");
                txtDataEnco.setText("");
            }
            
            try{
		cod_encomenda = Integer.valueOf(txtCodEnco.getText());
                    
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "UPDATE encomenda SET enco_prod = '" + produto_encomenda + "', enco_qtde = '" + qtde_encomenda + "', enco_tamanho = '" + tamanho_encomenda + "', enco_valor = '" + valor_encomenda + "', enco_forma_pgt = '" + forma_pgt_encomenda + "', enco_data_entrega = '" + data_entrega_encomenda + "' WHERE enco_cod = " + cod_encomenda;
                
                try{
                    PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                    inserir.execute();
                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
                    txtProdutoEnco.setText("");
                    txtQtdeEnco.setText("");
                    txtFormaPgtEnco.setText("");
                    txtDataEnco.setText("");
                    txtTamanhoEnco.setText("");
                    txtValorEnco.setText("");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtRuaCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtNumeroCliente.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na alteração de dados.");
            }
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
                txtCodEnco.setText("");
		txtQtdeEnco.setText("");
                txtTamanhoEnco.setText("");
                txtValorEnco.setText("");
            }
        
        refresh();
    }//GEN-LAST:event_SalvarAlteracaoActionPerformed

    private void ReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReciboActionPerformed
        Controler.Driver.conexao();
        String teste = txtCodEnco.getText();
        
        if (teste.equals("")){
            JOptionPane.showMessageDialog(null, "Selecione e pesquise algum código para gerar recibo da encomenda.");
        }else{
            Model.Gerar_MOD.Gerar_Recibo();
        }
    }//GEN-LAST:event_ReciboActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Encomendas_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Encomendas_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caixa;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Encomenda;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Historico;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Recibo;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SalvarAlteracao;
    private java.util.List<View.Encomenda> encomendaList;
    private javax.persistence.Query encomendaQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_encomenda;
    public static javax.swing.JTextField txtBairroCliente;
    public static javax.swing.JTextField txtCidadeCliente;
    public static javax.swing.JTextField txtCodEnco;
    public static javax.swing.JFormattedTextField txtDataEnco;
    public static javax.swing.JTextField txtFormaPgtEnco;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtNumeroCliente;
    public static javax.swing.JTextField txtProdutoEnco;
    public static javax.swing.JTextField txtQtdeEnco;
    public static javax.swing.JTextField txtRuaCliente;
    public static javax.swing.JTextField txtTamanhoEnco;
    public static javax.swing.JFormattedTextField txtTelCliente;
    public static javax.swing.JTextField txtValorEnco;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
