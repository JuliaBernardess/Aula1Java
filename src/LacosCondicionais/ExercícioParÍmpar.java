package LacosCondicionais;

import java.util.Scanner;

public class ExercícioParÍmpar {

	public static void main(String[] args) {
		
		int num;
		
	    Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite o número :");
		num = leia.nextInt();
		
	   if (num % 2 == 0){
        System.out.println(" O número é par ");
        
       } else {
        System.out.println(" O número é ímpar ");
        
        }
    
       if (num >= 0){
        System.out.println(" O número é positivo ");
        
      } else {
        System.out.println(" O número é negativo  ");
    }
}
	}
