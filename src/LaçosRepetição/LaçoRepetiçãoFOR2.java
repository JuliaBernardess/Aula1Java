package LaçosRepetição;

import java.util.Scanner;

public class LaçoRepetiçãoFOR2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	int  totalpares, totalImpares ,contador,soma = 0;
	int numero;
	
	for (contador = 1; contador <= 10; contador++) { 
		 System.out.println("\nDigite o " + contador + "º número: ");
		 numero = leia.nextInt(); 
		 {
			
			 
		 if (numero % 2 == 0  ){
			 soma += numero;
		        System.out.println(" Resultado de números pares" + soma );
		 }
		      { if  (numero % 2 != 0  ){
				    soma += numero;                                                                                                                                                                                                                                                                                                                                                                     
				      System.out.println(" Resultado de números ímpares" + soma );
				      
				      
		        }
		        }
		 }
		      
	}
	}
	
}
		
	
