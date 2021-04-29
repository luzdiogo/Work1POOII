package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {

	private Date datal;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;

	public Contratacao(Date datal, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.status = Status.PENDENTE;
		this.datal = new Date();
		this.cargo = cargo;
		this.funcionario = funcionario;
		this.projeto = projeto;
		projeto.adicionarContracao(this);		

	}
		
	public Date getDatal() {
		return datal;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public Status getStatus() {
		return status;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	
	public void contratar() {
		this.status = Status.CONTRATADO;
	}
	public void pendente() {
		this.status = Status.PENDENTE; 	
	}
	public void demitir() {
		if (this.status == Status.CONTRATADO) {
			this.status = Status.DEMITIDO;
		}	
	}

	
	@Override
	public String toString() {
		return "Contratacao [datal=" + datal + ", cargo=" + cargo + ", status=" + status + ", funcionario="
				+ funcionario + ", projeto=" + projeto + "]";
	}	
}