package br.ucsal;

import java.util.Arrays;

public class Teste {
	private String nome;
	private String tipo;
	private Integer tamanho;
	private Integer[] arr; 
	private Testable method;
	
	public Teste(String nome,String tipo, Integer[] arr , Testable Sort) {
		this.nome = nome;
		this.tipo = tipo;
		this.tamanho = arr.length;
		this.arr = arr;
		this.method = Sort;
	}
	
	public String getTempoExecucao() {
		long timeDelta = 0;
		int mediaMovimento = 0;
		int mediaComparacao= 0;
		
		for (int i = 0; i < 10; i++) {
			long startTime = System.nanoTime();
				
				method.sort(arr);
			
			long endTime = System.nanoTime();
			mediaMovimento +=method.getNumMovimento();
			mediaComparacao += method.getNumComparacao();
			timeDelta += (endTime -startTime );
		}
		
		timeDelta = timeDelta/10;
		mediaMovimento = mediaMovimento/10;
		mediaComparacao = mediaComparacao/10;
		
		System.out.println("- n�mero de movimento:" + mediaMovimento );
		System.out.println("- n�mero de compara��es:" + mediaComparacao );
		return "- terminou em: " +timeDelta/10 + " micro segundos";
		
	}

	
	public void print() {
		System.out.println(Arrays.toString(arr));
		System.out.println("nome: " + nome + " | tipo: " + tipo + " | tamanho: " + tamanho);
		System.out.println(getTempoExecucao());
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	

}