package br.ucsal.search;

import br.ucsal.sort.BubbleSort;

public class BinarySearch {
	
	
	public static void search(Integer[] arr, int value) {
		
		
		int mid =   arr[arr.length/2];
		
		if(arr.length==1) {System.out.println("Não Achou!"); return;}
		else if (arr[arr.length/2] == value) { System.out.println("Achou!"); return;}
		
		if(mid > value) {
			
			search(slice(arr, 0, arr.length/2),value);
			
		}else {
			search(slice(arr, arr.length/2,arr.length),value);
		}
	}
	
	  public static Integer[] slice(Integer[] arr, int start, int end){
		  		Integer[] slice = new Integer[end - start];

				for (int i = 0; i < slice.length; i++) {
				slice[i] = arr[start + i];
				}


				return slice;
	  		}

	
	

}
