package LaçosRepetição;

import java.util.Scanner;
public class LaçodeRepetiçãoDOWHILE5 {

	public static void main(String[] args) {

	 {
		 Scanner leia = new Scanner(System.in);
	       
	        
	        int numero, soma = 0;
	        
	        
	        System.out.println(" Digite um número inteiro (digite 0 para finalizar: ");
	        
	        do {
	            numero = leia.nextInt();
	            
	            if (numero > 0) {
	                soma = soma + numero;
	            }
	        } while (numero != 0);
	        
	        System.out.println(" A soma dos números positivos é:  " + soma);
	        
	        
	    }
	}

	
	

	
}
