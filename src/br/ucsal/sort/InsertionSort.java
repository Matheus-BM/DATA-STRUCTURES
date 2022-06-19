package br.ucsal.sort;

import br.ucsal.Testable;

public class InsertionSort implements Testable {

	private  Integer numComparacao =0 ;
	private Integer numMovimento = 0;

	public Integer getNumComparacao() {
		return numComparacao;
	}


	public Integer getNumMovimento() {
		return numMovimento;
	}

	public String getNome() {
		return "Insertion Sort";
	}
	public <T extends Comparable<T>> void sort(T[] arr ) {
		
		for (int i = 0; i < arr.length; i++) {
			T temp = arr[i];
			int j = i-1;
			this.numComparacao++;
			while( j >=0 && temp.compareTo(arr[j]) < 0) {
				this.numMovimento++;
				arr[j+1] = arr[j];
				j --;
				
			}
			
			arr[j+1] = temp;
			
			
		}
		System.out.println("número de movimento:" + numMovimento);
		System.out.println("número de comparações:" + numComparacao);
		
	}

}
