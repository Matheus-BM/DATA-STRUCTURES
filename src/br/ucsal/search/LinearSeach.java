package br.ucsal.search;

import br.ucsal.sort.BubbleSort;

public class LinearSeach {
	
	
	public static <T extends Comparable> void buscaSeqDesorg(T[] arr, T value) {
		
		for (T i : arr) {
			if( value.equals(i) ) {
				System.out.println("Achou!");
				return;
			}
		}
		
		System.out.println("Não Achou!");
		

	}
	
	public static <T extends Comparable> void buscaSeqOrg(T[] arr, T value) {

		
		for (int i = 0; value.compareTo(arr[i]) >= 0; i++) {
			if( value.equals(arr[i]) ) {
				System.out.println("Achou!");
				return;
			}
			
		}
		
		System.out.println("Não Achou!");
			
	
	}
	
	
	
	

}
