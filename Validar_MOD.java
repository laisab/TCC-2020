package Model;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Validar_MOD {
    
    //---Validar CPF
    public static boolean ValidaCPF(){
        String cpf_cliente = View.Tela_Pedidos_GUI.txtCpfCliente.getText();
        cpf_cliente = cpf_cliente.replace(".","");
        cpf_cliente = cpf_cliente.replace("-","");
        
        if (cpf_cliente.equals("00000000000") || cpf_cliente.equals("11111111111") ||
            cpf_cliente.equals("22222222222") || cpf_cliente.equals("33333333333") ||
            cpf_cliente.equals("44444444444") || cpf_cliente.equals("55555555555") ||
            cpf_cliente.equals("66666666666") || cpf_cliente.equals("77777777777") ||
            cpf_cliente.equals("88888888888") || cpf_cliente.equals("99999999999") ||
            (cpf_cliente.length() != 11)){
            
                JOptionPane.showMessageDialog(null, "CPF inválido.");
            }
        
        char dig10, dig11;
        int verifica = 0, i = 0, num = 0, peso = 10, res = 0;
        
        try{
            for(i = 0; i < 9; i++){
                num = cpf_cliente.charAt(i) - 48;
                verifica = verifica + (num * peso);
                peso = peso - 1;
            }
            
            res = 11 - (verifica % 11);
                if ((res == 10) || (res == 11)){
                    dig10 = '0';
                }else{
                    dig10 = (char) (res + 48);
                }
                
            peso = 11;
            for(i = 0; i < 9; i++){
                num = cpf_cliente.charAt(i) - 48;
                verifica = verifica + (num * peso);
                peso = peso - 1;
            }
            
            res = 11 - (verifica % 11);
                if ((res == 10) || (res == 11)){
                    dig11 = '0';
                }else{
                    dig11 = (char) (res + 48);
                }
            
            if ((dig10 == cpf_cliente.charAt(9)) && (dig11 == cpf_cliente.charAt(10))){
                return(true);
            }else{
                return(false);
            }
            
        }catch (InputMismatchException erro){
            JOptionPane.showMessageDialog(null, "Erro.");
        }
        return false;
    
    }
    
    //---Validar EMAIL
    public static boolean ValidaEMAIL(){
	String email_cliente = View.Tela_Pedidos_GUI.txtEmailCliente.getText();
        
        if(email_cliente.length() != 0){
            Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
            Matcher m = p.matcher(email_cliente); 
	
            if (m.find()){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Email inválido");
                return false;
            }
        }
        return false;
    }
    
}