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
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Tela_Caixa_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static int cod_caixa = 0; 
    static String cai_produto = "";
    static String cai_data_pgt = "";
    static String valor_pgt = "";
    static BigDecimal cai_pgt;
    static String cai_nome_cli = "";
    
    //---REFRESH
    public void refresh(){
        try{
            Connection conn;
            conn = (Connection) DriverManager.getConnection(url, username, password);
            
            System.out.println("Realizado com sucesso");
            
            String sql = "SELECT * FROM caixa";
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            tabela_caixa.setModel(Model.Atualizar_MOD.caixa(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Tela_Caixa_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("atelie?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        caixaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Caixa c");
        caixaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : caixaQuery.getResultList();
        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        Caixa = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtPgtCaixa = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Relatorio = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCodCaixa = new javax.swing.JTextField();
        Limpar = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtDataEnco = new javax.swing.JFormattedTextField();
        Incluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_caixa = new javax.swing.JTable();
        cmbProdEnco = new javax.swing.JComboBox<>();

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

        jLabel27.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel27.setText("CAIXA");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(350, 10, 70, 20);

        Caixa.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Caixa.setText("CAIXA");
        Caixa.setToolTipText("Você está aqui");
        Caixa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Caixa.setContentAreaFilled(false);
        jPanel4.add(Caixa);
        Caixa.setBounds(10, 360, 110, 60);

        jPanel7.setBackground(new java.awt.Color(255, 221, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        txtPgtCaixa.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtPgtCaixa);
        txtPgtCaixa.setBounds(250, 280, 180, 22);

        jLabel22.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel22.setText("NOME DO CLIENTE:");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(250, 310, 130, 20);

        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel19.setText("PAGAMENTO (R$):");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(250, 260, 200, 20);

        Relatorio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Relatorio.setText("GERAR RELATÓRIO");
        Relatorio.setToolTipText("Impressão do relatório de caixa");
        Relatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Relatorio.setContentAreaFilled(false);
        Relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioActionPerformed(evt);
            }
        });
        jPanel7.add(Relatorio);
        Relatorio.setBounds(10, 410, 180, 30);

        jLabel29.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel29.setText("DATA DO PAGAMENTO:");
        jPanel7.add(jLabel29);
        jLabel29.setBounds(10, 360, 180, 20);

        txtNomeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNomeCliente);
        txtNomeCliente.setBounds(250, 330, 180, 22);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel30.setText("CÓDIGO DO PAGAMENTO:");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(10, 260, 180, 20);

        txtCodCaixa.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCodCaixa);
        txtCodCaixa.setBounds(10, 280, 180, 22);

        Limpar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Limpar.setText("LIMPAR");
        Limpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Limpar.setContentAreaFilled(false);
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPanel7.add(Limpar);
        Limpar.setBounds(250, 370, 80, 30);

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
        Pesquisar.setBounds(350, 410, 80, 30);

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
        Excluir.setBounds(250, 410, 80, 30);

        jLabel31.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel31.setText("PRODUTO:");
        jPanel7.add(jLabel31);
        jLabel31.setBounds(10, 310, 130, 20);

        try {
            txtDataEnco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtDataEnco);
        txtDataEnco.setBounds(10, 380, 180, 22);

        Incluir.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Incluir.setText("INCLUIR");
        Incluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Incluir.setContentAreaFilled(false);
        Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirActionPerformed(evt);
            }
        });
        jPanel7.add(Incluir);
        Incluir.setBounds(350, 370, 80, 30);

        tabela_caixa.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, caixaList, tabela_caixa);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caiCodPgt}"));
        columnBinding.setColumnName("CÓDIGO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caiPgt}"));
        columnBinding.setColumnName("PAGAMENTOS");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caiProdPgt}"));
        columnBinding.setColumnName("PRODUTOS");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caiNomeCli}"));
        columnBinding.setColumnName("NOME CLIENTE");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caiDataPgt}"));
        columnBinding.setColumnName("DATA");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela_caixa);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 452, 230);

        cmbProdEnco.setBackground(new java.awt.Color(255, 204, 204));
        cmbProdEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        cmbProdEnco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolo recheado brigadeiro de leite ninho (massa branca)", "Bolo recheado mousse de leite ninho c/ geleia de morangos frescos (massa branca)", "Bolo recheado beijinho (massa branca)", "Bolo recheado doce de leite (massa branca)", "Bolo recheado quatro leites c/ abacaxi (massa branca)", "Bolo recheado prestígio (massa branca)", "Bolo trufado de maracujá (massa branca)", "Bolo recheado brigadeiro tradicional (massa chocolate)", "Bolo recheado brigadeiro de leite ninho (massa chocolate)", "Bolo recheado mousse de leite ninho c/ geleia de morangos frescos (massa chocolate)", "Bolo recheado beijinho (massa chocolate)", "Bolo recheado doce de leite (massa chocolate)", "Bolo recheado quatro leites c/ abacaxi (massa chocolate)", "Bolo recheado prestígio tradicional (massa chocolate)", "Bolo trufado chocolate meio amargo (massa chocolate)", "Bolo recheado mousse de chocolate (massa chocolate)", "Bolo artesanal de banana", "Bolo artesanal de cenoura", "Bolo artesanal de churros", "Bolo artesanal de formigueiro", "Bolo artesanal de fubá", "Bolo artesanal de laranja", "Bolo artesanal de cenoura c/ calda de chocolate", "Bolo artesanal de churros c/ calda de doce de leite", "Bolo artesanal de formigueiro c/ calda de chocolate", "Bolo artesanal de fubá c/ calda de goiabada", "Bolo artesanal de laranja c/ calda de brigadeiro branco", "Bolo de chocolate c/ calda de chocolate", "Bolo de chocolate c/ calda de beijinho", "Bolo de baunilha c/ calda de beijinho", "Bolo de baunilha c/ calda de doce de leite", "Beijinho de amendoim", "Beijinho de coco", "Beijinho moreno (coco queimado)", "Bicho de pé(morango)", "Brigadeiro branco", "Brigadeiro de chocoball", "Brigadeiro de leite ninho", "Brigadeiro de prestígio", "Brigadeiro tradicional (ao leite)" }));
        cmbProdEnco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmbProdEncoMouseMoved(evt);
            }
        });
        jPanel7.add(cmbProdEnco);
        cmbProdEnco.setBounds(10, 330, 180, 22);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(150, 40, 470, 450);

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

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        new Tela_Estoque_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstoqueActionPerformed

    private void NovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoPedidoActionPerformed
        new Tela_Pedidos_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NovoPedidoActionPerformed

    private void RelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioActionPerformed
        try{
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "SELECT caixa.`cai_cod_pgt` AS caixa_cai_cod_pgt, caixa.`cai_pgt` AS caixa_cai_pgt, caixa.`cai_prod_pgt` AS caixa_cai_prod_pgt, caixa.`cai_nome_cli` AS caixa_cai_nome_cli, caixa.`cai_data_pgt` AS caixa_cai_data_pgt FROM `caixa` caixa";
            Statement stm = (Statement) con.createStatement();
            
            try{
                ResultSet rs = stm.executeQuery(sql);
                
                try{
                    JRResultSetDataSource RelatorioResult;
                    RelatorioResult = new JRResultSetDataSource(rs);
                    JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios\\RelatorioCaixaPgt.jasper", new HashMap(), RelatorioResult);
                    JasperViewer jv;
                    jv = new JasperViewer(jpPrint, false);
                    jv.setVisible(true);
                    jv.toFront();
                }catch (JRException ex){
                    JOptionPane.showMessageDialog(null, "Erro ao chamar relatório.");
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao consultar.");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.");
        }
    }//GEN-LAST:event_RelatorioActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        txtCodCaixa.setText("");
        txtPgtCaixa.setText("");
        txtNomeCliente.setText("");
        txtDataEnco.setText("");
    }//GEN-LAST:event_LimparActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        Controler.Driver.conexao();
        
        try{
            cod_caixa = Integer.valueOf(txtCodCaixa.getText());
	
            try{
		Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT cai_pgt, cai_prod_pgt, cai_nome_cli, cai_data_pgt FROM caixa where cai_cod_pgt = " + cod_caixa;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    
                    while(rs.next()){
                        String cai_pgt = rs.getString("cai_pgt");
                        String cai_prod_pgt = rs.getString("cai_prod_pgt");
                        String cai_nome_cli = rs.getString("cai_nome_cli");
                        String cai_data_pgto = rs.getString("cai_data_pgt");

                        try{
                            SimpleDateFormat data_formato = new SimpleDateFormat("yyyy-MM-dd");
                            Date data = data_formato.parse(cai_data_pgto);

                            SimpleDateFormat data_formatada = new SimpleDateFormat("dd/MM/yyyy");
                            cai_data_pgt = data_formatada.format(data);
                        }catch (ParseException ex){
                            JOptionPane.showMessageDialog(null, "Erro ao pesquisar a data.");
                        }
	
                        i++;
                        
                        txtPgtCaixa.setText(String.valueOf(cai_pgt));
                        cmbProdEnco.setSelectedItem(String.valueOf(cai_prod_pgt));
                        txtNomeCliente.setText(String.valueOf(cai_nome_cli));
                        txtDataEnco.setText(String.valueOf(cai_data_pgt));
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
            txtCodCaixa.setText("");
        }
        
        refresh();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Controler.Driver.conexao();
        
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja excluir?", "EXCLUIR", 0, 3, null, op, "");
        
        if (escolha == 0){
            
            try{
                cod_caixa = Integer.valueOf(txtCodCaixa.getText());

                Connection con = null;

                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                String sql = "DELETE FROM caixa WHERE cai_cod_pgt = " + cod_caixa;
                
                try{
                    PreparedStatement excluir = (PreparedStatement) con.prepareStatement(sql);
                    excluir.execute();
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                    txtCodCaixa.setText("");
                    txtDataEnco.setText("");
                    txtPgtCaixa.setText("");
                    txtNomeCliente.setText("");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro ao excluir.");
                }
                
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite o código corretamente.");
                txtCodCaixa.setText("");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Registro não deletado.");
        }
        
        refresh();
    }//GEN-LAST:event_ExcluirActionPerformed

    private void IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirActionPerformed
        Controler.Driver.conexao();
        
        cai_produto = (String) cmbProdEnco.getSelectedItem();
        cai_nome_cli = txtNomeCliente.getText();
        
        String data = txtDataEnco.getText();
        SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
        data_formato.setLenient(false);
        try{
            java.sql.Date data_pgt = new java.sql.Date(data_formato.parse(data).getTime());
            cai_data_pgt = String.valueOf(data_pgt);
        }catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao registrar data do pagamento.");
            txtDataEnco.setText("");
        }
        
        valor_pgt = txtPgtCaixa.getText();
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
	double numeroValor = 0;
        try{ 
            numeroValor = nf.parse(valor_pgt).doubleValue();
	}catch (ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao registrar o valor do pagamento.");
	}
        cai_pgt = new BigDecimal(numeroValor).setScale(2, RoundingMode.HALF_EVEN);
        
        try{
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO caixa(cai_pgt, cai_prod_pgt, cai_nome_cli, cai_data_pgt) values ('" + cai_pgt + "','" + cai_produto + "','" + cai_nome_cli + "','" + cai_data_pgt + "')";
            
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute();
                JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                txtDataEnco.setText("");
                txtPgtCaixa.setText("");
                txtNomeCliente.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtPgtCaixa.setText("");
        }
        
        refresh();
    }//GEN-LAST:event_IncluirActionPerformed

    private void cmbProdEncoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProdEncoMouseMoved
        String produto_encomenda = (String) cmbProdEnco.getSelectedItem();
        cmbProdEnco.setToolTipText(produto_encomenda);
    }//GEN-LAST:event_cmbProdEncoMouseMoved

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
            java.util.logging.Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Caixa_GUI().setVisible(true);
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
    public static javax.swing.JButton Incluir;
    public static javax.swing.JButton Limpar;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton Pesquisar;
    public static javax.swing.JButton Relatorio;
    private javax.swing.JButton Sair;
    private java.util.List<View.Caixa> caixaList;
    private javax.persistence.Query caixaQuery;
    public static javax.swing.JComboBox<String> cmbProdEnco;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_caixa;
    private javax.swing.JTextField txtCodCaixa;
    public static javax.swing.JFormattedTextField txtDataEnco;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPgtCaixa;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
