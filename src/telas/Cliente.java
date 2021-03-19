package telas;

import java.time.LocalDate;
import java.util.Date;

public class Cliente extends Pessoa {
	
	private String profissao;
	private String pgu;
	private String categoria;
	private String inicioMatricula;
	private String fimMatricula;
	private double valorTotal;
	private double valorParcela;
	private String vencimento1;
	private String vencimento2;
	private String vencimento3;
	private boolean status1;
	private boolean status2;
	private boolean status3;
	private double valorEntrada;
	
	/**
	 * método construtor do cliente
	 */
	public Cliente() {			
	}
	
	/**
	 * metódo que recebe os objetos da superclasse Pessoa a serem enviados ao banco
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
	public Cliente(String nome, String cpf, String rg, String dataNasc, String nomePai, String nomeMae,
			String nacionalidade, String naturalidade, String estadoCivil, String escolaridade, String cidade,
			String bairro, int numeroCasa, String endereco, String email, String telefone) {
		super(nome, cpf, rg, dataNasc, nomePai, nomeMae, nacionalidade, naturalidade, estadoCivil, escolaridade, cidade, bairro,
				numeroCasa, endereco, email, telefone);		
	}
	
	/**
	 * metódo que recebe os objetos do cliente a serem enviados ao banco
	 * @param profissao recebe a profissão que o cliente exerce
	 * @param pgu recebe o número do pgu do cliente
	 * @param categoria recebe a categoria da habilitação que o cliente contratará
	 * @param inicioMatricula recebe a data de início da matrícula do cliente
	 * @param fimMatricula recebe a data limite da matrícula do cliente
	 * @param valorTotal recebe o valor total a ser pago pelo cliente
	 * @param valorParcela recebe o valor da parcela do cliente
	 * @param vencimento1 recebe a data de vencimento da primeira parcela do cliente
	 * @param vencimento2 recebe a data de vencimento da segunda parcela do cliente
	 * @param vencimento3 recebe a data de vencimento da terceira parcela do cliente
	 * @param status1 recebe o status de pagamento da primeira parcela do cliente
	 * @param status2 recebe o status de pagamento da segunda parcela do cliente
	 * @param status3 recebe o status de pagamento da terceira parcela do cliente
	 * @param valorEntrada recebe o valor de entrada pago pelo cliente do cliente
	 */
	public Cliente(String profissao, String pgu, String categoria, String inicioMatricula, String fimMatricula,
			double valorTotal, double valorParcela, String vencimento1, String vencimento2, String vencimento3,
			boolean status1, boolean status2, boolean status3, double valorEntrada) {
		super();
		this.profissao = profissao;
		this.pgu = pgu;
		this.categoria = categoria;
		this.inicioMatricula = inicioMatricula;
		this.fimMatricula = fimMatricula;
		this.valorTotal = valorTotal;
		this.valorParcela = valorParcela;
		this.vencimento1 = vencimento1;
		this.vencimento2 = vencimento2;
		this.vencimento3 = vencimento3;
		this.status1 = status1;
		this.status2 = status2;
		this.status3 = status3;
		this.valorEntrada = valorEntrada;
	}
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getPgu() {
		return pgu;
	}
	public void setPgu(String pgu) {
		this.pgu = pgu;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getInicioMatricula() {
		return inicioMatricula;
	}
	public void setInicioMatricula(String inicioMatricula) {
		this.inicioMatricula = inicioMatricula;
	}
	public String getFimMatricula() {
		return fimMatricula;
	}
	public void setFimMatricula(String fimMatricula) {
		this.fimMatricula = fimMatricula;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public String getVencimento1() {
		return vencimento1;
	}
	public void setVencimento1(String vencimento1) {
		this.vencimento1 = vencimento1;
	}
	public String getVencimento2() {
		return vencimento2;
	}
	public void setVencimento2(String vencimento2) {
		this.vencimento2 = vencimento2;
	}
	public String getVencimento3() {
		return vencimento3;
	}
	public void setVencimento3(String vencimento3) {
		this.vencimento3 = vencimento3;
	}
	public boolean isStatus1() {
		return status1;
	}
	public void setStatus1(boolean status1) {
		this.status1 = status1;
	}
	public boolean isStatus2() {
		return status2;
	}
	public void setStatus2(boolean status2) {
		this.status2 = status2;
	}
	public boolean isStatus3() {
		return status3;
	}
	public void setStatus3(boolean status3) {
		this.status3 = status3;
	}
	public double getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
}
