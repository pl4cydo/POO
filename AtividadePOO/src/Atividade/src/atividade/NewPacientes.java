package atividade;

public class NewPacientes {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Pedro", "Recife", "015.154.487-05", "A+", 17, true);
		Paciente p2 = new Paciente("Ana Beth", "Jaboatão", "033.154.487-05", "AB+", 28, false);
		
		System.out.println(p1+" "+p1.Prioridade());
		System.out.println(p2+" "+p2.Prioridade());
		
	}
}
