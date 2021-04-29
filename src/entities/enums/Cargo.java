package entities.enums;

public enum Cargo {

	DIRETOR("Gerenciar e controlar as atividades da empresa"), 
	ANALISTA("Elaborar planos de desenvolvimento interno"), 
	ASSESSOR("Auxiliar nas atividades internas e orientar a equipe"),
	TECNICO("Suporte especializado na área afim"), 
	ADMINISTRATIVO("Planejar e organizar o fluxo de trabalho");	
	
	private String descricao;

	Cargo(String descricao) {
		this.descricao = descricao;
	}
		
	public String getDescricao() {
		return descricao;
	}			
}