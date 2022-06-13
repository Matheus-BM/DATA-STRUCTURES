package br.ucsal.sort;

public class BubbleSort {
	
public static  <T extends Comparable<T>> void sort(T[] arr ) {
	
		
		for (int p = 1; p <= arr.length; p++) {
			boolean teste = true;

			for (int i = 0; i < arr.length-p; i++) {
				if(arr[i].compareTo(arr[i+1]) > 0) {
					T aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
					teste = false;
					
				}
				
			}
			if (teste) break;
			
			
		}
		
	}

}
