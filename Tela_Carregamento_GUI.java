package View;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela_Carregamento_GUI extends javax.swing.JFrame {
    
    //---VERIFICAÇÃO DE DATA
    public void verifica_data(){
       Date data = new Date();
       SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
       String dataFormatada = formataData.format(data);
       
       if (dataFormatada.equals("30/12/2025")){
           JOptionPane.showMessageDialog(null, "Necessária atualização do software.");
           System.exit(0);
       }else{
           //JOptionPane.showMessageDialog(null, "Abrindo...");
       }
    }

    public Tela_Carregamento_GUI() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone_atelie.png")).getImage());     
        verifica_data();
        new Thread(){
            
            public void run(){
             
                for(int i=0;i<101;i++){
                    try{
                        sleep(60);
                        bar.setValue(i);
                        
                        if (bar.getValue()==10){
                            progress.setText("Fazendo conexão do banco de dados.");
                            Controler.Driver.conexao();
                            sleep(20);
                        }else if (bar.getValue()<60){
                            progress.setText("Carregando banco de dados.");
                        }else if (bar.getValue()<100){
                            progress.setText("Carregamento quase completo.");
                        }else{
                            progress.setText("Carregamento completo.");
                            sleep(3000);
                            new TelaPrincipal_GUI().setVisible(true);
                            dispose();
                        }
                    }catch (InterruptedException ex){
                        Logger.getLogger(Tela_Carregamento_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }       
                }
            } 
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JProgressBar();
        progress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 221, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(null);

        bar.setForeground(new java.awt.Color(255, 204, 255));
        jPanel1.add(bar);
        bar.setBounds(130, 380, 390, 40);

        progress.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        progress.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(progress);
        progress.setBounds(185, 450, 350, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo_atelie.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 40, 330, 330);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 636, 510);

        setSize(new java.awt.Dimension(636, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela_Carregamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Carregamento_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Carregamento_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel progress;
    // End of variables declaration//GEN-END:variables
}
