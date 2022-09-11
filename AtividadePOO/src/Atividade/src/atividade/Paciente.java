package atividade;

public class Paciente {
	String nome;
	String endereco;
	String cpf;
	String tipoSangue;
	int idade;
	boolean doente;
	
	public Paciente(String nomeC, String enderecoC, String cpfC, String tipoSangueC, int idadeC, boolean doenteC) {
		this.nome = nomeC;
		this.endereco = enderecoC;
		this.cpf = cpfC;
		this.tipoSangue = tipoSangueC;
		this.idade = idadeC;
		this.doente = doenteC;
	}
	
	public Paciente() {
	}
	
	public String toString() {
		return "Paciente[Nome:"+this.nome+", Endereço:"+this.endereco+", CPF:"+this.cpf+", Tipo Sangueneo:"+tipoSangue+", Idade:"+this.idade+", Doente:"+this.doente+"].";
	}
	
	public String Prioridade() {
		if(doente == true) {
			return "ALTA PRIORIDADE";
		} else {
			return "Fila de espera";
		}
	}
	
}
