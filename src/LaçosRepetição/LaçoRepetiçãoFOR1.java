package LaçosRepetição;
 
import java.util.Scanner;

public class LaçoRepetiçãoFOR1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in); 
		
		int numero1, numero2, contador;
		
		 System.out.println(" Digite o primeiro número do intervalo: " );
		 numero1 = leia.nextInt(); 
		 System.out.println(" Digite o segundo número do intervalo: " );
		 numero2 = leia.nextInt();
		 
		 if( numero1 < numero2) {
		System.out.println( " No intervalo entre " +numero1+ " e " +numero2);
		
			 
		 }
		 for (contador = 1; contador < numero2; contador++) { 
		 System.out.println("\nDigite o " + contador + "º nome: "); 
		 }
		 
		 if(contador%3==0 && contador%5==0);
	
		 
	     System.out.println(contador + " é mutiplo de 3 e 5 ");
	
	   }
       }
	      } else {
	    	  
	      System.out.println( " Intervalo inválido");
	 
	
	      
	      }
      }
	
	  
	}

