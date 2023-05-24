package PacoteJava;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String args[]) {
	
	
		
		float salarioBruto, adcNoturno,horasExtras,desconto,salarioLiq;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Escreva o salário bruto: ");
		 salarioBruto = leia.nextFloat();
		 
		 System.out.println(" Escreva o adicional noturno: ");
		 adcNoturno = leia.nextFloat();
		 
		 System.out.println(" Escreva as horas extras: ");
		 horasExtras = leia.nextFloat();
		 
		 System.out.println(" Escreva o desconto: ");
		 desconto = leia.nextFloat();
		 
		 
		 salarioLiq = salarioBruto + adcNoturno + (horasExtras * 5) - desconto;
		 System.out.println("Valor do salário bruto: " + salarioLiq);
		 
		 
	}

}
