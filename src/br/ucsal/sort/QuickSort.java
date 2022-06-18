package br.ucsal.sort;

import br.ucsal.Testable;

public class QuickSort implements Testable {

	private  Integer numComparacao =0 ;
	private Integer numMovimento = 0;


	@Override
	public <T extends Comparable<T>> void sort(T[] arr) {
		sort(arr,0, arr.length-1);
	}

	public Integer getNumComparacao() {
		return numComparacao;
	}




	public Integer getNumMovimento() {
		return numMovimento;
	}



	public <T extends Comparable>  int repart(T[] arr, int  p, int r ) {
		T pivo;
		int  i,j;

		pivo = arr[(p+r)/2];

		this.numComparacao++;
		i = p-1;
		j = r+1;

		while(i<j) {
			do {
				j--;
			}while(arr[j].compareTo( pivo)>0);
			
			do {
				i++;
			}while(arr[i].compareTo( pivo)<0);
			
			if(i< j) {
				swap(arr,i,j);
			}
			
		}
		return j;
	
	}
	

	private <T extends Comparable> void swap(T[] arr, int i, int j) {
		this.numMovimento++;
		T aux;
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		
	}



	public <T extends Comparable> void sort(T[] arr,int p, int r) {
		int q;
		if(p<r) {
			q = repart(arr, p,r);
			sort(arr,0,q);
			sort(arr,q+1,r);
			
		}
	}




	


}
