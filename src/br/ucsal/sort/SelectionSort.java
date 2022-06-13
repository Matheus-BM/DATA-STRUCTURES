package br.ucsal.sort;

public class SelectionSort {
	
public static  <T extends Comparable<T>> void sort(T[] arr ) {
		
		for (int i = 0; i < arr.length-1; i++) {
			T temp = arr[i];
			T min = arr[i+1];
			int index = i+1;
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[j].compareTo(min) < 0) {
					min = arr[j];
					index = j;
				}
				
			}
			
			if( min.compareTo(temp) < 0) {
				arr[i] = arr[index];
				arr[index] = temp;
			}
			
			
		}
		
	}

}
