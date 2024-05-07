package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Estoque_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static int cod_estoque = 0;
    static String ingrediente_nome = "";
    static String embalagem_nome = "";
    static int ingrediente_qtde = 0;
    static int embalagem_qtde = 0;
    
    //---REFRESH
    public void refresh(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            
            System.out.println("Realizado com sucesso");
            
            String sql = "SELECT * FROM estoque";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabela_estoque.setModel(Model.Atualizar_MOD.estoque(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public Tela_Estoque_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atelie?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        estoqueQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Estoque e");
        estoqueList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : estoqueQuery.getResultList();
        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Remover = new javax.swing.JButton();
        Adicionar = new javax.swing.JButton();
        txtQtdeProd = new javax.swing.JTextField();
        txtCodProd = new javax.swing.JTextField();
        txtNomeProd = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        SalvarAlteracao = new javax.swing.JButton();
        Caixa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_estoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 221, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(null);

        Sair.setBackground(new java.awt.Color(255, 255, 255));
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

        Encomenda.setBackground(new java.awt.Color(255, 255, 255));
        Encomenda.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Encomenda.setText("ENCOMENDAS");
        Encomenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Encomenda.setContentAreaFilled(false);
        Encomenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncomendaActionPerformed(evt);
            }
        });
        jPanel4.add(Encomenda);
        Encomenda.setBounds(10, 150, 110, 60);

        Historico.setBackground(new java.awt.Color(255, 255, 255));
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

        Cliente.setBackground(new java.awt.Color(255, 255, 255));
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

        Estoque.setBackground(new java.awt.Color(255, 255, 255));
        Estoque.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Estoque.setText("ESTOQUE");
        Estoque.setToolTipText("Você está aqui");
        Estoque.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Estoque.setContentAreaFilled(false);
        jPanel4.add(Estoque);
        Estoque.setBounds(10, 290, 110, 60);

        NovoPedido.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel27.setText("CONTROLAR ESTOQUE");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(272, 290, 250, 20);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel28.setText("ESTOQUE");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(320, 8, 100, 20);

        jPanel6.setBackground(new java.awt.Color(255, 221, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("CÓDIGO DO PRODUTO:");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(10, 0, 150, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("QUANTIDADE:");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(10, 90, 170, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setText("PRODUTO:");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 40, 90, 30);

        Remover.setBackground(new java.awt.Color(255, 255, 255));
        Remover.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Remover.setText("REMOVER");
        Remover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Remover.setContentAreaFilled(false);
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });
        jPanel6.add(Remover);
        Remover.setBounds(320, 50, 90, 30);

        Adicionar.setBackground(new java.awt.Color(255, 255, 255));
        Adicionar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Adicionar.setText("ADICIONAR");
        Adicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Adicionar.setContentAreaFilled(false);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        jPanel6.add(Adicionar);
        Adicionar.setBounds(320, 10, 90, 30);

        txtQtdeProd.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel6.add(txtQtdeProd);
        txtQtdeProd.setBounds(10, 120, 280, 22);

        txtCodProd.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel6.add(txtCodProd);
        txtCodProd.setBounds(10, 20, 280, 22);

        txtNomeProd.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel6.add(txtNomeProd);
        txtNomeProd.setBounds(10, 70, 280, 22);

        Pesquisar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Pesquisar.setText("PESQUISAR");
        Pesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Pesquisar.setContentAreaFilled(false);
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        jPanel6.add(Pesquisar);
        Pesquisar.setBounds(320, 90, 90, 30);

        SalvarAlteracao.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        SalvarAlteracao.setText("ALTERAR");
        SalvarAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalvarAlteracao.setContentAreaFilled(false);
        SalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAlteracaoActionPerformed(evt);
            }
        });
        jPanel6.add(SalvarAlteracao);
        SalvarAlteracao.setBounds(320, 130, 90, 30);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(160, 320, 440, 170);

        Caixa.setBackground(new java.awt.Color(255, 255, 255));
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

        tabela_estoque.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, estoqueList, tabela_estoque);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoCodProduto}"));
        columnBinding.setColumnName("CÓDIGO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoIngrediente}"));
        columnBinding.setColumnName("INGREDIENTES");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoEmbalagem}"));
        columnBinding.setColumnName("EMBALAGENS");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoQtdIngrediente}"));
        columnBinding.setColumnName("QTDE - INGREDIENTES");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoQtdEmbalagem}"));
        columnBinding.setColumnName("QTDE - EMBALAGENS");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_estoque);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(140, 30, 480, 250);

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

    private void EncomendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncomendaActionPerformed
        new Tela_Encomendas_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EncomendaActionPerformed

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

    private void CaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaActionPerformed
        new Tela_Caixa_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaixaActionPerformed

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        new Tela_Adicionar_GUI().setVisible(true);
        refresh();
    }//GEN-LAST:event_AdicionarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Ingrediente", "Embalagem"};
        int escolha = JOptionPane.showOptionDialog(null, "Qual deseja pesquisar?", "PESQUISAR ESTOQUE", 0, 3, null, op, "");

        //Pesquisa de ingrediente
        if(escolha == 0){
            try{
                cod_estoque = Integer.valueOf(txtCodProd.getText());
                
                try{
                    Connection con = null;

                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "SELECT esto_ingrediente, esto_qtd_ingrediente FROM estoque where esto_cod_produto = " + cod_estoque;
                    Statement stm = (Statement) con.createStatement();

                    try{
                        ResultSet rs = stm.executeQuery(sql);
                    
                        int i = 0;
                        
                        while(rs.next()){
                            String esto_ingrediente = rs.getString("esto_ingrediente");
                            String esto_qtd_ingrediente = rs.getString("esto_qtd_ingrediente");
                            
                            i++;

                            txtNomeProd.setText(String.valueOf(esto_ingrediente));
                            txtQtdeProd.setText(String.valueOf(esto_qtd_ingrediente));
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
                txtCodProd.setText("");
            }
            
        //Pesquisa de embalagem
        }else{
            try{
                cod_estoque = Integer.valueOf(txtCodProd.getText());
                
                try{
                    Connection con = null;

                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "SELECT esto_embalagem, esto_qtd_embalagem FROM estoque where esto_cod_produto = " + cod_estoque;
                    Statement stm = (Statement) con.createStatement();

                    try{
                        ResultSet rs = stm.executeQuery(sql);
                    
                        int i = 0;
                        
                        while(rs.next()){
                            String esto_embalagem = rs.getString("esto_embalagem");
                            String esto_qtd_embalagem = rs.getString("esto_qtd_embalagem");

                            i++;

                            txtNomeProd.setText(String.valueOf(esto_embalagem));
                            txtQtdeProd.setText(String.valueOf(esto_qtd_embalagem));
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
                txtCodProd.setText("");
            }

        }
        
        refresh();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void SalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAlteracaoActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Ingredientes", "Embalagens"};
        int escolha = JOptionPane.showOptionDialog(null, "Qual deseja alterar?", "ALTERAR ESTOQUE", 0, 3, null, op, "");
        
        //Alteração de ingrediente
        if (escolha == 0){
            ingrediente_nome = txtNomeProd.getText();
            ingrediente_qtde = Integer.valueOf(txtQtdeProd.getText());

            try{
                cod_estoque = Integer.valueOf(txtCodProd.getText());
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "UPDATE estoque SET esto_ingrediente = '" + ingrediente_nome + "', esto_qtd_ingrediente = '" + ingrediente_qtde + "' WHERE esto_cod_produto = " + cod_estoque;
                
                try{
                    PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                    inserir.execute();
                    JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
			txtCodProd.setText("");
			txtNomeProd.setText("");
			txtQtdeProd.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na alteração de dados.");
                }
                
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
                txtCodProd.setText("");
                txtQtdeProd.setText("");
            }
            
        //Alteração da embalagem    
        }else{
            embalagem_nome = txtNomeProd.getText();
            embalagem_qtde = Integer.valueOf(txtQtdeProd.getText());

            try{
                cod_estoque = Integer.valueOf(txtCodProd.getText());
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "UPDATE estoque SET esto_embalagem = '" + embalagem_nome + "', esto_qtd_embalagem = '" + embalagem_qtde + "' WHERE esto_cod_produto = " + cod_estoque;
                
                try{
                    PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                    inserir.execute();
                        JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
			txtCodProd.setText("");
			txtNomeProd.setText("");
			txtQtdeProd.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na alteração de dados.");
                }
                
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
                txtCodProd.setText("");
                txtQtdeProd.setText("");
            }
        }
        
        refresh();
    }//GEN-LAST:event_SalvarAlteracaoActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir?", "EXCLUIR", 0, 3, null, op, "");
        
        if (escolha == 0){
            //Exclusão com txtNomeProd vazio
            if(txtNomeProd.getText().equals("")){
                
                try{
                    cod_estoque = Integer.valueOf(txtCodProd.getText());
                    Connection con = null;

                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "DELETE FROM estoque WHERE esto_cod_produto = " + cod_estoque;

                    try{
                        PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                        excluir.execute();
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        txtCodProd.setText("");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                    }

                }catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
                    txtCodProd.setText("");
                }
                
            //Exclusão com txtNomeProd preenchido   
            }else{
                try{
                    cod_estoque = Integer.valueOf(txtCodProd.getText());
                    Connection con = null;

                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "DELETE FROM estoque WHERE esto_cod_produto = " + cod_estoque;

                    try{
                        PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                        excluir.execute();
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        txtCodProd.setText("");
                        txtNomeProd.setText("");
                        txtQtdeProd.setText("");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                    }

                }catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
                    txtCodProd.setText("");
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "Registro não deletado.");
        }
        
        refresh();
    }//GEN-LAST:event_RemoverActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Estoque_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Estoque_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.JButton Caixa;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Encomenda;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Historico;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Remover;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SalvarAlteracao;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<View.Estoque> estoqueList;
    private javax.persistence.Query estoqueQuery;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabela_estoque;
    public static javax.swing.JTextField txtCodProd;
    public static javax.swing.JTextField txtNomeProd;
    public static javax.swing.JTextField txtQtdeProd;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
