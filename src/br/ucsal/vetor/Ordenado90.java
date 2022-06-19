package br.ucsal.vetor;

import br.ucsal.Vetor;

import java.util.Random;

public class Ordenado90 implements Vetor {
	private Integer[] v;
	private Double count;

	private int total;

	public Ordenado90(int tamanho){
		v = new Integer[tamanho];
		count = tamanho*.1;
	}
	public  void criar(){


		for (int i = 0; i < v.length; i++) {
			if(new Random().nextInt(10)==0&&count>=1){
				v[i] = new Random().nextInt(v.length+1,(v.length+v.length));
				count--;
			}else if(total<=v.length) v[i] = i+1;
			total++;
		}
		if(count>0) criar();
	}

	@Override
	public String getTipo() {
		return "Ordenado90";
	}

	@Override
	public Integer[] getVetor() {
		return v;
	}
}
