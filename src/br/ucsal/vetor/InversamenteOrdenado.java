package br.ucsal.vetor;

public class InversamenteOrdenado {
	private Integer[] v;

	public InversamenteOrdenado(int tamanho){
		v = new Integer[tamanho];
	}

	public Integer[] criar(){
		for (int i = 0; i < v.length; i++) {
			v[i] = v.length-i;
		}
		return v;
	}
}
