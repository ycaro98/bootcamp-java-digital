package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextFloat();
		
		float soma = soma(a,b);
		float subtração = subtração(a,b);
		float divisão = divisão(a,b);
		float multiplicação = multiplicação(a,b);
		
		System.out.println("soma" + soma);
		System.out.println("sub" + subtração);
		System.out.println("div" + divisão);
		System.out.println("mult" + multiplicação);
		
	}

	public static float soma(float a, float b) {
		return a + b;
	}
	
	public static float subtração(float a, float b) {
		return a - b;
	}
	
	public static float divisão(float a, float b) {
		return a / b;
	}
		
	public static float multiplicação(float a, float b) {
		return a * b; 
	}
	
}


