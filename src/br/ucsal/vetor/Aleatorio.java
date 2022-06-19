package br.ucsal.vetor;

import br.ucsal.Vetor;

import java.util.Random;

public class Aleatorio implements Vetor {
	private Integer[]  v;
	public Aleatorio(int tamanho){
		v = new Integer[tamanho];
	}
	public  void criar(){


		for (int i = 0; i < v.length; i++) {
			Random r = new Random();
			v[i] = r.nextInt();
		}

	}

	@Override
	public String getTipo() {
		return "Aleatório";
	}
	@Override
	public Integer[] getVetor() {
		return v;
	}

}
