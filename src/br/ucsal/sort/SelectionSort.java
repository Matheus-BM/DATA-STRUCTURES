package br.ucsal.sort;

import br.ucsal.Testable;

public class SelectionSort implements Testable {

	private  Long numComparacao = new Long(0);
	private Long numMovimento = new Long(0);


	public Long getNumComparacao() {
		return numComparacao;
	}




	public Long getNumMovimento() {
		return numMovimento;
	}

	public String getNome() {
		return "Selection Sort";
	}


	
	public <T extends Comparable<T>> void  sort(T[] arr ) {
	 
		
		
		for (int i = 0; i < arr.length-1; i++) {
			T temp = arr[i];
			T min = arr[i+1];
			int index = i+1;
			for (int j = i+1; j < arr.length; j++) {
				this.numComparacao++;
				if(arr[j].compareTo(min) < 0) {
					min = arr[j];
					index = j;
				}
				
			}
			this.numComparacao++;
			if( min.compareTo(temp) < 0) {
				this.numMovimento++;
				arr[i] = arr[index];
				arr[index] = temp;
			}
			
			
		}
//		System.out.println("número de movimento:" + numMovimento);
//		System.out.println("número de comparações:" + numComparacao);
		
	}

}
