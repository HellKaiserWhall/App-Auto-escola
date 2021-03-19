package telas;

public class Veiculo {

	private String modelo;
	private String placa;
	private String renavan;
	private String anoFabricacao;
	
	/**
	 * método construtor da classe Veiculo
	 */
	public Veiculo() {		
	}
		
	/**
	 * método que recebe os objetos da classe Veiculo
	 * @param modelo recebe o modelo do veiculo
	 * @param placa recebe a placa do veiculo
	 * @param renavan recebe o numero do renavan do veiculo
	 * @param anoFabricacao recebe o ano que o veiculo foi fabricado
	 */
	public Veiculo(String modelo, String placa, String renavan, String anoFabricacao) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.renavan = renavan;
		this.anoFabricacao = anoFabricacao;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavan() {
		return renavan;
	}
	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}	
}
