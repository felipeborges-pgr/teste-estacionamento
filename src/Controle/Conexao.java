package Controle;

import static com.lowagie.text.pdf.PdfFileSpecification.url;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
	
	// metodo responsavel por estabelecer  a conexao com o banco infox
	java.sql.Connection conexao = null;
	
	public static Connection conector() {
	
		// Chamada do diver 
		String driver = "com.mysql.jdbc.Driver";
		
		// Informações do banco de dados
		String url = "jdbc:mysql://localhost:3306/estacionamento";
		String user = "admin";
		String password = "12345";
		
		// Estabelicimento de conexão
		
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url,user,password);
			return conexao;
		} catch(Exception e) {
			return null;
		}
	
	}
	
	 public Conexao getConexao() {
		 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	 }
}
