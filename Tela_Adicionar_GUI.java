package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Adicionar_GUI extends javax.swing.JFrame {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
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
            View.Tela_Estoque_GUI.tabela_estoque.setModel(Model.Atualizar_MOD.estoque(rs));
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Tela_Adicionar_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Produto = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtProdNovoEstoque = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtQtdeNovoEstoque = new javax.swing.JTextField();
        Adicionar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        rdnEmbalagem = new javax.swing.JRadioButton();
        rdnIngrediente = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel10.setText("ADICIONAR:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 10, 140, 20);

        txtProdNovoEstoque.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel1.add(txtProdNovoEstoque);
        txtProdNovoEstoque.setBounds(20, 80, 180, 20);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel13.setText("QUANTIDADE:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 110, 130, 20);

        txtQtdeNovoEstoque.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        jPanel1.add(txtQtdeNovoEstoque);
        txtQtdeNovoEstoque.setBounds(20, 130, 180, 20);

        Adicionar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        Adicionar.setText("OK");
        Adicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Adicionar.setContentAreaFilled(false);
        Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(Adicionar);
        Adicionar.setBounds(230, 70, 80, 40);

        Sair.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Sair.setContentAreaFilled(false);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel1.add(Sair);
        Sair.setBounds(230, 120, 80, 40);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jLabel11.setText("NOME DO PRODUTO:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 60, 140, 20);

        rdnEmbalagem.setBackground(new java.awt.Color(255, 204, 204));
        Produto.add(rdnEmbalagem);
        rdnEmbalagem.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        rdnEmbalagem.setText("EMBALAGEM");
        jPanel1.add(rdnEmbalagem);
        rdnEmbalagem.setBounds(170, 30, 130, 23);

        rdnIngrediente.setBackground(new java.awt.Color(255, 204, 204));
        Produto.add(rdnIngrediente);
        rdnIngrediente.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        rdnIngrediente.setText("INGREDIENTE");
        jPanel1.add(rdnIngrediente);
        rdnIngrediente.setBounds(20, 30, 130, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 170);

        setSize(new java.awt.Dimension(340, 170));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarActionPerformed
        Controler.Driver.conexao();
        
        //Adicionar ingrediente
        if (rdnIngrediente.isSelected()){
            ingrediente_nome = txtProdNovoEstoque.getText();
            ingrediente_qtde = Integer.valueOf(txtQtdeNovoEstoque.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "INSERT INTO estoque(esto_ingrediente, esto_qtd_ingrediente) values (' " + ingrediente_nome + "','" + ingrediente_qtde + "')";

                try{
                    PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                    inserir.execute();
                    JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    this.dispose();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
                }
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
                txtQtdeNovoEstoque.setText("");
            }
      
        //Adicionar embalagem    
        }else if (rdnEmbalagem.isSelected()){
            embalagem_nome = txtProdNovoEstoque.getText();
            embalagem_qtde = Integer.valueOf(txtQtdeNovoEstoque.getText());
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "INSERT INTO estoque(esto_embalagem, esto_qtd_embalagem) values (' " + embalagem_nome + "','" + embalagem_qtde + "')";

                try{
                    PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                    inserir.execute();
                    JOptionPane.showMessageDialog(null, "Inserção realizada com sucesso");
                    this.dispose();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na inserção de dados.");
                }
            }catch (NumberFormatException erro){
                JOptionPane.showMessageDialog(null, "Digite os dados corretamente.");
                txtQtdeNovoEstoque.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível salvar os dados. Selecione o que deseja adicionar.");
        }
        
        refresh();
    }//GEN-LAST:event_AdicionarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        Object [] op = {"Sim", "Não"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja sair desta tela?", "SAIR", 0, 3, null, op, "Sim");

            if (escolha == 0){
                this.dispose();
            }else{}
            
        new Tela_Estoque_GUI().setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Adicionar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Adicionar_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar;
    private javax.swing.ButtonGroup Produto;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JRadioButton rdnEmbalagem;
    public static javax.swing.JRadioButton rdnIngrediente;
    public static javax.swing.JTextField txtProdNovoEstoque;
    public static javax.swing.JTextField txtQtdeNovoEstoque;
    // End of variables declaration//GEN-END:variables
}
