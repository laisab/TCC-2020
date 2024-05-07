package Model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Atualizar_MOD {   
    
    //---Cliente
    public static DefaultTableModel cliente(ResultSet rs){
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            columnNames.addElement("CÓDIGO");
            columnNames.addElement("NOME");
            columnNames.addElement("TELEFONE");
            columnNames.addElement("CPF");
            columnNames.addElement("SEXO");
            
            Vector rows = new Vector();
            
            while(rs.next()){
                Vector newRow = new Vector();
                
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                
                rows.addElement(newRow);
            }
            
            return new DefaultTableModel(rows, columnNames);
            
        }catch (Exception ex){
            return null;
        }
        
    }
    
    //---Encomenda
    public static DefaultTableModel encomenda(ResultSet rs){
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            columnNames.addElement("CÓDIGO");
            columnNames.addElement("PRODUTO");
            columnNames.addElement("QTDE");
            columnNames.addElement("DATA ENTREGA");
            columnNames.addElement("TAMANHO");
            columnNames.addElement("VALOR");
            
            Vector rows = new Vector();
            
            while(rs.next()){
                Vector newRow = new Vector();
                
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                
                rows.addElement(newRow);
            }
            
            return new DefaultTableModel(rows, columnNames);
            
        }catch (Exception ex){
            return null;
        }
        
    }
    
    //---Histórico
    public static DefaultTableModel historico(ResultSet rs){
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            columnNames.addElement("CÓDIGO");
            columnNames.addElement("PRODUTO");
            columnNames.addElement("VALOR");
            columnNames.addElement("DATA ENTREGA");
            
            Vector rows = new Vector();
            
            while(rs.next()){
                Vector newRow = new Vector();
                
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                
                rows.addElement(newRow);
            }
            
            return new DefaultTableModel(rows, columnNames);
            
        }catch (Exception ex){
            return null;
        }
        
    }
    
    //---Estoque
    public static DefaultTableModel estoque(ResultSet rs){
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            columnNames.addElement("CÓDIGO");
            columnNames.addElement("INGREDIENTES");
            columnNames.addElement("EMBALAGENS");
            columnNames.addElement("QTDE - INGREDIENTES");
            columnNames.addElement("QTDE - EMBALAGENS");
            
            Vector rows = new Vector();
            
            while(rs.next()){
                Vector newRow = new Vector();
                
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                
                rows.addElement(newRow);
            }
            
            return new DefaultTableModel(rows, columnNames);
            
        }catch (Exception ex){
            return null;
        }
        
    }
    
    //---Caixa
    public static DefaultTableModel caixa(ResultSet rs){
        
        try{
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            Vector columnNames = new Vector();
            
            columnNames.addElement("CÓDIGO");
            columnNames.addElement("PAGAMENTOS");
            columnNames.addElement("PRODUTOS");
            columnNames.addElement("NOME CLIENTE");
            columnNames.addElement("DATA");
            
            Vector rows = new Vector();
            
            while(rs.next()){
                Vector newRow = new Vector();
                
                for (int i = 1; i <= numberOfColumns; i++) {
                    newRow.addElement(rs.getObject(i));
                }
                
                rows.addElement(newRow);
            }
            
            return new DefaultTableModel(rows, columnNames);
            
        }catch (Exception ex){
            return null;
        }
        
    }
}
