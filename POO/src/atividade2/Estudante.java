package atividade2;

public class Estudante {
		// Declarando instancias
		String name;
		String registration;
		int age;
		int year;
		float globalAverage;
		static int QUANTIDADE_INSTANCIAS;
		static float media;
		
		// Constructor
		public Estudante(String nameEs, String registrationEs, int ageEs, int yearEs, float globalAverageEs) {
			this.name = nameEs;
			this.registration = registrationEs;
			this.age = ageEs;
			this.year = yearEs;
			this.globalAverage = globalAverageEs;
			QUANTIDADE_INSTANCIAS++;
//			media = media + this.globalAverage;
		}
		public Estudante() {
		}
		
		
		// Impressão do Objeto
		public String toString() {
			return "Estudante:[Name:"+this.name+", Registration:"+this.registration+", Age:"+this.age+", Year:"+this.year+", Global Average:"+this.globalAverage+"]";
		}
		
		// Função de informação básica.
		public String EstudanteInfo() {
			return "Estudante: "+this.name+", \n Registration: "+this.registration+".";
		}
		
//		public void mediaG() {
//			return media/QUANTIDADE_INSTANCIAS;
//		}
		
}
