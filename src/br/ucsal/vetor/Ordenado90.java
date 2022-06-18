package br.ucsal.vetor;

import java.util.Random;

public class Ordenado90 {
	private Integer[] v;
	private Double count;

	private int total;

	public Ordenado90(int tamanho){
		v = new Integer[tamanho];
		count = tamanho*.1;
	}
	public  Integer[] criar(){


		for (int i = 0; i < v.length; i++) {
			if(new Random().nextInt(10)==0&&count>=1){
				v[i] = new Random().nextInt(v.length+1,(v.length+v.length));
				count--;
			}else if(total<=v.length) v[i] = i+1;
			total++;
		}
		if(count>0) criar();
		return v;
	}
}
