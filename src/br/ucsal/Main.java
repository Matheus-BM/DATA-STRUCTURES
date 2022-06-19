package br.ucsal;

import br.ucsal.sort.BubbleSort;
import br.ucsal.vetor.Aleatorio;
import br.ucsal.vetor.InversamenteOrdenado;
import br.ucsal.vetor.Ordenado;
import br.ucsal.vetor.Ordenado90;

public class Main {

	public static void main(String[] args) {



			Integer[] ordenado90 =new Ordenado90(100).criar();
			Integer[] ordenado =new Ordenado(100).criar();
			Integer[] aleatorio =new Aleatorio(100).criar();
			Integer[] invesamenteOrdenado =new InversamenteOrdenado(100).criar();


			new Teste("Bubble Sort", "Ordenado90", ordenado90.clone(), new BubbleSort()).print();
			printVetor(ordenado90);
			new Teste("Bubble Sort", "Ordenado", ordenado, new BubbleSort()).print();
			new Teste("Bubble Sort", "Aleatorio", aleatorio, new BubbleSort()).print();
			new Teste("Bubble Sort", "InversamenteOrdenado", invesamenteOrdenado, new BubbleSort()).print();

			/*
			new Teste("Heap Sort", "Ordenado90", ordenado90, new HeapSort()).print();
			new Teste("Heap Sort", "Ordenado", ordenado, new HeapSort()).print();
			new Teste("Heap Sort", "Aleatorio", aleatorio, new HeapSort()).print();
			new Teste("Heap Sort", "InversamenteOrdenado", invesamenteOrdenado, new HeapSort()).print();
			*/


//			new Teste("Insertion Sort", "Ordenado90", ordenado90, new InsertionSort()).print();
//			new Teste("Insertion Sort", "Ordenado", ordenado, new InsertionSort()).print();
//			new Teste("Insertion Sort", "Aleatorio", aleatorio, new InsertionSort()).print();
//			new Teste("Insertion Sort", "InversamenteOrdenado", invesamenteOrdenado, new InsertionSort()).print();

			//new Teste("Quick Sort", "Ordenado90", ordenado90, new QuickSort()).print();
			//new Teste("Quick Sort", "Ordenado", ordenado, new QuickSort()).print();
			//new Teste("Quick Sort", "Aleatorio", aleatorio, new QuickSort()).print();
			//new Teste("Quick Sort", "InversamenteOrdenado", invesamenteOrdenado,new QuickSort()).print();

//			new Teste("Selection Sort", "Ordenado90", ordenado90, new SelectionSort()).print();
//			new Teste("Selection Sort", "Ordenado", ordenado, new SelectionSort()).print();
//			new Teste("Selection Sort", "Aleatorio", aleatorio, new SelectionSort()).print();
//			new Teste("Selection Sort", "InversamenteOrdenado", invesamenteOrdenado,new SelectionSort()).print();

//			new Teste("Merge Sort", "Ordenado90", ordenado90, new MergeSort()).print();
//			new Teste("Merge Sort", "Ordenado", ordenado, new MergeSort()).print();
//			new Teste("Merge Sort", "Aleatorio", aleatorio, new MergeSort()).print();
//			new Teste("Merge Sort", "InversamenteOrdenado", invesamenteOrdenado,new MergeSort()).print();
//



	}

	private static void printVetor(Integer[] v) {
		for (int i = 0, count = 1; i< v.length ; i++, count++) {
			System.out.print(v[i] + " ");
			if(count==60){
				System.out.println();
				count=1;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
	}

}
