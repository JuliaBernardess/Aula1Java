package LacosCondicionais;

import java.util.Scanner;

public class Exercícios1 {
	public static void main(String args[]) {
		
		int A,B,C;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A :");
		A = leia.nextInt();
		
		System.out.println("Digite o número B :");
		B = leia.nextInt();
		
		System.out.println("Digite o número C :");
		C = leia.nextInt();
		
		if (( A + B) > C) {
			System.out.println("A Soma é Maior do que C ");
			
		} else if (( A + B) < C) {
				System.out.println("A Soma é Menor do que C ");
				
		} else if ( A + B == C){
			System.out.println("A Soma é igual a C ");
		
		} else { 
			System.out.println("Um erro ocorreu ");
				
		}
		
	}
	
	
	}
	

