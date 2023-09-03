package com.operadores;

public class Comparacao {
	public static void main(String[] args) {
		int num1 = 1, num2 =2;
		
		if(num1 < num2) {
			System.out.println("a nossa condicao é : "+true);
		}else {
			System.out.println("a nossa condicao é: "+false);
		}
		
		String teste = num1 == num2 ? "os número são iguas": "os numero sao diferente";
		
		System.out.println(teste);
		
	}
}
