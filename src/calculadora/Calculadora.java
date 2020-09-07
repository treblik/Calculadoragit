package Calculadora;

import java.util.Scanner;

public class Calculadora {
	 int x,y;
	 int soma;
	 int multi;
	 int div;
	 int sub;
	

	
	public  void soma() {

		/**
		 * Declaração de variaveis
		 */

		
		/**
		 * Entrada de dados
		 */
	
		 /**
		  * Processamento
		  */
		  soma = x + y;
		 /**
		  * Saida de dados
		  */
		 System.out.println("A soma é:"  + soma);
		
	}
	
	public  int soma(int x,int y) {
		int soma = x + y;
		/**System.out.println("[método soma com parametros] soma ="+ soma);*/
		return soma;
	}
	
	public  void subtracao() {
		/**
		 * Declaração de variaveis
		 */
	
		
		 /**
		  * Processamento
		  */
		  sub = x - y;
		 /**
		  * Saida de dados
		  */
		 System.out.println("A subtração é:"  + sub);
		
	}
	
	public  void divisao() {
		/**
		 * Declaração de variaveis
		 */

		
		 div = x / y;
		 /**
		  * Saida de dados
		  */
		 System.out.println("A divisão é:"  + div);
	}
	 
	public  void somar() {
		String soma;
		String a;
		a="Meu nome é Killbert";
		String b;
		b = "O nome dela é Larissa";
		soma = a + b;
		System.out.println("Qual é o teu nome"+soma);
		
	}
	public  void multiplicar() {
		/**
		 * Declaração de variaveis
		 */

		
		 /**
		  * Processamento
		  */
		 multi = x * y;
		 /**
		  * Saida de dados
		  */
		 System.out.println("A multiplicaão é:"  + multi);
	}
}
