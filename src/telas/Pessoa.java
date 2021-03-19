package telas;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String dataNasc;
	private String nomePai;
	private String nomeMae;
	private String nacionalidade;
	private String naturalidade;
	private String estadoCivil;
	private String escolaridade;
	private String cidade;
	private String bairro;
	private int numeroCasa;
	private String endereco;
	private String email;
	private String telefone;
	
	/**
	 * método construtor da classe Pessoa
	 */
	public Pessoa() {		
	}
	
	/**
	 * metódo que recebe os objetos da classe Pessoa a serem enviados ao banco
	 * @param nome recebe o nome do cliente
	 * @param cpf recebe o cpf do cliente
	 * @param rg recebe o rg do cliente
	 * @param dataNasc recebe a data de nascimento do cliente
	 * @param nomePai recebe o nome do pai do cliente
	 * @param nomeMae recebe o nome da mãe do cliente
	 * @param nacionalidade recebe a nacionalidade do cliente
	 * @param naturalidade recebe a naturalidade do cliente
	 * @param estadoCivil recebe o estado civil do cliente
	 * @param escolaridade recebe o nível de escolaridade do cliente
	 * @param cidade recebe a cidade que mora o cliente
	 * @param bairro recebe o bairro que mora o cliente
	 * @param numeroCasa recebe o número da casa do cliente
	 * @param endereco recebe o nome da rua do cliente
	 * @param email recebe o email do cliente
	 * @param telefone recebe o telefone de contato do cliente
	 */
	public Pessoa(String nome, String cpf, String rg, String dataNasc, String nomePai, String nomeMae,
			String nacionalidade, String naturalidade, String estadoCivil, String escolaridade, String cidade,
			String bairro, int numeroCasa, String endereco, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.estadoCivil = estadoCivil;
		this.escolaridade = escolaridade;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
		
	/**
	 * método que recebe os objetos da classe Pessoa a serem enviados ao banco
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
	public Pessoa(String nome, String cpf, String rg, String dataNasc, String nomePai, String nomeMae, String cidade,
			String bairro, int numeroCasa, String endereco, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
