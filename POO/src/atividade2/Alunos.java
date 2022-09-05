package atividade2;

public class Alunos {
	public static void main(String[] args) {
		Estudante es1 = new Estudante("Jorge Jubilante", "MATR1525", 12, 5, 9.5f);
		Estudante es2 = new Estudante("Rina RaioLazer", "MATR1725", 13, 6, 7.3f);
		Estudante es3 = new Estudante("Vasco Damasco", "MATR1825", 14, 7, 6.5f);
		Estudante es4 = new Estudante("Geroldo do Rodo", "MATR1925", 15, 8, 9.0f);
		Estudante es5 = new Estudante();
		
		Estudante[] array = {es1, es2, es3, es4, es5};
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(Estudante.QUANTIDADE_INSTANCIAS);
	}
}
