public class Programa {

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}
	
	public static void main (String [] args) {
		System.out.println("Inicio de de nuestro programa.");

		int c = sumar(2, 4);

		System.out.println("El resultado de 2 + 4 = " + c);

		int d = restar(2, 4);

		System.out.println("El resultado de 2 - 4 = " + d);

	}
}
