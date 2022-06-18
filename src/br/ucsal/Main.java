package br.ucsal;




public class Main {

	public static void main(String[] args) {
		Integer[] arr3 =  {1,5,3,10,2,7,6,8,9,4,11};
		Integer[] arr2 =  {1,2,3,4,5,6,7,8,9,10,11};
		
		
		for (Integer integer : arr3) {
			System.out.print(integer + " ");
		}
		
		
		long startTime = System.nanoTime();
		//QuickSort.sort(arr3, 1, 11);
		long endTime = System.nanoTime();
		
		System.out.println("");

		for (Integer integer : arr3) {
			System.out.print(integer + " ");
		}
		
		

		System.out.println("- terminou em: " +(endTime -startTime )/1000 + " micro segundos");

	}

}
