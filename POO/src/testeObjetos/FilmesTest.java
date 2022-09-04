package testeObjetos;

public class FilmesTest {
	
	public static void main(String[] args) {
		
		Filmes f1 = new Filmes("Senhor dos aneis", "Diretor1", "Fantasia", 250, 2000);
		Filmes f2 = new Filmes("Senhor dos aneis2", "Diretor1", "Fantasia", 250, 2001);
		Filmes f3 = new Filmes("Senhor dos aneis3", "Diretor1", "Fantasia", 250, 2002);
		Filmes f4 = new Filmes("Senhor dos aneis4", "Diretor1", "Fantasia", 250, 2003);
		Filmes f5 = new Filmes("Senhor dos aneis5", "Diretor1", "Fantasia", 250, 2004);
		
		Filmes[] arrayFilmes = new Filmes[5];
		arrayFilmes[0] = f1;
		arrayFilmes[1] = f2;
		arrayFilmes[2] = f3;
		arrayFilmes[3] = f4;
		arrayFilmes[4] = f5;
		
		for(int i = 0; i < arrayFilmes.length; i++) {
			System.out.println(arrayFilmes[i]);
		}
	}
}
