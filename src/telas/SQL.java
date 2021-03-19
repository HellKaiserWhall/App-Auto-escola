package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {

	public Connection con = null;
	public PreparedStatement st = null;
	public ResultSet rs = null;
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private final String BANCO = "AUTO_ESCOLA2";
	private final String URL = "jdbc:sqlserver://localhost:58035;databasename="+BANCO+";integratedSecurity=true";
	
	/**
	 * m�todo que faz a conex�o com o banco de dados
	 * @return retorna se foi poss�vel fazer a conex�o com o banco
	 */
	public boolean getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL);
			return true;
		}
		catch(SQLException erro) {
			System.out.println("Falha na conex�o: "+erro.getMessage());
		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver n�o encontrado!");
		}
		return false;
	}
	
	/**
	 * m�todo que fecha a conex�o com o banco de dados
	 */
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
				}
		}
		catch(SQLException erro) {}
	
		try {
			if(st!=null) {
				st.close();
				}
		}
		catch(SQLException erro) {}
	
		try {
			if(con!=null) {
				con.close();
			}
		}
		catch(SQLException erro) {}
	}
	
	public static void main(String[] args) {
		SQL bd = new SQL();
		bd.getConnection();
	}
}
