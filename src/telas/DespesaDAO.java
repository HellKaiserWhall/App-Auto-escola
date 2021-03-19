package telas;

import java.sql.SQLException;
import java.sql.Statement;

public class DespesaDAO {
	
	private SQL bd;
	private String sql, mensagem;
	
	/**
	 * um método usado para se conectar ao banco de dados
	 */
	public DespesaDAO(){
		bd = new SQL();
	}
	
	/**
	 * um método utilizado para cadastrar uma despesa no banco de dados
	 * @param d atributo utilizado para receber os objetos da classe Despesa e utilizá-los no cadastro de uma despesa no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar o cadastro da despesa ou se houve algum erro
	 */
	public String cadastrar(Despesa d) {
		sql = "insert into despesa values(?,?,?,(select id_veiculo from veiculo where placa = ?))";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			bd.st.setString(1, d.getDataDespesa());
			bd.st.setDouble(2, d.getValorDespesa());
			bd.st.setString(3, d.getObservacao());
			bd.st.setString(4, d.getVeiculo().getPlaca());
			bd.st.executeUpdate();
			
			mensagem = "Despesa cadastrada com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "Erro: "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um método utilizado para alterar um cadastro de uma despesa no banco de dados
	 * @param d atributo utilizado para receber os objetos da classe Despesa e utilizá-los na alteração de um cadastro de uma depensa no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar a alteração do cadastro da despesa ou se houve algum erro
	 */
	public String alterar(Despesa d) {
		sql = "update despesa set data_realizacao=?,valor=?,observacao=? where id_veiculo in(select id_veiculo from veiculo where placa=?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, d.getDataDespesa());
			bd.st.setDouble(2, d.getValorDespesa());
			bd.st.setString(3, d.getObservacao());
			bd.st.setString(4, d.getVeiculo().getPlaca()); 
			bd.st.executeUpdate();
			
			mensagem = "Despesa alterada com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "Erro: "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}	
	
	/**
	 * um método utilizado para excluir uma despesa no banco de dados
	 * @param d atributo utilizado para receber os objetos da classe Despesa e utilizá-los na exclusão de um cadastro de depensa no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar a exclusão de uma despesa ou se houve algum erro
	 */
	public String excluir(Despesa d) {
		sql = "delete from despesa where data_realizacao=? and valor=? and observacao=? and id_veiculo in(select id_veiculo from veiculo where placa=?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, d.getDataDespesa());
			bd.st.setDouble(2, d.getValorDespesa());
			bd.st.setString(3, d.getObservacao());
			bd.st.setString(4, d.getVeiculo().getPlaca()); 
			bd.st.executeUpdate();
			
			mensagem = "Despesa excluída com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
}
