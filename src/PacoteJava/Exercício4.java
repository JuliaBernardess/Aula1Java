package PacoteJava;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String args[]) {
		
		float numero1, numero2, numero3, numero4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		 System.out.println(" Digite o numero 1: ");
		 numero1 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 2: ");
		 numero2 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 3: ");
		 numero3 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 4: ");
		 numero4 = leia.nextFloat();
		 
		 diferenca = ((numero1 * numero2)- (numero3 * numero4));
         System.out.printf("Essa é a diferença: %.1f", diferenca);
		
         System.out.println("\nDigite o numero 1: ");
		 numero1 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 2: ");
		 numero2 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 3: ");
		 numero3 = leia.nextFloat();
		 
		 System.out.println(" Digite o numero 4: ");
		 numero4 = leia.nextFloat();
		 
		 diferenca = ((numero1 * numero2)- (numero3 * numero4));
         System.out.printf("Essa é a diferença: %.1f", diferenca);
			
	}
		}
	
		
	

