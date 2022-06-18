package br.ucsal.sort;

public class InsertionSort {

	private String  nome = "Insertion Sort";
	private  Integer numComparacao =0 ;
	private Integer numMovimento = 0;
	
	

	public String getNome() {
		return nome;
	}



	

	public Integer getNumComparacao() {
		return numComparacao;
	}




	public Integer getNumMovimento() {
		return numMovimento;
	}

	public <T extends Comparable<T>> T[] sort(T[] arr ) {
		
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
		
		return arr;
	}

}
