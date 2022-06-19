package br.ucsal.vetor;

import br.ucsal.Vetor;

public class InversamenteOrdenado implements Vetor {
	private Integer[] v;

	public InversamenteOrdenado(int tamanho){
		v = new Integer[tamanho];
	}

	public void criar(){
		for (int i = 0; i < v.length; i++) {
			v[i] = v.length-i;
		}

	}

	@Override
	public String getTipo() {
		return "Inversamente ordenado";
	}
	@Override
	public Integer[] getVetor() {
		return v;
	}
}
