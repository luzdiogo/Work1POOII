package entities.enums;

public enum Status {
	
	PENDENTE("Contratação Pendente."), 
	CONTRATADO("Contratação efetivada com sucesso."), 
	DEMITIDO("Contrato encerrado com funcionário.");
	
	private String descricao;

	Status(String descricao) {
		this.descricao = descricao;
	}
		
	public String getDescricao() {
		return descricao;
	}		
}