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
		int mediaMovimento = 0;
		int mediaComparacao = 0;


		long startTime = System.nanoTime();

		method.sort(arr);

		long endTime = System.nanoTime();
		mediaMovimento += method.getNumMovimento();
		mediaComparacao += method.getNumComparacao();
		timeDelta += (endTime - startTime);

		System.out.println("- número de movimento:" + mediaMovimento);
		System.out.println("- número de comparações:" + mediaComparacao);
		return "- terminou em: " + timeDelta + " micro segundos";

	}


	public void print() {
		System.out.println(Arrays.toString(arr));
		System.out.println("nome: " + nome + " | tipo: " + tipo + " | tamanho: " + tamanho);
		System.out.println(getTempoExecucao());
		System.out.println(Arrays.toString(arr));

	}


}
