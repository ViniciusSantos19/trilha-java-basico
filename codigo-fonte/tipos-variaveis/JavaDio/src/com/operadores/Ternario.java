package com.operadores;

public class Ternario {
	public static void main(String[] args) {
		//sem ternario
		String resultado;
		int num1 =1, num2 =2;
		if(num1 > num2) {
			resultado = "verdadeiro";
		}else {
			resultado = "falso";
		}
		System.out.println(resultado);
		//com operador ternario
		resultado = num2 > num1 ?"verdadeiro" : "falso";
		System.out.println(resultado);
		
	}
}
