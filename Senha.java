package curso05_06;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int senhaMestre, senhaTentativa;
	double n1, n2, soma;
	
	System.out.print("Cadastre uma senha (apenas números ): ");
	senhaMestre = ler.nextInt();
	
	System.out.println(" Digite um número: ");
	n1 = ler.nextDouble();
	System.out.println("Digite outro número: ");
	n2 = ler.nextDouble();
	
	soma= n1 + n2;
	
	System.out.println("Digite a sua senha para desbloquear a soma: ");
	senhaTentativa = ler.nextInt();
	
	if(senhaTentativa == senhaMestre) {
		System.out.println("A soma é: " + soma);
		
	}
		
	if (senhaTentativa != senhaMestre) {
		System.out.println("Erro! Senha errada!");
	ler.close();
	}
	
	
	

	}

}
