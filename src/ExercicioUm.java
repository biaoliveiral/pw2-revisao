
public class ExercicioUm {

	public static void main(String[] args) {
		int numeroA = 30, numeroB = 45, numeroC;
		
		System.out.println("Valor A = " + numeroA);
		System.out.println("Valor B = " + numeroB);
		numeroC = numeroA;
		numeroA = numeroB;
		numeroB = numeroC;
		System.out.println("Valor A p�s alter. = " + numeroA);
		System.out.println("Valor B p�s alter. = " + numeroB);
	}
}
