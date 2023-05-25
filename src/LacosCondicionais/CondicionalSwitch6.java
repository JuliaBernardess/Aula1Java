package LacosCondicionais;

import java.util.Scanner;

public class CondicionalSwitch6 {
	public static void main(String[] args) {
		String colaborador;
		int cargo;
		float salario, novoSalario;
		
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome :");
		colaborador = leia.next();
		
		System.out.println("Digite seu cargo :");
		cargo = leia.nextInt();
		
		System.out.println("Digite seu salário :");
		salario = leia.nextFloat();
		
		switch(cargo) {
		
		case 1:
			
		novoSalario = salario +(0.10f*salario);
		System.out.printf( colaborador+ " Gerente \nvalor do salário reajustado %.2f" ,novoSalario);
		
		break;
		
		case 2:
			
			novoSalario = salario +(0.07f*salario);
			System.out.printf( colaborador+ " Vendedor \nvalor do salário reajustado %.2f" ,novoSalario);
			
			break;
			
		case 3:
			
			novoSalario = salario +(0.09f*salario);
			System.out.printf( colaborador+ " Supervisor \nvalor do salário reajustado %.2f" ,novoSalario);
			
			break;
			
		case 4:
			
			novoSalario = salario +(0.06f*salario);
			System.out.printf( colaborador+ " Motorista \nvalor do salário reajustado %.2f" ,novoSalario);
			
			break;
        case 5:
			
			novoSalario = salario +(0.05f*salario);
			System.out.printf( colaborador+ " Estoquista \nvalor do salário reajustado %.2f" ,novoSalario);
			
			break;
		case 6:
			
			novoSalario = salario +(0.08f*salario);
			System.out.printf( colaborador+ " Técnico de TI \nvalor do salário reajustado %.2f" ,novoSalario);
			
			break;
		
			
	}
	}
}
