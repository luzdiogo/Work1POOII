package entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Projeto {

	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> listContratacao = new ArrayList<>();
		
	//* Construtor (String/Date/Date) *//
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}
	
	//* Método Adicionar (Contratação) *//
	public boolean adicionarContracao(Contratacao contratacao) {
		
		if(contratacao != null && !listContratacao.contains(contratacao)) {
			this.listContratacao.add(contratacao);
			return true;		
	}
	return false;		
	}
	//* Método Remover (Contratação) *//
	public boolean removerContratacao(Contratacao contratacao) {
		
		if(contratacao != null && listContratacao.size() > 0 && listContratacao.contains(contratacao)) {
			this.listContratacao.remove(contratacao);
			return true;		
	}
	return false;	
	}
	
	//* Interface: Lista *// 
	
	public void listContratacao() {
		if (listContratacao.isEmpty()) {
			System.out.println("***Contratações***");
			System.out.println("Projeto:\n\t" + this.nome + "Não há nenhum(a) funcionário(a) contratado ou cadastrado em algum projeto.");
		}
		else {
			System.out.println();
			System.out.println("***Contratações***");
			System.out.println("Projeto:\n\t" + this.nome);
			
			for (Contratacao contrato : this.listContratacao) {
				System.out.println("Funcionario(s):\n\t" + contrato.getFuncionario().getNome()
					+ " [Status: " + contrato.getStatus() + "]");
			}
		}
	}

	//* Getters & Setters *//
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}
	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}	
	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}

	public List<Contratacao> getListContratacao() {
		return listContratacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dt_Inicio == null) ? 0 : dt_Inicio.hashCode());
		result = prime * result + ((dt_Termino == null) ? 0 : dt_Termino.hashCode());
		result = prime * result + ((listContratacao == null) ? 0 : listContratacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		if (dt_Inicio == null) {
			if (other.dt_Inicio != null)
				return false;
		} else if (!dt_Inicio.equals(other.dt_Inicio))
			return false;
		if (dt_Termino == null) {
			if (other.dt_Termino != null)
				return false;
		} else if (!dt_Termino.equals(other.dt_Termino))
			return false;
		if (listContratacao == null) {
			if (other.listContratacao != null)
				return false;
		} else if (!listContratacao.equals(other.listContratacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}