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

public class Tela_Clientes_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static int cod_cliente = 0;
    static String nome_cliente = "";
    static String telefone_cliente = "";
    static String email_cliente = "";
    static String cpf_cliente = "";
    static String rua_cliente = "";
    static String num_cliente = "";
    static String compl_cliente = "";
    static String bairro_cliente = "";
    static String cidade_cliente = "";
    static String cep_cliente = "";
    static String sexo_cliente = "";
    
    //---REFRESH
    public void refresh(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            
            System.out.println("Realizado com sucesso");
            
            String sql = "SELECT cli_cod, cli_nome, cli_tel, cli_cpf, cli_sexo FROM cliente";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabela_cliente.setModel(Model.Atualizar_MOD.cliente(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Tela_Clientes_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atelie?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        Caixa = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtRuaCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        txtComplCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Excluir = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JFormattedTextField();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSexoCliente = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        SalvarAlteracao = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_cliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 221, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(null);

        Sair.setBackground(new java.awt.Color(0, 0, 0));
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

        Encomenda.setBackground(new java.awt.Color(0, 0, 0));
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

        Historico.setBackground(new java.awt.Color(0, 0, 0));
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

        Cliente.setBackground(new java.awt.Color(0, 0, 0));
        Cliente.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Cliente.setText("CLIENTES");
        Cliente.setToolTipText("Você está aqui");
        Cliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cliente.setContentAreaFilled(false);
        jPanel4.add(Cliente);
        Cliente.setBounds(10, 80, 110, 60);

        Estoque.setBackground(new java.awt.Color(0, 0, 0));
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

        NovoPedido.setBackground(new java.awt.Color(0, 0, 0));
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

        Caixa.setBackground(new java.awt.Color(0, 0, 0));
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
        jPanel7.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("NOME DO CLIENTE:");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(10, 40, 130, 20);

        txtNomeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNomeCliente);
        txtNomeCliente.setBounds(10, 60, 180, 22);

        txtRuaCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtRuaCliente);
        txtRuaCliente.setBounds(10, 220, 180, 22);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setText("SEXO:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 250, 130, 20);

        txtNumeroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNumeroCliente);
        txtNumeroCliente.setBounds(250, 20, 180, 22);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel12.setText("NÚMERO DA CASA:");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(250, 0, 160, 20);
        jLabel12.getAccessibleContext().setAccessibleName("");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel13.setText("TELEFONE:");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(10, 70, 130, 40);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel25.setText("EMAIL:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(10, 110, 130, 40);

        txtEmailCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtEmailCliente);
        txtEmailCliente.setBounds(10, 140, 180, 22);

        txtComplCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtComplCliente);
        txtComplCliente.setBounds(250, 60, 180, 22);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel26.setText("COMPLEMENTO:");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(250, 40, 160, 20);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel30.setText("CÓDIGO DO CLIENTE:");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(10, 0, 150, 20);

        txtCodCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCodCliente);
        txtCodCliente.setBounds(10, 20, 180, 22);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel36.setText("CPF:");
        jLabel36.setToolTipText("");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(10, 150, 50, 40);

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
        Excluir.setBounds(350, 210, 80, 30);

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel38.setText("CEP:");
        jPanel7.add(jLabel38);
        jLabel38.setBounds(250, 150, 70, 40);

        txtBairroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtBairroCliente);
        txtBairroCliente.setBounds(250, 100, 180, 20);

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel39.setText("BAIRRO:");
        jPanel7.add(jLabel39);
        jLabel39.setBounds(250, 70, 70, 40);

        txtCidadeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(250, 140, 180, 20);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel40.setText("CIDADE:");
        jPanel7.add(jLabel40);
        jLabel40.setBounds(250, 110, 70, 40);

        try {
            txtTelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtTelCliente);
        txtTelCliente.setBounds(10, 100, 180, 22);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCpfCliente);
        txtCpfCliente.setBounds(10, 180, 180, 22);

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCepCliente);
        txtCepCliente.setBounds(250, 180, 180, 22);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel14.setText("RUA:");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(10, 200, 130, 20);

        txtSexoCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtSexoCliente);
        txtSexoCliente.setBounds(70, 250, 120, 22);

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
        Pesquisar.setBounds(250, 210, 80, 30);

        SalvarAlteracao.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        SalvarAlteracao.setText("ALTERAR");
        SalvarAlteracao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalvarAlteracao.setContentAreaFilled(false);
        SalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAlteracaoActionPerformed(evt);
            }
        });
        jPanel7.add(SalvarAlteracao);
        SalvarAlteracao.setBounds(250, 245, 80, 30);

        Relatorio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Relatorio.setText("RELATÓRIO");
        Relatorio.setToolTipText("Visualização e impressão do relatório de cliente");
        Relatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Relatorio.setContentAreaFilled(false);
        Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioActionPerformed(evt);
            }
        });
        jPanel7.add(Relatorio);
        Relatorio.setBounds(350, 245, 80, 30);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(160, 220, 450, 280);

        tabela_cliente.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, tabela_cliente);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("CÓDIGO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNome}"));
        columnBinding.setColumnName("NOME");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("TELEFONE");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCpf}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliSexo}"));
        columnBinding.setColumnName("SEXO");
        columnBinding.setColumnClass(Character.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_cliente);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(160, 10, 452, 200);

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
            cod_cliente = Integer.valueOf(txtCodCliente.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT cli_nome, cli_tel, cli_email, cli_cpf, cli_sexo, cli_rua, cli_num, cli_compl, cli_bairro, cli_cidade, cli_cep FROM cliente where cli_cod = " + cod_cliente;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    
                    while(rs.next()){
                        String cli_nome = rs.getString("cli_nome");
                        String cli_tel = rs.getString("cli_tel");
                        String cli_email = rs.getString("cli_email");
                        String cli_cpf = rs.getString("cli_cpf");
                        String cli_sexo = rs.getString("cli_sexo");
                        String cli_rua = rs.getString("cli_rua");
                        String cli_num = rs.getString("cli_num");
                        String cli_compl = rs.getString("cli_compl");
                        String cli_bairro = rs.getString("cli_bairro");
                        String cli_cidade = rs.getString("cli_cidade");
                        String cli_cep = rs.getString("cli_cep");
                        
                        i++;
                        
                        txtNomeCliente.setText(String.valueOf(cli_nome));
                        txtTelCliente.setText(String.valueOf(cli_tel));
                        txtEmailCliente.setText(String.valueOf(cli_email));
                        txtCpfCliente.setText(String.valueOf(cli_cpf));
                        txtSexoCliente.setText(String.valueOf(cli_sexo));
                        txtRuaCliente.setText(String.valueOf(cli_rua));
                        txtNumeroCliente.setText(String.valueOf(cli_num));
                        txtComplCliente.setText(String.valueOf(cli_compl));
                        txtBairroCliente.setText(String.valueOf(cli_bairro));
                        txtCidadeCliente.setText(String.valueOf(cli_cidade));
                        txtCepCliente.setText(String.valueOf(cli_cep));
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
            txtCodCliente.setText("");
        }
    }//GEN-LAST:event_PesquisarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir?", "EXCLUIR", 0, 3, null, op, "");
        
        if (escolha == 0){
        
        //Exclusão com o txtNomeCliente vazio
        if(txtNomeCliente.getText().equals("")){
            
        try{
            cod_cliente = Integer.valueOf(txtCodCliente.getText());
            
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "DELETE FROM cliente WHERE cli_cod = " + cod_cliente;
                
                try{
                    PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                    excluir.execute();
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                    txtCodCliente.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                }
               
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
            txtCodCliente.setText("");
        }
        
        //Exclusão com o txtNomeCliente preenchido
        }else{
            
            try{
                cod_cliente = Integer.valueOf(txtCodCliente.getText());
            
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "DELETE FROM cliente WHERE cli_cod = " + cod_cliente;
                
                try{
                    PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                    excluir.execute();
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                    txtCodCliente.setText("");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtEmailCliente.setText("");
                    txtCpfCliente.setText("");
                    txtSexoCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtComplCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                }
               
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
            txtCodCliente.setText("");
        }
            
        }
        
        }else{
            JOptionPane.showMessageDialog(null, "Registro não deletado.");
        }
        
        refresh();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void SalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAlteracaoActionPerformed
        Controler.Driver.conexao();
        
        nome_cliente = txtNomeCliente.getText();
        telefone_cliente = txtTelCliente.getText();
        email_cliente = txtEmailCliente.getText();
        cpf_cliente = txtCpfCliente.getText();
        cpf_cliente = cpf_cliente.replace(".","");
        cpf_cliente = cpf_cliente.replace("-","");
        rua_cliente = txtRuaCliente.getText();
        num_cliente = txtNumeroCliente.getText();
        compl_cliente = txtComplCliente.getText();
        bairro_cliente = txtBairroCliente.getText();
        cidade_cliente = txtCidadeCliente.getText();
        cep_cliente = txtCepCliente.getText();
        cep_cliente = cep_cliente.replace("-", "");
        
        if((txtSexoCliente.getText().equalsIgnoreCase("m")) || (txtSexoCliente.getText().equalsIgnoreCase("f"))){
            sexo_cliente = txtSexoCliente.getText();
        }else{}

        try{
            cod_cliente = Integer.valueOf(txtCodCliente.getText());
            Connection con = null;

            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sql = "UPDATE cliente SET cli_nome = '" + nome_cliente + "', cli_tel = '" + telefone_cliente + "', cli_email = '" + email_cliente + "', cli_cpf = '" + cpf_cliente + "', cli_sexo = '" + sexo_cliente + "', cli_rua = '" + rua_cliente + "', cli_num = '" + num_cliente + "', cli_compl = '" + compl_cliente + "', cli_bairro = '" + bairro_cliente + "', cli_cidade = '" + cidade_cliente + "', cli_cep = '" + cep_cliente + "' WHERE cli_cod = " + cod_cliente;

            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute();
                JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
                    txtCodCliente.setText("");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtEmailCliente.setText("");
                    txtCpfCliente.setText("");
                    txtSexoCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtComplCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na alteração de dados.");
            }

        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtCodCliente.setText("");
        }
        
        refresh();
    }//GEN-LAST:event_SalvarAlteracaoActionPerformed

    private void RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioActionPerformed
        new Tela_Relatorio_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Clientes_GUI().setVisible(true);
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
    public static javax.swing.JButton Relatorio;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SalvarAlteracao;
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_cliente;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JFormattedTextField txtCepCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtComplCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    public static javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JTextField txtSexoCliente;
    private javax.swing.JFormattedTextField txtTelCliente;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
