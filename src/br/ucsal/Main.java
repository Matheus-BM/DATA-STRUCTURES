package br.ucsal;

import br.ucsal.search.BinarySearch;
import br.ucsal.search.LinearSeach;
import br.ucsal.sort.BubbleSort;

public class Main {

	public static void main(String[] args) {
		Integer[] arr3 =  {1,5,3,10,2,7,6,8,9,4,11};
		Integer[] arr2 =  {1,2,3,4,5,6,7,8,9,10,11};
		
		
		
		long startTime = System.nanoTime();
		//String[] shorted = InsertionSort.sort(arr2);
		//SelectionSort.sort(arr2);
		BinarySearch.search(arr2, 6);
		long endTime = System.nanoTime();
		
		System.out.println("");
		

		System.out.println("- terminou em: " +(endTime -startTime )/1000 + " micro segundos");

	}

}
