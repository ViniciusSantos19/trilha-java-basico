package com.exercicio;

public class BancoTerminal {
	public static void main(String[] args) {
		//parte 1
		double saldo = 25;
		double valorSolicitado = 18;
		
		if(saldo > valorSolicitado) {
			saldo -= valorSolicitado;
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(saldo);
		
		//parte 2
		
		saldo = 15;
		valorSolicitado = 22;
		
		if(saldo > valorSolicitado) {
			saldo -= valorSolicitado;
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(saldo);
		
		
	}
}
