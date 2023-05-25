package LacosCondicionais;

import java.util.Scanner;

 public class CondicionalSwitch1 {
	 
 public static void main(String[] args) {
    
	 int numero, quantidade;
	 float valorTotal;
	 Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto :");
		numero = leia.nextInt();
		
		System.out.println("Digite a quantidade do produto :");
		quantidade = leia.nextInt();
		
		
		
		switch(numero) {
		
		case 1:
			
		valorTotal = quantidade * 10.00f;
		System.out.printf( "Cachorro quente %.2f " ,valorTotal );
		
		break;
		
		case 2:
			
			valorTotal = quantidade * 15.00f ;
			System.out.printf(  " X- salada %.2f " , valorTotal );
			
			break;
			
		case 3:
			
			valorTotal = quantidade * 18.00f ;
			System.out.printf( " X- bacon %.2f " , valorTotal );
			
			break;
			
		case 4:
			
			valorTotal = quantidade * 12.00f;
			System.out.printf( " Bauru %.2f ", valorTotal );
			
			break;
     case 5:
			
			valorTotal = quantidade * 8.00f ;
			System.out.printf(  " Refrigerante %.2f " , valorTotal);
			
			break;
		case 6:
			
			valorTotal = quantidade * 13.00f;
			System.out.printf(  " Suco de laranja %.2f " ,valorTotal);
			
			break;
	
	 
	 
	 
	 
	  
		} 
	 
}
 }
