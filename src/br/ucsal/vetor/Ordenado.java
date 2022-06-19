package br.ucsal.vetor;

import br.ucsal.Vetor;

public class Ordenado implements Vetor {

	private Integer[] v;

	public Ordenado(int tamanho){
		v = new Integer[tamanho];
	}

	public void criar(){
		for (int i = 0; i < v.length; i++) {
			v[i] = i+1;
		}

	}

	@Override
	public String getTipo() {
		return "Ordenado";
	}

	@Override
	public Integer[] getVetor() {
		return v;
	}
}
