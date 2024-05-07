package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Historico_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    //---Variáveis - ENCOMENDA
    static int cod_encomenda = 0;
    static String hist_data_entrega = "";
    
        //---REFRESH
    public void refresh(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            
            System.out.println("Realizado com sucesso");
            
            String sql = "SELECT hist_enco_cod, hist_enco_prod, hist_enco_valor, hist_data_entrega FROM historico_encomenda";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabela_historico.setModel(Model.Atualizar_MOD.historico(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Tela_Historico_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atelie?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        historicoEncomendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM HistoricoEncomenda h");
        historicoEncomendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : historicoEncomendaQuery.getResultList();
        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Caixa = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtQtdeEnco = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtProdEnco = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Excluir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txtValorEnco = new javax.swing.JTextField();
        txtDataEntregaEnco = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCodEnco = new javax.swing.JTextField();
        Pesquisar = new javax.swing.JButton();
        txtTamanhoEnco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_historico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

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
        Encomenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Encomenda.setContentAreaFilled(false);
        Encomenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncomendaActionPerformed(evt);
            }
        });
        jPanel4.add(Encomenda);
        Encomenda.setBounds(10, 150, 110, 60);

        Historico.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Historico.setText("HISTÓRICO");
        Historico.setToolTipText("Você está aqui");
        Historico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Historico.setContentAreaFilled(false);
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

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel28.setText("HISTÓRICO DE PEDIDOS");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(270, 5, 250, 20);

        jPanel7.setBackground(new java.awt.Color(255, 221, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setForeground(new java.awt.Color(170, 105, 57));
        jPanel7.setLayout(null);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setText("QUANTIDADE:");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(10, 120, 130, 20);

        txtQtdeEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtQtdeEnco);
        txtQtdeEnco.setBounds(10, 140, 180, 22);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel18.setText("DATA DE ENTREGA:");
        jPanel7.add(jLabel18);
        jLabel18.setBounds(10, 200, 130, 20);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel19.setText("AVISO:");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(320, 0, 60, 40);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel20.setText("TAMANHO:");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(10, 80, 130, 20);

        txtProdEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtProdEnco);
        txtProdEnco.setBounds(10, 60, 180, 22);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel26.setText("VALOR (R$):");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(10, 160, 160, 20);

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
        Excluir.setBounds(380, 210, 80, 30);

        jLabel24.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel24.setText("OUTRAS ESPECIFICAÇÕES:");
        jPanel7.add(jLabel24);
        jLabel24.setBounds(20, 360, 170, 20);

        jLabel31.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel31.setText("OUTRAS ESPECIFICAÇÕES:");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(20, 360, 170, 20);

        jLabel29.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel29.setText("PRODUTO:");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(10, 40, 90, 20);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 204, 255));
        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("Todos os pedidos podem ser visualizados aqui, incluindo aqueles que foram excluídos na tela de Encomendas. Ao clicar em Excluir, eles serão apagados permanentemente.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(210, 30, 250, 110);

        txtValorEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtValorEnco);
        txtValorEnco.setBounds(10, 180, 180, 22);

        try {
            txtDataEntregaEnco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEntregaEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtDataEntregaEnco);
        txtDataEntregaEnco.setBounds(10, 220, 180, 22);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel21.setText("CÓDIGO DA ENCOMENDA:");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(10, 0, 180, 20);

        txtCodEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCodEnco);
        txtCodEnco.setBounds(10, 20, 180, 22);

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
        Pesquisar.setBounds(280, 210, 80, 30);

        txtTamanhoEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtTamanhoEnco);
        txtTamanhoEnco.setBounds(10, 100, 180, 22);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(150, 240, 470, 250);

        tabela_historico.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, historicoEncomendaList, tabela_historico);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${histEncoCod}"));
        columnBinding.setColumnName("CÓDIGO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${histEncoProd}"));
        columnBinding.setColumnName("PRODUTO");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${histEncoValor}"));
        columnBinding.setColumnName("VALOR");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${histDataEntrega}"));
        columnBinding.setColumnName("DATA ENTREGA");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_historico);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(150, 30, 470, 200);

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

    private void NovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoPedidoActionPerformed
        new Tela_Pedidos_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NovoPedidoActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        new Tela_Clientes_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClienteActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        new Tela_Estoque_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstoqueActionPerformed

    private void CaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaActionPerformed
        new Tela_Caixa_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaixaActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir?", "EXCLUIR", 0, 3, null, op, "");
        
        if (escolha == 0){
            //Exclusão com o txtProdEnco vazio
            if(txtProdEnco.getText().equals("")){
		try{
                    cod_encomenda = Integer.valueOf(txtCodEnco.getText());
                    
                    Connection con = null;
                    
                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Historico_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "DELETE FROM historico_encomenda WHERE hist_enco_cod = " + cod_encomenda;
                    
                    try{
                        PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                        excluir.execute();
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        txtCodEnco.setText("");
                    }catch (Exception ex){
                        JOptionPane.showMessageDialog(null, "Erro ao excluir.");	
                    }
                    
                }catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
                    txtCodEnco.setText("");
                }
		
            //Exclusão com o txtProdEnco preenchido    
            }else{
                try{
                    cod_encomenda = Integer.valueOf(txtCodEnco.getText());
                    
                    Connection con = null;
                    
                    try{
                        con = (Connection) DriverManager.getConnection(url, username, password);
                    }catch (SQLException ex){
                        Logger.getLogger(Tela_Historico_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    String sql = "DELETE FROM historico_encomenda WHERE hist_enco_cod = " + cod_encomenda;
                    
                    try{
                        PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                        excluir.execute();
                        JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                        txtCodEnco.setText("");
                        txtProdEnco.setText("");
                        txtTamanhoEnco.setText("");
                        txtQtdeEnco.setText("");
                        txtValorEnco.setText("");
                        txtDataEntregaEnco.setText("");
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

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        Controler.Driver.conexao();
        
        try{
            cod_encomenda = Integer.valueOf(txtCodEnco.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Historico_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT hist_enco_prod, hist_enco_qtde, hist_enco_tamanho, hist_enco_valor, hist_data_entrega from historico_encomenda where hist_enco_cod = " + cod_encomenda;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    
                    while(rs.next()){
                        String hist_prod = rs.getString("hist_enco_prod");
                        String hist_qtde = rs.getString("hist_enco_qtde");
                        String hist_tamanho = rs.getString("hist_enco_tamanho");
                        String hist_valor = rs.getString("hist_enco_valor");
                        String hist_data = rs.getString("hist_data_entrega");

                        try{
                            SimpleDateFormat data_formato = new SimpleDateFormat("yyyy-MM-dd");
                            Date data = data_formato.parse(hist_data);

                            SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MM/yyyy");
                            hist_data_entrega = data_formatada.format(data);
                        }catch (ParseException ex){
                            JOptionPane.showMessageDialog(null, "Erro ao pesquisar data.");
                        }

                        i++;
                        
                        txtProdEnco.setText(String.valueOf(hist_prod));
                        txtQtdeEnco.setText(String.valueOf(hist_qtde));
                        txtTamanhoEnco.setText(String.valueOf(hist_tamanho));
                        txtValorEnco.setText(String.valueOf(hist_valor));
                        txtDataEntregaEnco.setText(String.valueOf(hist_data_entrega));
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
    }//GEN-LAST:event_PesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Historico_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Historico_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Historico_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Historico_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Historico_GUI().setVisible(true);
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
    private javax.swing.JButton Sair;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<View.HistoricoEncomenda> historicoEncomendaList;
    private javax.persistence.Query historicoEncomendaQuery;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tabela_historico;
    public static javax.swing.JTextField txtCodEnco;
    public static javax.swing.JFormattedTextField txtDataEntregaEnco;
    public static javax.swing.JTextField txtProdEnco;
    public static javax.swing.JTextField txtQtdeEnco;
    public static javax.swing.JTextField txtTamanhoEnco;
    public static javax.swing.JTextField txtValorEnco;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
