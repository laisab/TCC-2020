package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Tela_Relatorio_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static int cod_cliente = 0;

    public Tela_Relatorio_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        Caixa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lstPesquisa = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        txtProcurarCliente = new javax.swing.JTextField();
        ProcurarCliente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtRuaCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtSexoCliente = new javax.swing.JTextField();
        txtComplCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtBairroCliente = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtTelCliente = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        jLabel38 = new javax.swing.JLabel();
        GerarRelatorio = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 221, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel27.setText("INFORMAÇÕES DO CLIENTE");
        jPanel4.add(jLabel27);
        jLabel27.setBounds(260, 130, 270, 30);

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

        jPanel2.setBackground(new java.awt.Color(255, 221, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        lstPesquisa.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(lstPesquisa);
        lstPesquisa.setBounds(240, 30, 230, 20);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel14.setText("PESQUISAR CÓDIGO DE CLIENTE:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(5, 10, 240, 20);

        txtProcurarCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtProcurarCliente);
        txtProcurarCliente.setBounds(240, 10, 230, 20);

        ProcurarCliente.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        ProcurarCliente.setText("PROCURAR");
        ProcurarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ProcurarCliente.setContentAreaFilled(false);
        ProcurarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(ProcurarCliente);
        ProcurarCliente.setBounds(390, 40, 80, 30);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(140, 40, 480, 80);

        jPanel7.setBackground(new java.awt.Color(255, 221, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("NOME DO CLIENTE:");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(10, 50, 130, 20);

        txtNomeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNomeCliente);
        txtNomeCliente.setBounds(10, 70, 180, 22);

        txtRuaCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtRuaCliente);
        txtRuaCliente.setBounds(250, 25, 180, 22);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setText("RUA:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(250, 5, 130, 20);

        txtNumCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtNumCliente);
        txtNumCliente.setBounds(250, 70, 180, 22);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel12.setText("NÚMERO DA CASA:");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(250, 50, 160, 20);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel13.setText("TELEFONE:");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(10, 90, 130, 20);

        txtEmailCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtEmailCliente);
        txtEmailCliente.setBounds(10, 150, 180, 22);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel25.setText("EMAIL:");
        jPanel7.add(jLabel25);
        jLabel25.setBounds(10, 130, 130, 20);

        txtSexoCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtSexoCliente);
        txtSexoCliente.setBounds(10, 230, 180, 22);

        txtComplCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtComplCliente);
        txtComplCliente.setBounds(250, 110, 180, 22);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel26.setText("COMPLEMENTO:");
        jPanel7.add(jLabel26);
        jLabel26.setBounds(250, 90, 160, 20);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel30.setText("CÓDIGO DO CLIENTE:");
        jPanel7.add(jLabel30);
        jLabel30.setBounds(10, 5, 180, 20);

        txtCodCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCodCliente);
        txtCodCliente.setBounds(10, 25, 180, 22);

        txtBairroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtBairroCliente);
        txtBairroCliente.setBounds(250, 150, 180, 20);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel36.setText("CPF:");
        jPanel7.add(jLabel36);
        jLabel36.setBounds(10, 170, 50, 20);

        try {
            txtTelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtTelCliente);
        txtTelCliente.setBounds(10, 110, 180, 22);

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel37.setText("SEXO:");
        jPanel7.add(jLabel37);
        jLabel37.setBounds(10, 210, 50, 20);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCpfCliente);
        txtCpfCliente.setBounds(10, 190, 180, 22);

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel38.setText("CIDADE:");
        jPanel7.add(jLabel38);
        jLabel38.setBounds(250, 170, 100, 20);

        GerarRelatorio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        GerarRelatorio.setText("GERAR RELATÓRIO");
        GerarRelatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GerarRelatorio.setContentAreaFilled(false);
        GerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRelatorioActionPerformed(evt);
            }
        });
        jPanel7.add(GerarRelatorio);
        GerarRelatorio.setBounds(290, 280, 180, 30);

        LimparCampos.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        LimparCampos.setText("LIMPAR CAMPOS");
        LimparCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LimparCampos.setContentAreaFilled(false);
        LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCamposActionPerformed(evt);
            }
        });
        jPanel7.add(LimparCampos);
        LimparCampos.setBounds(10, 280, 180, 30);

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel39.setText("BAIRRO:");
        jPanel7.add(jLabel39);
        jLabel39.setBounds(250, 130, 90, 20);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel40.setText("CEP:");
        jPanel7.add(jLabel40);
        jLabel40.setBounds(250, 210, 50, 20);

        txtCidadeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(250, 190, 180, 22);

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel7.add(txtCepCliente);
        txtCepCliente.setBounds(250, 230, 180, 22);

        jPanel4.add(jPanel7);
        jPanel7.setBounds(140, 170, 480, 320);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel28.setText("RELATÓRIO DE CLIENTE");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(280, 10, 270, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 636, 510);

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

    private void CaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaActionPerformed
        new Tela_Caixa_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaixaActionPerformed

    private void ProcurarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarClienteActionPerformed
        Controler.Driver.conexao();
        
        try{
            cod_cliente = Integer.valueOf(txtProcurarCliente.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Clientes_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT * FROM cliente where cli_cod = " + cod_cliente;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    
                    while(rs.next()){
                        String cli_cod = rs.getString("cli_cod");
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
                        
                        txtCodCliente.setText(String.valueOf(cli_cod));
                        txtNomeCliente.setText(String.valueOf(cli_nome));
                        txtTelCliente.setText(String.valueOf(cli_tel));
                        txtEmailCliente.setText(String.valueOf(cli_email));
                        txtCpfCliente.setText(String.valueOf(cli_cpf));
                        txtSexoCliente.setText(String.valueOf(cli_sexo));
                        txtRuaCliente.setText(String.valueOf(cli_rua));
                        txtNumCliente.setText(String.valueOf(cli_num));
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
            txtProcurarCliente.setText("");
        }
    }//GEN-LAST:event_ProcurarClienteActionPerformed

    private void GerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRelatorioActionPerformed
        try{
            Connection con = null;
	
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(View.Tela_Relatorio_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "SELECT  cliente.`cli_cod` AS cliente_cli_cod, cliente.`cli_nome` AS cliente_cli_nome, cliente.`cli_tel` AS cliente_cli_tel, cliente.`cli_rua` AS cliente_cli_rua, cliente.`cli_num` AS cliente_cli_num, cliente.`cli_bairro` AS cliente_cli_bairro, cliente.`cli_cidade` AS cliente_cli_cidade FROM `cliente` cliente";
            Statement stm = (Statement) con.createStatement();
            
            try{
                ResultSet rs = stm.executeQuery(sql);
                
                try{
                    JRResultSetDataSource RelatorioResult;
                    RelatorioResult = new JRResultSetDataSource(rs);
                    JasperPrint jpPrint = JasperFillManager.fillReport("Relatorios\\RelatorioClientes.jasper", new HashMap(), RelatorioResult);
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
    }//GEN-LAST:event_GerarRelatorioActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        txtProcurarCliente.setText("");
        txtCodCliente.setText("");
        txtNomeCliente.setText("");
        txtTelCliente.setText("");
        txtEmailCliente.setText("");
        txtCpfCliente.setText("");
        txtSexoCliente.setText("");
        txtRuaCliente.setText("");
        txtNumCliente.setText("");
        txtComplCliente.setText("");
        txtBairroCliente.setText("");
        txtCidadeCliente.setText("");
        txtCepCliente.setText("");
        lstPesquisa.setVisible(false);
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lstPesquisa.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tela_Relatorio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Relatorio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Relatorio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Relatorio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Relatorio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caixa;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Encomenda;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton GerarRelatorio;
    private javax.swing.JButton Historico;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton ProcurarCliente;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JList<String> lstPesquisa;
    public static javax.swing.JTextField txtBairroCliente;
    public static javax.swing.JFormattedTextField txtCepCliente;
    public static javax.swing.JTextField txtCidadeCliente;
    public static javax.swing.JTextField txtCodCliente;
    public static javax.swing.JTextField txtComplCliente;
    public static javax.swing.JFormattedTextField txtCpfCliente;
    public static javax.swing.JTextField txtEmailCliente;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtNumCliente;
    public static javax.swing.JTextField txtProcurarCliente;
    public static javax.swing.JTextField txtRuaCliente;
    public static javax.swing.JTextField txtSexoCliente;
    public static javax.swing.JFormattedTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables
}
