package com.exercicio;

public class SmartTv {
	
	private int volume;
	private String []  canal = {"Globo", "Sbt", "Band", "Record"};
	private boolean ligada = true;
	private int canalAtual;
	
	public void aumentarVolume() {
		if(this.volume <= 100 && this.ligada) {
			this.volume++;
		}
	}
	
	public void abaixarVolume() {
		if(this.volume > 0 && this.ligada) {
			this.volume--;
		}
	}
	
	public void mudarCanal(int numeroCanal) {
		if((numeroCanal > this.canal.length - 1 || numeroCanal < 0) || this.ligada == false) {
			return;
		}
		this.canalAtual = numeroCanal;
	}
	
	public String getCanal() {
		return this.canal[canalAtual];
	}
	
	public void desligarLigar() {
		this.ligada = !this.ligada;
	}
	
	public void proximoCanal() {
		if((this.canalAtual < this.canal.length - 1) && this.ligada){
			this.canalAtual++;
		}
	}
	
	public void anteriorCanal() {
		if((this.canalAtual > 0) && this.ligada){
			this.canalAtual--;
		}
	}
	
	public boolean isLigada() {
		return this.ligada;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public int getCanalAtualInt() {
		return this.canalAtual;
	}
	
}
