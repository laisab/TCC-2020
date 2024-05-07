package Model;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gerar_MOD {
    static String url = "jdbc:mysql://localhost/atelie";
    static String username = "root";
    static String password = "";
    
    static int cod_encomenda = 0;
    
    public static void Gerar_Recibo(){
        try{
            cod_encomenda = Integer.valueOf(View.Tela_Encomendas_GUI.txtCodEnco.getText());
            
            try{
                Connection con = null;
	
                try{
                    con = (Connection) DriverManager.getConnection(url, username, password);
                }catch (SQLException ex){
                    Logger.getLogger(View.Tela_Encomendas_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                String sql = "SELECT cliente.cli_nome, encomenda.enco_prod, encomenda.enco_valor from cliente, encomenda where encomenda.cli_cod = cliente.cli_cod and encomenda.enco_cod = " + cod_encomenda;
                Statement stm = (Statement) con.createStatement();
                
                try{
                    ResultSet rs = stm.executeQuery(sql);
                    
                    int i = 0;
	
                    while(rs.next()){
                        String cli_nome = rs.getString("cli_nome");
                        String enco_prod = rs.getString("enco_prod");
                        String enco_valor = rs.getString("enco_valor");

                        i++;
                        
                        Date data_atual = new Date();
                        SimpleDateFormat data_formato = new SimpleDateFormat("dd/MM/yyyy");
                        String data_formatada = data_formato.format(data_atual);
                        
                        Document documento = new Document();
                        
                        try{
                            PdfWriter.getInstance(documento, new FileOutputStream("C:\\Users\\Public\\Documents\\Recibo.pdf"));
                            documento.open();
	
                            //---Imagem do recibo
                            Image imagem = Image.getInstance("Logo_recibo.png");
                            documento.add(imagem);
                            
                            //---Cabeçalho do recibo
                            Font font = new Font(Font.FontFamily.HELVETICA, 30, Font.BOLD, BaseColor.PINK);
                            Paragraph cabecalho = new Paragraph("ATELIÊ MALU DOLCE", font);
                            cabecalho.setAlignment(Element.ALIGN_CENTER);
                            documento.add(cabecalho);
                            
                            Paragraph espaco = new Paragraph("    ");
                            documento.add(espaco);
                             
                            //---Nome do cliente no recibo
                            Paragraph nome_cliente = new Paragraph("Cliente: " + cli_nome);
                            documento.add(nome_cliente);
                            
                            //---Data do dia
                            Paragraph data = new Paragraph("Data de impressão de recibo: " + data_formatada);
                            documento.add(data);
                            
                            documento.add(espaco);
                            
                            //---Itens mostrados no recibo
                            Font fonte = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);
                            Paragraph itens = new Paragraph("CÓDIGO" + "                             " + "PRODUTO" + "                             " + "VALOR", fonte);
                            itens.setAlignment(Element.ALIGN_CENTER);
                            documento.add(itens);
                            
                            //---Informações do banco de dados
                            Paragraph itens_info = new Paragraph(cod_encomenda + "                        " + enco_prod + "                        " + enco_valor);
                            itens_info.setAlignment(Element.ALIGN_CENTER);
                            documento.add(itens_info);
                            
                            documento.add(espaco);
                            
                            //---Total
                            Font fonte2 = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.BLACK);
                            Paragraph total = new Paragraph("Total: R$" + enco_valor, fonte2);
                            documento.add(total);
                            
                            documento.add(espaco);
                            
                            //Agradecimento
                            Font fonte3 = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, BaseColor.PINK);
                            Paragraph agradecimento = new Paragraph("Muito obrigada pela compra efetuada no Ateliê Malu Dolce!", fonte3);
                            documento.add(agradecimento);
                        }catch (DocumentException ex){
                            JOptionPane.showMessageDialog(null, "Erro ao escrever o arquivo.");
                        }catch (FileNotFoundException ex){
                            JOptionPane.showMessageDialog(null, "Erro ao procurar o arquivo.");
                        }finally{
                            documento.close();
                        }

                        try{
                            Desktop.getDesktop().open(new File("C:\\Users\\Public\\Documents\\Recibo.pdf"));
                        }catch (IOException ex){
                            JOptionPane.showMessageDialog(null, "Erro.");
                        }
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
            View.Tela_Encomendas_GUI.txtCodEnco.setText("");
        }
    }
    
}
