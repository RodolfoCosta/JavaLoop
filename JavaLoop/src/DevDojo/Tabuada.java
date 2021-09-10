package DevDojo;

public class Tabuada {

	public static void main(String[] args) {

		System.out.println("PROGRAMA INICIADO");

		for (int i = 0; i < 11; i++) {
			System.out.println("\nTabuada do " + i);
			for (int j = 0; j < 11; j++) {

				System.out.println(i + " x " + j + " = " + (i * j));

			}
		}
		System.out.println("\nPROGRAMA ENCERRADO");
	}

}
