package telas;

public class Instrutor extends Pessoa {
	
	private String cargo;
	private String dataAdmissao;
	private int numeroCredencial;
	private String numeroCNH;
	private int numeroFilhos;	
	
	/**
	 * método construtor do funcionario
	 */
	public Instrutor() {	
	}
	
	/**
	 * método que recebe os objetos da superclasse Pessoa a serem enviados ao banco
	 * @param nome recebe o nome do funcionario
	 * @param cpf recebe o cpf do funcionario
	 * @param rg recebe o rg do funcionario
	 * @param dataNasc recebe a data de nascimento do funcionario
	 * @param nomePai recebe o nome do pai do funcionario
	 * @param nomeMae recebe o nome da mãe do funcionario
	 * @param cidade recebe a cidade que o funcionario reside
	 * @param bairro recebe o bairro que o funcionario reside
	 * @param numeroCasa recebe o numero da casa do funcionario
	 * @param endereco recebe o nome da rua que o funcionario reside
	 * @param email recebe o email do funcionario
	 * @param telefone recebe o telefone de contato do funcionario
	 */
	public Instrutor(String nome, String cpf, String rg, String dataNasc, String nomePai, String nomeMae, String cidade,
			String bairro, int numeroCasa, String endereco, String email, String telefone) {
		super(nome, cpf, rg, dataNasc, nomePai, nomeMae, cidade, bairro, numeroCasa, endereco, email, telefone);		
	}

	/**
	 * método que recebe os objetos do funcionario a serem enviados ao banco
	 * @param cargo recebe o cargo que o funcionario exerce
	 * @param dataAdmissao recebe a data que o funcionario foi contratado
	 * @param numeroCredencial reccebe o numero da credencial do funcionario
	 * @param numeroCNH recebe o numero da cnh do funcionario
	 * @param numeroFilhos recebe o numero de filhos que o funcionario possui
	 */
	public Instrutor(String cargo, String dataAdmissao, int numeroCredencial, String numeroCNH, int numeroFilhos) {
		super();
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.numeroCredencial = numeroCredencial;
		this.numeroCNH = numeroCNH;
		this.numeroFilhos = numeroFilhos;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public int getNumeroCredencial() {
		return numeroCredencial;
	}
	public void setNumeroCredencial(int numeroCredencial) {
		this.numeroCredencial = numeroCredencial;
	}
	public String getNumeroCNH() {
		return numeroCNH;
	}
	public void setNumeroCNH(String numeroCNH) {
		this.numeroCNH = numeroCNH;
	}
	public int getNumeroFilhos() {
		return numeroFilhos;
	}
	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}	
}
