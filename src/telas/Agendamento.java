package telas;

public class Agendamento {
	
	private String observacao;
	private String dataAgendamento;
	private String horaAgendamento;
	private Cliente cliente;
	private Instrutor funcionario;
	private Veiculo veiculo;
	
	/**
	 * metódo construtor do agendamento
	 */
	public Agendamento() {
	}	
	
	/**
	 * metódo que recebe os objetos a serem enviados ao banco
	 * @param observacao recebe um texto contendo uma observação da aula a ser cadastrada/consultada
	 * @param dataAgendamento recebe uma data de aula
	 * @param horaAgendamento recebe a hora da aula
	 * @param cliente recebe um cliente para utilizar seus objetos em outras tabelas
	 * @param funcionario recebe um funcionario para utilizar seus objetos em outras tabelas
	 * @param veiculo recebe um veiculo para utilizar seus objetos em outras tabelas
	 */
	public Agendamento(String observacao, String dataAgendamento, String horaAgendamento, Cliente cliente,
			Instrutor funcionario, Veiculo veiculo) {
		super();
		this.observacao = observacao;
		this.dataAgendamento = dataAgendamento;
		this.horaAgendamento = horaAgendamento;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.veiculo = veiculo;
	}

	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Instrutor getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Instrutor funcionario) {
		this.funcionario = funcionario;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public String getDataAgendamento() {
		return dataAgendamento;
	}
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	public String getHoraAgendamento() {
		return horaAgendamento;
	}
	public void setHoraAgendamento(String horaAgendamento) {
		this.horaAgendamento = horaAgendamento;
	}
}
