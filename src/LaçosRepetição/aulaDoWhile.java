package LaçosRepetição;

import java.util.Scanner;

public class aulaDoWhile {

	public static void main(String[] args) {

		int num, res;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("\nDigite um numero inteiro:");
			num = leia.nextInt();

			res = num * 5;

			System.out.println("\nO resultado é " + res);

		} while (num >= 0);
		System.out.println("\nFim do programa");
	}
}
