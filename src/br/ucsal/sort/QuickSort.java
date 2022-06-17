package br.ucsal.sort;

public class QuickSort {

	public static int repart(Integer[] arr, int p, int r ) {
		int i,j,pivo;
		
		pivo = arr[p+r/2];
		
		i = p;
		j = r;
		
		while(i<j) {
			do {
				j--;
			}while(arr[j]> pivo);
			
			do {
				i++;
			}while(arr[i]< pivo);
			
			if(i< j) {
				swap(arr,i,j);
			}
			
		}
		return j;
	
	}
	
	private static void swap(Integer[] arr, int i, int j) {
		int aux = 0;
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		
	}

	public static void sort(Integer[] arr,int p, int r) {
		int q;
		if(p<r) {
			q = repart(arr, p,r);
			sort(arr,0,q);
			sort(arr,q,r-1);
			
		}
	}
	
	
}
