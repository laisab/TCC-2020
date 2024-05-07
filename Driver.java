package Controler;

import javax.swing.JOptionPane;

public class Driver {
    public static void conexao(){
        try { // Conectando o driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver conectado");
        }catch (Exception ex){ 
            JOptionPane.showMessageDialog(null,"Driver não encontrado.");
        }
    }
}
