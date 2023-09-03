package com.vinicius;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		System.out.println("Digite o numero da conta do cliente");
		numero = terminal.nextInt();
		System.out.println("Digite a agência do cliente");
		agencia = terminal.next();
		System.out.println("Digite o nome do cliente");
		nomeCliente = terminal.next();
		System.out.println("Digite o saldo do cliente");
		saldo = terminal.nextDouble();

		System.out.println(
				"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é [" + agencia + "]"
						+ ", conta [" + numero + "] e seu saldo [" + saldo + "]" + " já está disponível para saque");
		terminal.close();
	}
}
