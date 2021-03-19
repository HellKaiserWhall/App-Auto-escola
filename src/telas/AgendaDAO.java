package telas;

import java.sql.SQLException;
import java.sql.Statement;

public class AgendaDAO {
	
	private SQL bd;
	private String sql, mensagem;
	
	/**
	 * Um metódo usado para se conectar com o banco de dados
	 */
	public AgendaDAO(){
		bd = new SQL();
	}
	
	/**
	 * Um método utilizado para realizar o cadastro de aulas
	 * @param a atributo utilizado para receber os objetos da classe Agendamento e cadastrá-los no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar o cadastro da aula de acordo com os objetos enviados
	 */
	public String cadastrar(Agendamento a) {
		sql = "insert into agenda values(?,?,?,(select id_cliente from cliente where nome = ?),"
				+ "(select id_funcionario from funcionario where nome = ?),(select id_veiculo from veiculo where placa = ?))";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, a.getDataAgendamento());
			bd.st.setString(2, a.getHoraAgendamento());
			bd.st.setString(3, a.getObservacao());
			bd.st.setString(4, a.getCliente().getNome());
			bd.st.setString(5, a.getFuncionario().getNome());
			bd.st.setString(6, a.getVeiculo().getPlaca());

			if(bd.st.executeUpdate()==1) {
				mensagem = "Aula cadastrada com sucesso!";
			}
			else {
				mensagem = "Não é possível cadastrar essa aula...";
			}			
			
		}
		catch(SQLException e) {
			mensagem = "Não é possível cadastrar essa aula. Funcionário, cliente ou veículo indisponível.";
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * Um método utilizado para realizar alterações de aulas
	 * @param a atributo utilizado para receber os objetos da classe Agendamento e alterá-los no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar a alteração da aula de acordo com os objetos enviados
	 */
	public String alterar(Agendamento a) {
		sql = "update agenda set data_aula=?, hora_aula=?, observacao=? where id_cliente in(select id_cliente from cliente where nome = ?) and "
				+ "id_funcionario in(select id_funcionario from funcionario where nome = ?) and id_veiculo in(select id_veiculo from veiculo where placa = ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, a.getDataAgendamento());
			bd.st.setString(2, a.getHoraAgendamento());
			bd.st.setString(3, a.getObservacao());
			bd.st.setString(4, a.getCliente().getNome());
			bd.st.setString(5, a.getFuncionario().getNome());
			bd.st.setString(6, a.getVeiculo().getPlaca());

			if(bd.st.executeUpdate()==1) {
				mensagem = "Aula alterada com sucesso!";
			}
			else {
				mensagem = "Não é possível alterar essa aula. Funcionário, cliente ou veículo indisponível.";
			}			
			
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
	 * Um método utilizado para realizar exclusões de aulas
	 * @param a atributo utilizado para receber os objetos da classe Agendamento e excluí-los no banco de dados
	 * @return retorna uma mensagem informando se foi possível realizar a exclusão da aula de acordo com os objetos enviados
	 */
	public String excluir(Agendamento a) {
		sql = "delete from agenda where data_aula=? and hora_aula=? and observacao=? and id_cliente in(select id_cliente from cliente where nome = ?) and "
			+ "id_funcionario in(select id_funcionario from funcionario where nome = ?) and id_veiculo in(select id_veiculo from veiculo where placa = ?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, a.getDataAgendamento());
			bd.st.setString(2, a.getHoraAgendamento());
			bd.st.setString(3, a.getObservacao());
			bd.st.setString(4, a.getCliente().getNome());
			bd.st.setString(5, a.getFuncionario().getNome());
			bd.st.setString(6, a.getVeiculo().getPlaca());
			bd.st.executeUpdate();
			mensagem = "Aula excluída com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "Erro: "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}

}
