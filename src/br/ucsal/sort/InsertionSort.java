package br.ucsal.sort;

public class InsertionSort {
	
	public static <T extends Comparable<T>> T[] sort(T[] arr ) {
		
		for (int i = 0; i < arr.length; i++) {
			T temp = arr[i];
			int j = i-1;
			
			while( j >=0 && temp.compareTo(arr[j]) < 0) {
				
				arr[j+1] = arr[j];
				j --;
			
			}
			
			arr[j+1] = temp;
			
			
		}
		
		return arr;
	}

}
