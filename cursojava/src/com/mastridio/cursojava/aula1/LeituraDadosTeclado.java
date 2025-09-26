package com.mastridio.cursojava.aula1;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		System.out.println("----------------------------------------------");
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.nextLine();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		System.out.println("----------------------------------------------");
		
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		System.out.println("----------------------------------------------");
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		System.out.println("----------------------------------------------");*/
		
		System.out.println("Digite seu primeiro nome:\nIdade:\nAltura:\nFilhos:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura = scan.nextDouble();
		boolean filhos = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes dados!");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idaade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Filhos:" + filhos);
		

	}

}
