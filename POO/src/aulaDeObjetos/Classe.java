package aulaDeObjetos;

public class Classe {
	String cpf;
	String nome;
	float peso;
	float altura;
	
	public Classe(String nomeA, String cpfA, float pesoA, float alturaA){
		this.cpf = cpfA;
		this.nome = nomeA;
		this.peso = pesoA;
		this.altura = alturaA;
	}
	
	public String toString() {
		return "Classe[Nome: "+this.nome+"; CPF: "+this.cpf+"; Peso: "+this.peso+", Altura: "+this.altura+"]";
	}
}
