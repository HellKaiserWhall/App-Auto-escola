package telas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InstrutorDAO {
	
	private SQL bd;
	private String sql, mensagem;
	
	/**
	 * um método utilizado para se conectar ao banco de dados
	 */
	public InstrutorDAO() {
		bd = new SQL();
	}
	
	/**
	 * um método que realiza um cadastro de um funcionario
	 * @param f atributo utilizado para receber os objetos da superclasse Pessoa e utilizá-los no cadastro de um funcionario
	 * @param f2 atributo utilizado para receber os objetos Funcionario e utilizá-los no cadastro de um funcionario
	 * @return retorna uma mensagem informando se o cadastro do funcionario foi bem sucedido ou se houve algum erro
	 */
	public String cadastrar(Instrutor f, Instrutor f2) {
		sql = "insert into Funcionario values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, f.getNome());
			bd.st.setString(2, f.getCpf());
			bd.st.setString(3, f.getRg());
			bd.st.setString(4, f.getDataNasc());
			bd.st.setString(5, f.getNomePai());
			bd.st.setString(6, f.getNomeMae());			
			bd.st.setString(7, f.getCidade());
			bd.st.setString(8, f.getBairro());
			bd.st.setInt(9, f.getNumeroCasa());
			bd.st.setString(10, f.getEndereco());
			bd.st.setString(11, f.getEmail());
			bd.st.setString(12, f.getTelefone());
			bd.st.setString(13, f2.getCargo());
			bd.st.setString(14, f2.getDataAdmissao());
			bd.st.setInt(15, f2.getNumeroCredencial());
			bd.st.setString(16, f2.getNumeroCNH());
			bd.st.setInt(17, f2.getNumeroFilhos());
			bd.st.executeUpdate();
			
			mensagem = "Instrutor cadastrado com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um método que realiza a alteração de um cadastro de um funcionario
	 * @param f atributo utilizado para receber os objetos da superclasse Pessoa e utilizá-los na alteração de um cadastro de funcionario
	 * @param f2 atributo utilizado para receber os objetos Funcionario e utilizá-los na alteração de um cadastro de funcionario
	 * @return retorna uma mensagem informando se a alteração do cadastro do funcionario foi bem sucedido ou se houve algum erro
	 */
	public String alterar(Instrutor f, Instrutor f2) {
		sql = "update Funcionario set nome=?,cpf=?, rg=?, nascimento=?,nome_pai=?,nome_mae=?,"
				+ "cidade=?,bairro=?,num_casa=?,endereco=?,email=?,telefone=?,cargo=?,"
				+ "admissao=?,num_credencial=?,cnh=?,num_filhos=? where nome = ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, f.getNome());
			bd.st.setString(2, f.getCpf());
			bd.st.setString(3, f.getRg());
			bd.st.setString(4, f.getDataNasc());
			bd.st.setString(5, f.getNomePai());
			bd.st.setString(6, f.getNomeMae());			
			bd.st.setString(7, f.getCidade());
			bd.st.setString(8, f.getBairro());
			bd.st.setInt(9, f.getNumeroCasa());
			bd.st.setString(10, f.getEndereco());
			bd.st.setString(11, f.getEmail());
			bd.st.setString(12, f.getTelefone());
			bd.st.setString(13, f2.getCargo());
			bd.st.setString(14, f2.getDataAdmissao());
			bd.st.setInt(15, f2.getNumeroCredencial());
			bd.st.setString(16, f2.getNumeroCNH());
			bd.st.setInt(17, f2.getNumeroFilhos());
			bd.st.setString(18, f.getNome());
			bd.st.executeUpdate();
			
			mensagem = "Instrutor alterado com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}	
	
	/**
	 * um método que realiza a exclusão um cadastro de um funcionario
	 * @param nome recebe o nome do funcionario a ser excluído
	 * @return retorna uma mensagem informando se a exclusão do cadastro do funcionario foi bem sucedido ou se houve algum erro
	 */
	public String excluir(String nome) {
		sql = "delete from funcionario where nome=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, nome);
			bd.st.executeUpdate();
			
			mensagem = "Instrutor excluído com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um método que cria uma lista contendo os dados do funcionario
	 * @return retorna uma lista contendo os dados do funcionario
	 */
	public List<Instrutor> listarNomeFuncionario() {
		List<Instrutor> lista = new ArrayList<>();
		
		String sql = "select * from funcionario";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			
			while(bd.rs.next()) {
				Instrutor obj = new Instrutor();				
				
				obj.setNome(bd.rs.getString("nome"));
				obj.setCpf(bd.rs.getString("cpf"));
				obj.setRg(bd.rs.getString("rg"));
				obj.setDataNasc(bd.rs.getString("nascimento"));
				obj.setNomePai(bd.rs.getString("nome_pai"));
				obj.setNomeMae(bd.rs.getString("nome_mae"));
				obj.setCidade(bd.rs.getString("cidade"));
				obj.setBairro(bd.rs.getString("bairro"));
				obj.setNumeroCasa(bd.rs.getInt("num_casa"));
				obj.setEndereco(bd.rs.getString("endereco"));
				obj.setEmail(bd.rs.getString("email"));
				obj.setTelefone(bd.rs.getString("telefone"));
				obj.setCargo(bd.rs.getString("cargo"));
				obj.setDataAdmissao(bd.rs.getString("admissao"));
				obj.setNumeroCredencial(bd.rs.getInt("num_credencial"));
				obj.setNumeroCNH(bd.rs.getString("cnh"));
				obj.setNumeroFilhos(bd.rs.getInt("num_filhos"));
								
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
