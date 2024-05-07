package View;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Pedidos_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    /*---Variáveis que recebem valores da interface---*/
    /*--Variáveis - CLIENTE--*/
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
    /*--Variáveis - ENCOMENDA--*/
    static String produto_encomenda = "";
    static int qtde_encomenda = 0;
    static String tam_enco = "";
    static BigDecimal tamanho_encomenda;
    static String val_enco = "";
    static BigDecimal valor_encomenda;
    static String forma_pgt_encomenda = "";
    static String data_enco = "";
    static String data_entrega_encomenda = "";
    
    
    public Tela_Pedidos_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radSexoCliente = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Sair = new javax.swing.JButton();
        Encomenda = new javax.swing.JButton();
        Historico = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        Caixa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        txtFormaPgtEnco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtComplCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtQtdeEnco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ClienteCadastrado = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        SalvarPedido = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        rdnMascCliente = new javax.swing.JRadioButton();
        rdnFemCliente = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtDataEnco = new javax.swing.JFormattedTextField();
        txtCepCliente = new javax.swing.JFormattedTextField();
        txtTamanhoEnco = new javax.swing.JTextField();
        txtValorEnco = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JFormattedTextField();
        cmbProdEnco = new javax.swing.JComboBox<>();
        Limpar = new javax.swing.JButton();
        NovoPedido = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 221, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(636, 510));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(636, 510));
        jPanel1.setLayout(null);

        Sair.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Sair.setText("SAIR");
        Sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sair.setContentAreaFilled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel1.add(Sair);
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
        jPanel1.add(Encomenda);
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
        jPanel1.add(Historico);
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
        jPanel1.add(Cliente);
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
        jPanel1.add(Estoque);
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
        jPanel1.add(Caixa);
        Caixa.setBounds(10, 360, 110, 60);

        jPanel2.setBackground(new java.awt.Color(255, 221, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel2.setText("NOME DO CLIENTE:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 70, 130, 20);

        txtNomeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtNomeCliente);
        txtNomeCliente.setBounds(10, 90, 180, 22);

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel3.setText("SEXO DO CLIENTE:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(250, 70, 130, 20);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel4.setText("RUA:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 220, 50, 40);

        txtRuaCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtRuaCliente);
        txtRuaCliente.setBounds(10, 250, 180, 22);

        txtFormaPgtEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtFormaPgtEnco);
        txtFormaPgtEnco.setBounds(250, 170, 180, 22);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel5.setText("FORMA DE PAGAMENTO:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(250, 140, 160, 40);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel6.setText("TELEFONE:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 100, 130, 40);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel7.setText("TAMANHO (KG):");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(250, 230, 110, 20);

        txtNumeroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtNumeroCliente);
        txtNumeroCliente.setBounds(10, 290, 180, 22);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel8.setText("COMPLEMENTO:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 300, 130, 40);

        txtComplCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtComplCliente);
        txtComplCliente.setBounds(10, 330, 180, 20);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel9.setText("VALOR (R$):");
        jLabel9.setToolTipText("Digite o preço unitário do produto");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(250, 350, 80, 20);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("QUANTIDADE:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(340, 350, 110, 20);

        txtQtdeEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtQtdeEnco);
        txtQtdeEnco.setBounds(360, 370, 70, 22);

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setText("NÚMERO DA CASA:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 260, 140, 40);

        jLabel17.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel17.setText("EMAIL:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 140, 130, 40);

        txtEmailCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtEmailCliente);
        txtEmailCliente.setBounds(10, 170, 180, 22);

        jLabel18.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel18.setText("PRODUTO:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(250, 110, 160, 20);

        jLabel19.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel19.setText("CPF:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 180, 50, 40);

        ClienteCadastrado.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        ClienteCadastrado.setText("USAR CLIENTE CADASTRADO");
        ClienteCadastrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClienteCadastrado.setContentAreaFilled(false);
        ClienteCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteCadastradoActionPerformed(evt);
            }
        });
        jPanel2.add(ClienteCadastrado);
        ClienteCadastrado.setBounds(130, 20, 200, 30);

        jLabel21.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel21.setText("CEP:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(250, 300, 60, 40);

        txtBairroCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtBairroCliente);
        txtBairroCliente.setBounds(10, 370, 180, 22);

        jLabel22.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel22.setText("BAIRRO:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(10, 340, 60, 40);

        txtCidadeCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(250, 290, 180, 20);

        SalvarPedido.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        SalvarPedido.setText("SALVAR PEDIDO");
        SalvarPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalvarPedido.setContentAreaFilled(false);
        SalvarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarPedidoActionPerformed(evt);
            }
        });
        jPanel2.add(SalvarPedido);
        SalvarPedido.setBounds(320, 410, 110, 30);

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel13.setText("DATA DE ENTREGA:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(250, 190, 130, 20);

        rdnMascCliente.setBackground(new java.awt.Color(255, 204, 204));
        radSexoCliente.add(rdnMascCliente);
        rdnMascCliente.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        rdnMascCliente.setText("M");
        jPanel2.add(rdnMascCliente);
        rdnMascCliente.setBounds(250, 90, 80, 23);

        rdnFemCliente.setBackground(new java.awt.Color(255, 204, 204));
        radSexoCliente.add(rdnFemCliente);
        rdnFemCliente.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        rdnFemCliente.setText("F");
        jPanel2.add(rdnFemCliente);
        rdnFemCliente.setBounds(340, 90, 80, 23);

        jLabel23.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel23.setText("CIDADE:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(250, 260, 60, 40);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtCpfCliente);
        txtCpfCliente.setBounds(10, 210, 180, 22);

        try {
            txtDataEnco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtDataEnco);
        txtDataEnco.setBounds(250, 210, 180, 22);

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCepCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtCepCliente);
        txtCepCliente.setBounds(250, 330, 180, 22);

        txtTamanhoEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtTamanhoEnco);
        txtTamanhoEnco.setBounds(250, 250, 180, 22);

        txtValorEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        txtValorEnco.setToolTipText("Preço unitário");
        jPanel2.add(txtValorEnco);
        txtValorEnco.setBounds(250, 370, 80, 20);

        try {
            txtTelCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelCliente.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel2.add(txtTelCliente);
        txtTelCliente.setBounds(10, 130, 180, 22);

        cmbProdEnco.setBackground(new java.awt.Color(255, 204, 204));
        cmbProdEnco.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        cmbProdEnco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bolo recheado brigadeiro de leite ninho (massa branca)", "Bolo recheado mousse de leite ninho c/ geleia de morangos frescos (massa branca)", "Bolo recheado beijinho (massa branca)", "Bolo recheado doce de leite (massa branca)", "Bolo recheado quatro leites c/ abacaxi (massa branca)", "Bolo recheado prestígio (massa branca)", "Bolo trufado de maracujá (massa branca)", "Bolo recheado brigadeiro tradicional (massa chocolate)", "Bolo recheado brigadeiro de leite ninho (massa chocolate)", "Bolo recheado mousse de leite ninho c/ geleia de morangos frescos (massa chocolate)", "Bolo recheado beijinho (massa chocolate)", "Bolo recheado doce de leite (massa chocolate)", "Bolo recheado quatro leites c/ abacaxi (massa chocolate)", "Bolo recheado prestígio tradicional (massa chocolate)", "Bolo trufado chocolate meio amargo (massa chocolate)", "Bolo recheado mousse de chocolate (massa chocolate)", "Bolo artesanal de banana", "Bolo artesanal de cenoura", "Bolo artesanal de churros", "Bolo artesanal de formigueiro", "Bolo artesanal de fubá", "Bolo artesanal de laranja", "Bolo artesanal de cenoura c/ calda de chocolate", "Bolo artesanal de churros c/ calda de doce de leite", "Bolo artesanal de formigueiro c/ calda de chocolate", "Bolo artesanal de fubá c/ calda de goiabada", "Bolo artesanal de laranja c/ calda de brigadeiro branco", "Bolo de chocolate c/ calda de chocolate", "Bolo de chocolate c/ calda de beijinho", "Bolo de baunilha c/ calda de beijinho", "Bolo de baunilha c/ calda de doce de leite", "Beijinho de amendoim", "Beijinho de coco", "Beijinho moreno (coco queimado)", "Bicho de pé(morango)", "Brigadeiro branco", "Brigadeiro de chocoball", "Brigadeiro de leite ninho", "Brigadeiro de prestígio", "Brigadeiro tradicional (ao leite)" }));
        cmbProdEnco.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmbProdEncoMouseMoved(evt);
            }
        });
        jPanel2.add(cmbProdEnco);
        cmbProdEnco.setBounds(250, 130, 180, 22);

        Limpar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Limpar.setText("LIMPAR CAMPOS");
        Limpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Limpar.setContentAreaFilled(false);
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });
        jPanel2.add(Limpar);
        Limpar.setBounds(10, 410, 112, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(150, 40, 470, 450);

        NovoPedido.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        NovoPedido.setText("NOVO PEDIDO");
        NovoPedido.setToolTipText("Você está aqui");
        NovoPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NovoPedido.setContentAreaFilled(false);
        jPanel1.add(NovoPedido);
        NovoPedido.setBounds(10, 10, 110, 60);

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 1, 16)); // NOI18N
        jLabel12.setText("CADASTRO DO PEDIDO");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(280, 5, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 636, 510);

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

    private void CaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaActionPerformed
        new Tela_Caixa_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaixaActionPerformed

    private void SalvarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarPedidoActionPerformed
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
        
        if(rdnMascCliente.isSelected()){
            sexo_cliente = "M";
        }else if(rdnFemCliente.isSelected()){
            sexo_cliente = "F";
        }else{
            JOptionPane.showMessageDialog(null, "Selecione o sexo do cliente.");
        }
        
        Model.Validar_MOD.ValidaEMAIL();
        Model.Validar_MOD.ValidaCPF();
        
        produto_encomenda = (String) cmbProdEnco.getSelectedItem();
        qtde_encomenda = Integer.valueOf(txtQtdeEnco.getText());
        forma_pgt_encomenda = txtFormaPgtEnco.getText();
        
        tam_enco = txtTamanhoEnco.getText();
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        double numeroTamanho = 0;
        try {
            numeroTamanho = nf.parse(tam_enco).doubleValue();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o tamanho da encomenda.");
        }
        tamanho_encomenda = new BigDecimal(numeroTamanho).setScale(2, RoundingMode.HALF_EVEN);
        
        val_enco = txtValorEnco.getText();
        NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
	double numeroValor = 0;
        try{ 
            numeroValor = nf2.parse(val_enco).doubleValue();
            
            if (qtde_encomenda > 1){
                numeroValor = numeroValor * qtde_encomenda;
            }
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
        
        Controler.Driver.conexao();
        
        //---Campo do email não preenchido
        if (email_cliente.equals("")){
            try{
                
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO cliente(cli_nome, cli_tel, cli_cpf, cli_sexo, cli_rua, cli_num, cli_compl, cli_bairro, cli_cidade, cli_cep) values ('" + nome_cliente + "','" + telefone_cliente + "','" + cpf_cliente + "','" + sexo_cliente + "','" + rua_cliente + "','" + num_cliente + "','" + compl_cliente + "','" + bairro_cliente + "','" + cidade_cliente + "','" + cep_cliente + "')";
            String sql2 = "INSERT INTO encomenda(enco_prod, enco_qtde, enco_tamanho, enco_valor, enco_forma_pgt, enco_data_entrega, cli_cod) values (?,?,?,?,?,?, LAST_INSERT_ID())";
            
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement inserir2 = (PreparedStatement) con.prepareStatement(sql2);
                inserir.execute();
                
                inserir2.setString(1, produto_encomenda);
                inserir2.setInt(2, qtde_encomenda);
                inserir2.setBigDecimal(3, tamanho_encomenda);
                inserir2.setBigDecimal(4, valor_encomenda);
                inserir2.setString(5, forma_pgt_encomenda);
                inserir2.setString(6, data_entrega_encomenda);
                inserir2.execute();
                
                JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtCpfCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtComplCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
                    radSexoCliente.clearSelection(); 
                    txtFormaPgtEnco.setText("");
                    txtDataEnco.setText("");
                    txtTamanhoEnco.setText("");
                    txtValorEnco.setText("");
                    txtQtdeEnco.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
            
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtQtdeEnco.setText("");
            txtTamanhoEnco.setText("");
            txtValorEnco.setText("");
        }
            
        //---Campo do complemento não preenchido    
        }else if (compl_cliente.equals("")){
            
            try{
                
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO cliente(cli_nome, cli_tel, cli_email, cli_cpf, cli_sexo, cli_rua, cli_num, cli_bairro, cli_cidade, cli_cep) values ('" + nome_cliente + "','" + telefone_cliente + "','" + email_cliente + "','" + cpf_cliente + "','" + sexo_cliente + "','" + rua_cliente + "','" + num_cliente + "','" + bairro_cliente + "','" + cidade_cliente + "','" + cep_cliente + "')";
            String sql2 = "INSERT INTO encomenda(enco_prod, enco_qtde, enco_tamanho, enco_valor, enco_forma_pgt, enco_data_entrega, cli_cod) values (?,?,?,?,?,?, LAST_INSERT_ID())";
            
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement inserir2 = (PreparedStatement) con.prepareStatement(sql2);
                inserir.execute();
                
                inserir2.setString(1, produto_encomenda);
                inserir2.setInt(2, qtde_encomenda);
                inserir2.setBigDecimal(3, tamanho_encomenda);
                inserir2.setBigDecimal(4, valor_encomenda);
                inserir2.setString(5, forma_pgt_encomenda);
                inserir2.setString(6, data_entrega_encomenda);
                inserir2.execute();
                
                JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtEmailCliente.setText("");
                    txtCpfCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
                    radSexoCliente.clearSelection(); 
                    txtFormaPgtEnco.setText("");
                    txtDataEnco.setText("");
                    txtTamanhoEnco.setText("");
                    txtValorEnco.setText("");
                    txtQtdeEnco.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
            
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtQtdeEnco.setText("");
            txtTamanhoEnco.setText("");
            txtValorEnco.setText("");
        }
         
        //---Campos de email e complemento não preenchidos    
        }else if ((email_cliente.equals("")) && (compl_cliente.equals(""))){
            
            try{
                
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO cliente(cli_nome, cli_tel, cli_cpf, cli_sexo, cli_rua, cli_num, cli_bairro, cli_cidade, cli_cep) values ('" + nome_cliente + "','" + telefone_cliente + "','" + cpf_cliente + "','" + sexo_cliente + "','" + rua_cliente + "','" + num_cliente + "','" + bairro_cliente + "','" + cidade_cliente + "','" + cep_cliente + "')";
            String sql2 = "INSERT INTO encomenda(enco_prod, enco_qtde, enco_tamanho, enco_valor, enco_forma_pgt, enco_data_entrega, cli_cod) values (?,?,?,?,?,?, LAST_INSERT_ID())";
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement inserir2 = (PreparedStatement) con.prepareStatement(sql2);
                inserir.execute();
                
                inserir2.setString(1, produto_encomenda);
                inserir2.setInt(2, qtde_encomenda);
                inserir2.setBigDecimal(3, tamanho_encomenda);
                inserir2.setBigDecimal(4, valor_encomenda);
                inserir2.setString(5, forma_pgt_encomenda);
                inserir2.setString(6, data_entrega_encomenda);
                inserir2.execute();
                
                JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtCpfCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtComplCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
                    radSexoCliente.clearSelection(); 
                    txtFormaPgtEnco.setText("");
                    txtDataEnco.setText("");
                    txtTamanhoEnco.setText("");
                    txtValorEnco.setText("");
                    txtQtdeEnco.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
            
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtQtdeEnco.setText("");
            txtTamanhoEnco.setText("");
            txtValorEnco.setText("");
        }
          
        //---Todos os dados do cliente preenchidos    
        }else{
            
            try{
                
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "INSERT INTO cliente(cli_nome, cli_tel, cli_email, cli_cpf, cli_sexo, cli_rua, cli_num, cli_compl, cli_bairro, cli_cidade, cli_cep) values ('" + nome_cliente + "','" + telefone_cliente + "','" + email_cliente + "','" + cpf_cliente + "','" + sexo_cliente + "','" + rua_cliente + "','" + num_cliente + "','" + compl_cliente + "','" + bairro_cliente + "','" + cidade_cliente + "','" + cep_cliente + "')";
            String sql2 = "INSERT INTO encomenda(enco_prod, enco_qtde, enco_tamanho, enco_valor, enco_forma_pgt, enco_data_entrega, cli_cod) values (?,?,?,?,?,?, LAST_INSERT_ID())";
            
            try{
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                PreparedStatement inserir2 = (PreparedStatement) con.prepareStatement(sql2);
                inserir.execute();
                
                inserir2.setString(1, produto_encomenda);
                inserir2.setInt(2, qtde_encomenda);
                inserir2.setBigDecimal(3, tamanho_encomenda);
                inserir2.setBigDecimal(4, valor_encomenda);
                inserir2.setString(5, forma_pgt_encomenda);
                inserir2.setString(6, data_entrega_encomenda);
                inserir2.execute();
                
                JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    txtNomeCliente.setText("");
                    txtTelCliente.setText("");
                    txtEmailCliente.setText("");
                    txtCpfCliente.setText("");
                    txtRuaCliente.setText("");
                    txtNumeroCliente.setText("");
                    txtComplCliente.setText("");
                    txtBairroCliente.setText("");
                    txtCidadeCliente.setText("");
                    txtCepCliente.setText("");
                    radSexoCliente.clearSelection(); 
                    txtFormaPgtEnco.setText("");
                    txtDataEnco.setText("");
                    txtTamanhoEnco.setText("");
                    txtValorEnco.setText("");
                    txtQtdeEnco.setText("");
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
            }
            
        }catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
            txtQtdeEnco.setText("");
            txtTamanhoEnco.setText("");
            txtValorEnco.setText("");
        }
        
        }
        
    }//GEN-LAST:event_SalvarPedidoActionPerformed

    private void ClienteCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteCadastradoActionPerformed
        new Tela_Cliente_Cadastrado_GUI().setVisible(true);
    }//GEN-LAST:event_ClienteCadastradoActionPerformed

    private void cmbProdEncoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProdEncoMouseMoved
       produto_encomenda = (String) cmbProdEnco.getSelectedItem();
       cmbProdEnco.setToolTipText(produto_encomenda);
    }//GEN-LAST:event_cmbProdEncoMouseMoved

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        txtNomeCliente.setText("");
        txtTelCliente.setText("");
        txtCpfCliente.setText("");
        txtRuaCliente.setText("");
        txtNumeroCliente.setText("");
        txtComplCliente.setText("");
        txtBairroCliente.setText("");
        txtCidadeCliente.setText("");
        txtCepCliente.setText("");
        radSexoCliente.clearSelection(); 
        txtFormaPgtEnco.setText("");
        txtDataEnco.setText("");
        txtTamanhoEnco.setText("");
        txtValorEnco.setText("");
        txtQtdeEnco.setText("");
    }//GEN-LAST:event_LimparActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pedidos_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Pedidos_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caixa;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton ClienteCadastrado;
    private javax.swing.JButton Encomenda;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Historico;
    public static javax.swing.JButton Limpar;
    private javax.swing.JButton NovoPedido;
    private javax.swing.JButton Sair;
    public static javax.swing.JButton SalvarPedido;
    public static javax.swing.JComboBox<String> cmbProdEnco;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup radSexoCliente;
    public static javax.swing.JRadioButton rdnFemCliente;
    public static javax.swing.JRadioButton rdnMascCliente;
    public static javax.swing.JTextField txtBairroCliente;
    public static javax.swing.JFormattedTextField txtCepCliente;
    public static javax.swing.JTextField txtCidadeCliente;
    public static javax.swing.JTextField txtComplCliente;
    public static javax.swing.JFormattedTextField txtCpfCliente;
    public static javax.swing.JFormattedTextField txtDataEnco;
    public static javax.swing.JTextField txtEmailCliente;
    public static javax.swing.JTextField txtFormaPgtEnco;
    public static javax.swing.JTextField txtNomeCliente;
    public static javax.swing.JTextField txtNumeroCliente;
    public static javax.swing.JTextField txtQtdeEnco;
    public static javax.swing.JTextField txtRuaCliente;
    public static javax.swing.JTextField txtTamanhoEnco;
    public static javax.swing.JFormattedTextField txtTelCliente;
    public static javax.swing.JTextField txtValorEnco;
    // End of variables declaration//GEN-END:variables
}
