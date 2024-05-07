package View;

public class Tela_Cliente_Cadastrado_GUI extends javax.swing.JFrame {

    static int enter = 0;
    
    public Tela_Cliente_Cadastrado_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCadastrado = new javax.swing.JTextField();
        Fechar = new javax.swing.JButton();
        lstPesquisa = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 13)); // NOI18N
        jLabel10.setText("DIGITE O NOME DO CLIENTE:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 20, 250, 20);

        txtCadastrado.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        txtCadastrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastradoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCadastrado);
        txtCadastrado.setBounds(20, 50, 290, 22);

        Fechar.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        Fechar.setText("Fechar");
        Fechar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Fechar.setContentAreaFilled(false);
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });
        jPanel1.add(Fechar);
        Fechar.setBounds(230, 110, 80, 40);

        lstPesquisa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 36, 0)));
        lstPesquisa.setFont(new java.awt.Font("Book Antiqua", 0, 13)); // NOI18N
        lstPesquisa.setAutoscrolls(false);
        jPanel1.add(lstPesquisa);
        lstPesquisa.setBounds(20, 70, 290, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 170);

        setSize(new java.awt.Dimension(340, 170));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lstPesquisa.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtCadastradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastradoActionPerformed
        Model.Pesquisar_MOD.ListaPesquisa();
        //Model.Pesquisar_MOD.MostraPesquisa();
    }//GEN-LAST:event_txtCadastradoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cliente_Cadastrado_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente_Cadastrado_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente_Cadastrado_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente_Cadastrado_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cliente_Cadastrado_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JList<String> lstPesquisa;
    public static javax.swing.JTextField txtCadastrado;
    // End of variables declaration//GEN-END:variables
}
