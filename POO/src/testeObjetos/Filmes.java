package testeObjetos;

public class Filmes {
	String nome;
	String diretor;
	String categoria;
	float duracao;
	float anoLancamento;
	
	public Filmes(String nomeA, String diretorA, String categoriaA, float duracaoA, float anoLancamentoA){
		nome = nomeA;
		diretor = diretorA;
		categoria = categoriaA;
		duracao = duracaoA;
		anoLancamento = anoLancamentoA;
	};
	
	public String toString() {
		return "Filmes:[Nome: "+this.nome+", Diretor: "+this.diretor+", Categoria: "+this.categoria+", Duracao:"+this.duracao+", Ano de Lançamento: "+this.anoLancamento+"]";
	}
}
