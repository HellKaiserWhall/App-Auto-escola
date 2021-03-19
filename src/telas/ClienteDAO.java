package telas;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ClienteDAO {
	
	private SQL bd;
	private String sql, mensagem;
	
	/**
	 * um método usado para se conectar com o banco de dados
	 */
	public ClienteDAO() {
		bd = new SQL();
	}
	
	/**
	 * um método utilizado para realizar um cadastro de um cliente no banco de dados
	 * @param c atributo utilizado para receber os objetos da superclasse Pessoa e utilizá-los no cadastro de um cliente
	 * @param c2 atributo utilizado para receber os objetos da classe Cliente e utilizá-los no cadastro de um cliente
	 * @return retorna uma mensagem informando se o cadastro pôde ser realizado ou se houve algum erro
	 */
	public String cadastrar(Cliente c, Cliente c2) {
		sql = "insert into Cliente values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, c.getNome());
			bd.st.setString(2, c.getCpf());
			bd.st.setString(3, c.getRg());
			bd.st.setString(4, c.getDataNasc());
			bd.st.setString(5, c.getNomePai());
			bd.st.setString(6, c.getNomeMae());
			bd.st.setString(7, c.getNacionalidade());
			bd.st.setString(8, c.getNaturalidade());
			bd.st.setString(9, c.getEstadoCivil());
			bd.st.setString(10, c.getEscolaridade());
			bd.st.setString(11, c.getCidade());
			bd.st.setString(12, c.getBairro());
			bd.st.setInt(13, c.getNumeroCasa());
			bd.st.setString(14, c.getEndereco());
			bd.st.setString(15, c.getEmail());
			bd.st.setString(16, c.getTelefone());
			bd.st.setString(17, c2.getProfissao());
			bd.st.setString(18, c2.getPgu());
			bd.st.setString(19, c2.getCategoria());
			bd.st.setString(20, c2.getInicioMatricula());
			bd.st.setString(21, c2.getFimMatricula());
			bd.st.setDouble(22, c2.getValorTotal());
			bd.st.setDouble(23, c2.getValorParcela());
			bd.st.setString(24, c2.getVencimento1());
			bd.st.setString(25, c2.getVencimento2());
			bd.st.setString(26, c2.getVencimento3());
			bd.st.setBoolean(27, c2.isStatus1());
			bd.st.setBoolean(28, c2.isStatus2());
			bd.st.setBoolean(29, c2.isStatus3());
			bd.st.setDouble(30, c2.getValorEntrada());
			bd.st.executeUpdate();
			
			mensagem = "Cliente cadastrado com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		catch(NullPointerException e) {
			mensagem = "erro "+ e.getMessage();
		}
		catch(NumberFormatException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um método utilizado para realizar uma alteração de algum dado de um cliente no banco de dados
	 * @param c atributo utilizado para receber os objetos da superclasse Pessoa e utilizá-los na alteração de um cadastro de um cliente
	 * @param c2 atributo utilizado para receber os objetos da classe Cliente e utilizá-los na alteração de um cadastro de um cliente
	 * @return retorna uma mensagem informando se a alteração pôde ser realizada ou se houve algum erro
	 */
	public String alterar(Cliente c, Cliente c2) {
		sql = "update Cliente set nome=?,cpf=?, rg=?, nascimento=?,nome_pai=?,nome_mae=?,nascionalidade=?,naturalidade=?,"
				+ "estado_civil=?,escolaridade=?,cidade=?,bairro=?,num_casa=?,endereco=?,email=?,telefone=?,profissao=?,"
				+ "pgu=?,categoria=?,inicio=?,fim=?,valor_total=?,valor_parcela=?,vencimento1=?,vencimento2=?,"
				+ "vencimento3=?,pag1=?,pag2=?,pag3=?,valor_entrada=? where nome = ?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, c.getNome());
			bd.st.setString(2, c.getCpf());
			bd.st.setString(31, c.getNome());
			bd.st.setString(3, c.getRg());
			bd.st.setString(4, c.getDataNasc());
			bd.st.setString(5, c.getNomePai());
			bd.st.setString(6, c.getNomeMae());
			bd.st.setString(7, c.getNacionalidade());
			bd.st.setString(8, c.getNaturalidade());
			bd.st.setString(9, c.getEstadoCivil());
			bd.st.setString(10, c.getEscolaridade());
			bd.st.setString(11, c.getCidade());
			bd.st.setString(12, c.getBairro());
			bd.st.setInt(13, c.getNumeroCasa());
			bd.st.setString(14, c.getEndereco());
			bd.st.setString(15, c.getEmail());
			bd.st.setString(16, c.getTelefone());
			bd.st.setString(17, c2.getProfissao());
			bd.st.setString(18, c2.getPgu());
			bd.st.setString(19, c2.getCategoria());
			bd.st.setString(20, c2.getInicioMatricula());
			bd.st.setString(21, c2.getFimMatricula());
			bd.st.setDouble(22, c2.getValorTotal());
			bd.st.setDouble(23, c2.getValorParcela());
			bd.st.setString(24, c2.getVencimento1());
			bd.st.setString(25, c2.getVencimento2());
			bd.st.setString(26, c2.getVencimento3());
			bd.st.setBoolean(27, c2.isStatus1());
			bd.st.setBoolean(28, c2.isStatus2());
			bd.st.setBoolean(29, c2.isStatus3());
			bd.st.setDouble(30, c2.getValorEntrada());
			bd.st.executeUpdate();
			
			mensagem = "Cliente alterado com sucesso!";
		}
		catch(SQLException e) {
			mensagem = "erro "+ e.getMessage();
		}
		catch(NullPointerException e) {
			mensagem = "erro "+ e.getMessage();
		}
		finally {
			bd.close();
		}
		return mensagem;
	}
	
	/**
	 * um método que exclui um cadastro do banco de dados a partir do nome do cliente
	 * @param nome recebe o nome do cliente a ser excluído
	 * @return retorna uma mensagem informando se o cadastro do cliente foi excluído ou se houve algum erro
	 */
	public String excluir(String nome) {
		sql = "delete from cliente where nome=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, nome);
			bd.st.executeUpdate();
			
			mensagem = "Cliente excluído com sucesso!";
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
	 * um método que cria uma lista contendo os dados do cliente
	 * @return uma lista contendo os dados do cliente
	 */
	public List<Cliente> listarNomeCliente() {
		List<Cliente> lista = new ArrayList<>();
		
		String sql = "select * from cliente";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			
			while(bd.rs.next()) {
				Cliente obj = new Cliente();
				
				obj.setNome(bd.rs.getString("nome"));
				obj.setCpf(bd.rs.getString("cpf"));
				obj.setRg(bd.rs.getString("rg"));
				obj.setDataNasc(bd.rs.getString("nascimento"));
				obj.setNomePai(bd.rs.getString("nome_pai"));
				obj.setNomeMae(bd.rs.getString("nome_mae"));
				obj.setNacionalidade(bd.rs.getString("nascionalidade"));
				obj.setNaturalidade(bd.rs.getString("naturalidade"));
				obj.setEstadoCivil(bd.rs.getString("estado_civil"));
				obj.setEscolaridade(bd.rs.getString("escolaridade"));
				obj.setCidade(bd.rs.getString("cidade"));
				obj.setBairro(bd.rs.getString("bairro"));
				obj.setNumeroCasa(bd.rs.getInt("num_casa"));
				obj.setEndereco(bd.rs.getString("endereco"));
				obj.setEmail(bd.rs.getString("email"));
				obj.setTelefone(bd.rs.getString("telefone"));
				obj.setProfissao(bd.rs.getString("profissao"));
				obj.setPgu(bd.rs.getString("pgu"));
				obj.setCategoria(bd.rs.getString("categoria"));
				obj.setInicioMatricula(bd.rs.getString("inicio"));
				obj.setFimMatricula(bd.rs.getString("fim"));
				obj.setValorTotal(bd.rs.getDouble("valor_total"));
				obj.setValorParcela(bd.rs.getDouble("valor_parcela"));
				obj.setVencimento1(bd.rs.getString("vencimento1"));
				obj.setVencimento2(bd.rs.getString("vencimento2"));
				obj.setVencimento3(bd.rs.getString("vencimento3"));
				obj.setStatus1(bd.rs.getBoolean("pag1"));
				obj.setStatus2(bd.rs.getBoolean("pag2"));
				obj.setStatus3(bd.rs.getBoolean("pag3"));
				obj.setValorEntrada(bd.rs.getDouble("valor_entrada"));
								
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
