package LaçosRepetição;

import java.util.Scanner;

public class aulaWhile {

	public static void main(String[] args) {

		{

			Scanner leia = new Scanner(System.in);
			String continua = "s";
			int num1, num2, res = 0;

			Scanner leiaScanner = new Scanner(System.in);
			while (continua.equals("s")) {
				System.out.println("digite 1° valor: ");
				num1 = leia.nextInt();

				System.out.println("digite 2° valor: ");
				num2 = leia.nextInt();

				res = num1 + num2;

				System.out.println("O resultado de " + num1 + " + " + num2 + " é igual a " + res);

				System.out.println("Voce deseja continuar: [s/n] ");
				continua = leia.next();

			}
			System.out.println(" \nFim do Programa ");
		}
	}

}
