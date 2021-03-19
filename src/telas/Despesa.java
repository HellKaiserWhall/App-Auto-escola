package telas;

public class Despesa {
	
	private String observacao;
	private String dataDespesa;
	private double valorDespesa;
	private Veiculo veiculo;
	
	/**
	 * m�todo construtor da classe Despesa
	 */
	public Despesa() {		
	}
	
	/**
	 * m�todo que recebe os objetos a serem enviados ao banco
	 * @param observacao recebe um texto contendo o porqu� da despesa
	 * @param dataDespesa recebe uma data de pagamento da despesa
	 * @param valorDespesa recebe o valor total a ser pago da despesa
	 * @param veiculo recebe qual ve�culo � respons�vel pela despesa
	 */
	public Despesa(String observacao, String dataDespesa, double valorDespesa, Veiculo veiculo) {
		super();
		this.observacao = observacao;
		this.dataDespesa = dataDespesa;
		this.valorDespesa = valorDespesa;
		this.veiculo = veiculo;
	}
	
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getDataDespesa() {
		return dataDespesa;
	}
	public void setDataDespesa(String dataDespesa) {
		this.dataDespesa = dataDespesa;
	}
	public double getValorDespesa() {
		return valorDespesa;
	}
	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
