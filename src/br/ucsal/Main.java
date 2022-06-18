package br.ucsal;


import br.ucsal.vetor.Aleatorio;
import br.ucsal.vetor.InversamenteOrdenado;
import br.ucsal.vetor.Ordenado;
import br.ucsal.vetor.Ordenado90;


public class Main {

	public static void main(String[] args) {
		Integer[] arr3 =  {1,5,3,10,2,7,6,8,9,4,11};
		Integer[] arr2 =  {1,2,3,4,5,6,7,8,9,10,11};


		Integer[] v =new Ordenado90(100).criar();
		printVetor(v);


//		long startTime = System.nanoTime();
//		QuickSort.sort(arr3, 1, 11);
//		long endTime = System.nanoTime();
//
//		System.out.println("");
//
//		for (Integer integer : arr3) {
//			System.out.print(integer + " ");
//		}
//
		

//		System.out.println("- terminou em: " +(endTime -startTime )/1000 + " micro segundos");

	}

	private static void printVetor(Integer[] v) {
		for (int i = 0, count = 1; i< v.length ; i++, count++) {
			System.out.print(v[i] + " ");
			if(count==60){
				System.out.println();
				count=1;
			}
		}
	}

}
