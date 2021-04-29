package entities.enums;

public enum Status {
	
	PENDENTE("Contrata��o Pendente."), 
	CONTRATADO("Contrata��o efetivada com sucesso."), 
	DEMITIDO("Contrato encerrado com funcion�rio.");
	
	private String descricao;

	Status(String descricao) {
		this.descricao = descricao;
	}
		
	public String getDescricao() {
		return descricao;
	}		
}