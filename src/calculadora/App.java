package Calculadora;

import java.util.Scanner;

public class App {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * Instancicao
		 */
		Calculadora calc = new Calculadora();
		
		Calculadora calc2 = new Calculadora();
		
		System.out.println("Digite um número:" );
		calc.x = sc.nextInt();
		 System.out.println("Digite outro numéro:");
		 calc.y= sc.nextInt();
		 
		 /**
		  * entrada de dados calc 2
		  */
		 System.out.println("Digite o valor de x para calc2:");
		 calc2.x = sc.nextInt();
		 System.out.println("Digite o valor de y para calc2");
		 calc2.y = sc.nextInt();
		 
		 
			calc.soma();
			int somaApp = calc.soma(40,50);
			System.out.println("[Método main]soma ="+somaApp);
			calc.subtracao();
			calc.divisao();
			calc.multiplicar();
			calc.somar();
			
			System.out.print("");
			System.out.println("===========Calc2=========");
			calc2.subtracao();
			calc2.divisao();
			calc2.multiplicar();
			calc2.somar();
		}
}
