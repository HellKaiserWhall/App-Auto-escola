package telas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDAO {
	
	private SQL bd;
	private String sql, mensagem;
	
	/**
	 * um m�todo usado para se conectar com o banco de dados
	 */
	public VeiculoDAO() {
		bd = new SQL();
	}
	
	/**
	 * um m�todo que cadastra um ve�culo no banco de dados
	 * @param v recebe os objetos da classe Veiculo para realizar um cadastro de um ve�culo
	 * @return retorna uma mensagem informando se o ve�culo foi cadastrado com sucesso ou se houve algum erro
	 */
	public String cadastrar(Veiculo v) {
		sql = "insert into veiculo values (?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, v.getModelo());
			bd.st.setString(2, v.getAnoFabricacao());
			bd.st.setString(3, v.getRenavan());
			bd.st.setString(4, v.getPlaca());
			bd.st.executeUpdate();
			
			mensagem = "Ve�culo cadastrado com sucesso";
		}
		catch(SQLException e) {
			mensagem = "erro " + e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um m�todo que realiza a altera��o de um cadastro de um ve�culo
	 * @param v recebe os atributos da classe Veiculo para utiliz�-los na altera��o de um cadastro de um ve�culo
	 * @return retorna uma mensagem informando se a altera��o foi bem sucedida ou se houve algum erro
	 */
	public String alterar(Veiculo v) {
		sql = "update veiculo set modelo=?,ano_fabricacao=?,renavan=?,placa=? where modelo=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, v.getModelo());
			bd.st.setString(2, v.getAnoFabricacao());
			bd.st.setString(3, v.getRenavan());
			bd.st.setString(4, v.getPlaca());
			bd.st.setString(5, v.getModelo());
			bd.st.executeUpdate();
			
			mensagem = "Ve�culo atualizado com sucesso!";
		}
		catch(SQLException e){
			mensagem = "Erro " + e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um m�todo que exclui um cadastro de um ve�culo a partir de seu modelo e sua placa
	 * @param modelo recebe o modelo do ve�culo a ser exclu�do
	 * @param placa recebe a placa do ve�culo a ser exclu�do
	 * @return retorna uma mensagem informando se o procedimento foi bem sucedido ou se houve algum erro
	 */
	public String excluir(String modelo, String placa) {
		sql = "delete from veiculo where modelo=? and placa=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, modelo);
			bd.st.setString(2, placa);
			bd.st.executeUpdate();
			
			mensagem = "Ve�culo exclu�do com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "Erro: " + e.getMessage();
		}
		return mensagem;
	}
	
	/**
	 * um m�todo que cria uma lista contendo os dados do veiculo
	 * @return retorna uma lista com os dados do veiculo
	 */
	public List<Veiculo> listarModelo() {
		List<Veiculo> lista = new ArrayList<>();
		
		String sql = "select * from veiculo";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			
			while(bd.rs.next()) {
				Veiculo obj = new Veiculo();
								
				obj.setModelo(bd.rs.getString("modelo"));
				obj.setAnoFabricacao(bd.rs.getString("ano_fabricacao"));
				obj.setRenavan(bd.rs.getString("renavan"));
				obj.setPlaca(bd.rs.getString("placa"));
								
				lista.add(obj);				
			}
		}
		catch(SQLException e){
			System.out.println("Erro: "+ e.getMessage());
			return null;
		}
		finally {
			bd.close();
		}
		return lista;
	}
}
