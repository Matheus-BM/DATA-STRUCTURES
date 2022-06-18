package br.ucsal.sort;

public class MergeSort {

	private  <T extends Comparable<T>> void   merge(T[] arr, int i, int f) {

		if(f>i){
			int meio = (f+i)/2;
			merge(arr,i, meio);
			merge(arr,meio+1,f);
			inserir(arr, i,meio,f);
		}
	}

	private  <T extends Comparable<T>>  void  inserir(T[] arr, int inicio, int m, int f) {
		int tam1 = m-inicio+1;
		int tam2 = f-m;

		T[] arrAux = arr.clone();


		int i = 0, j = 0, k = inicio;
		for (;(i < tam1&&j < tam2);	k++) {

			if( arrAux[inicio + i].compareTo(arrAux[m + 1 + j])<0) {
				arr[k] = arrAux[inicio + i];
				i++;
			}
			else {
				arr[k] = arrAux[m + 1 + j];
				j++;
			}



		}
		while (i < tam1) {
			arr[k] =arrAux[inicio + i];
			i++;
			k++;
		}

		while (j < tam2) {
			arr[k] = arrAux[m + 1 + j];
			j++;
			k++;
		}

	}
	public<T extends Comparable> void  sort(T[] arr){
		 merge(arr, 0, arr.length-1);
	}

}
