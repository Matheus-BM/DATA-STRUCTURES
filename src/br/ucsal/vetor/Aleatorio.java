package br.ucsal.vetor;

import java.util.Random;

public class Aleatorio {
	private Integer[]  v;
	public Aleatorio(int tamanho){
		v = new Integer[tamanho];
	}
	public  Integer[] criar(){


		for (int i = 0; i < v.length; i++) {
			Random r = new Random();
			v[i] = r.nextInt();
		}
		return v;
	}

}
