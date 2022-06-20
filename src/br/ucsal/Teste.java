package br.ucsal;

import java.util.Arrays;

public class Teste {
	private String nome;
	private String tipo;
	private Integer tamanho;
	private Integer[] arr;
	private Testable method;

	public Teste(String nome, String tipo, Integer[] arr, Testable Sort) {
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = arr.length;
		this.arr = arr;
		this.method = Sort;
	}


	public String getTempoExecucao() {
		long timeDelta = 0;


		long startTime = System.nanoTime();

		method.sort(arr);

		long endTime = System.nanoTime();


		timeDelta = (endTime - startTime);

		System.out.println("- número de movimento:" + method.getNumMovimento());
		System.out.println("- número de comparações:" + method.getNumComparacao());
		return "- terminou em: " + timeDelta + " nano segundos";

	}


	public void print() {
		if(tamanho==100000){
			System.out.println("nome: " + nome + " | tipo: " + tipo + " | tamanho: " + tamanho);
			System.out.println(getTempoExecucao());
		}else {
		System.out.println(Arrays.toString(arr));
			System.out.println("nome: " + nome + " | tipo: " + tipo + " | tamanho: " + tamanho);
			System.out.println(getTempoExecucao());
			System.out.println(Arrays.toString(arr));

		}

	}


}
