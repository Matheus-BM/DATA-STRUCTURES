package br.ucsal.vetor;

public class Ordenado {

	private Integer[] v;

	public Ordenado(int tamanho){
		v = new Integer[tamanho];
	}

	public Integer[] criar(){
		for (int i = 0; i < v.length; i++) {
			v[i] = i+1;
		}
		return v;
	}
}
