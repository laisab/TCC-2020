package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Pesquisar_MOD {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static String cliente_cadastrado = "";
    static DefaultListModel modelo;
    static String[] cod_cliente;
    static int linha = 0;
    
    //---Cliente cadastrado
    public static void ListaPesquisa(){
        Controler.Driver.conexao();
        modelo = new DefaultListModel();
        View.Tela_Cliente_Cadastrado_GUI.lstPesquisa.setModel(modelo);
        
        try{
            cliente_cadastrado = View.Tela_Cliente_Cadastrado_GUI.txtCadastrado.getText();
            
            Connection con = null;
            
            try{
                con = (Connection) DriverManager.getConnection(url, username, password);
            }catch (SQLException ex){
                Logger.getLogger(View.Tela_Cliente_Cadastrado_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String sql = "SELECT cli_cod, cli_nome FROM cliente where cli_nome like'" + cliente_cadastrado + "%' ORDER BY cli_nome";
            Statement stm = (Statement) con.createStatement();
            
            try{
                ResultSet rs = stm.executeQuery(sql);
                modelo.removeAllElements();
                
                int i = 0;
                cod_cliente = new String[5];
                
                while(rs.next() && i < 5){
                    modelo.addElement(rs.getString("cli_nome"));
                    cod_cliente[i] = rs.getString("cli_cod");
                    i++;
                }
                
                if(i >= 0){
                    View.Tela_Cliente_Cadastrado_GUI.lstPesquisa.setVisible(true);
                }else{
                    View.Tela_Cliente_Cadastrado_GUI.lstPesquisa.setVisible(false);
                }
                
                ResultadoPesquisa();
                
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Erro ao consultar.");
            }
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ao listar dados.");
        }
        
    }
    
    public static void MostraPesquisa(){
        Controler.Driver.conexao();
        linha = View.Tela_Cliente_Cadastrado_GUI.lstPesquisa.getSelectedIndex();
        
        if(linha >= 0){
            
            try{
                Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(View.Tela_Cliente_Cadastrado_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT * FROM cliente where cli_cod = " + cod_cliente[linha];
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na consulta de dados.");
                }
                
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.");
            }
            
            ResultadoPesquisa();
        }
    }

    public static void ResultadoPesquisa(){
        Controler.Driver.conexao();
        
        try{
            cliente_cadastrado = View.Tela_Cliente_Cadastrado_GUI.txtCadastrado.getText();
            Connection con = null;
                
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(View.Tela_Cliente_Cadastrado_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT cli_nome, cli_tel, cli_tel, cli_email, cli_cpf, cli_sexo, cli_rua, cli_num, cli_compl, cli_bairro, cli_cidade, cli_cep FROM cliente where cli_cod = " + cod_cliente[linha];
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
                    while(rs.next()){
                        String nome_cli = rs.getString("cli_nome");
                        String telefone_cli = rs.getString("cli_tel");
                        String email_cli = rs.getString("cli_email");
                        String cpf_cli = rs.getString("cli_cpf");
                        String rua_cli = rs.getString("cli_rua");
                        String num_cli = rs.getString("cli_num");
                        String compl_cli = rs.getString("cli_compl");
                        String bairro_cli = rs.getString("cli_bairro");
                        String cidade_cli = rs.getString("cli_cidade");
                        String cep_cli = rs.getString("cli_cep");
                        String sexo_cli = rs.getString("cli_sexo");
                        
                        i++;
                        
                        View.Tela_Pedidos_GUI.txtNomeCliente.setText(String.valueOf(nome_cli));
                        View.Tela_Pedidos_GUI.txtTelCliente.setText(String.valueOf(telefone_cli));
                        //View.Tela_Pedidos_GUI.txtEmailCliente.setText(String.valueOf(email_cli));
                        View.Tela_Pedidos_GUI.txtCpfCliente.setText(String.valueOf(cpf_cli));
                        View.Tela_Pedidos_GUI.txtRuaCliente.setText(String.valueOf(rua_cli));
                        View.Tela_Pedidos_GUI.txtNumeroCliente.setText(String.valueOf(num_cli));
                        //View.Tela_Pedidos_GUI.txtComplCliente.setText(String.valueOf(compl_cli));
                        View.Tela_Pedidos_GUI.txtBairroCliente.setText(String.valueOf(bairro_cli));
                        View.Tela_Pedidos_GUI.txtCidadeCliente.setText(String.valueOf(cidade_cli));
                        View.Tela_Pedidos_GUI.txtCepCliente.setText(String.valueOf(cep_cli));
                        
                        if(sexo_cli.equals("M")){
                            View.Tela_Pedidos_GUI.rdnMascCliente.setSelected(true);
                        }else{ //cli_sexo = "F"
                            View.Tela_Pedidos_GUI.rdnFemCliente.setSelected(true);
                        }
                    }
                        
                    if(i == 0){
                        JOptionPane.showMessageDialog(null, "Dado não cadastrado", "ATENÇÃO", 2);
                    }
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Erro na consulta de dados.");
                }
                
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o servidor.");
        }
        
    }
}