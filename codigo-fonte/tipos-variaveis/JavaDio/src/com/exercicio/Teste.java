package com.exercicio;

public class Teste {
	public static void main(String[] args) {
		SmartTv smart = new SmartTv();
		//smart.desligarLigar();
		
		smart.aumentarVolume();
		
		System.out.println(smart.getVolume());
		
		System.out.println(smart.getCanal());
		
		smart.mudarCanal(2);
		
		System.out.println(smart.getCanal());
		
		smart.proximoCanal();
		
		System.out.println(smart.getCanal());
				
		smart.mudarCanal(0);
		
		smart.anteriorCanal();
		
		System.out.println(smart.getCanalAtualInt());
		
		System.out.println(smart.getCanal());
		
	}
}
