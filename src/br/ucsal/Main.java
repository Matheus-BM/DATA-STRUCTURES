package br.ucsal;

import br.ucsal.sort.*;
import br.ucsal.vetor.Aleatorio;
import br.ucsal.vetor.InversamenteOrdenado;
import br.ucsal.vetor.Ordenado;
import br.ucsal.vetor.Ordenado90;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();



//		Integer[] ordenado90 = new Ordenado90(100).criar();
//		Integer[] ordenado = new Ordenado(100).criar();
//		Integer[] aleatorio = new Aleatorio(100).criar();
//		Integer[] invesamenteOrdenado = new InversamenteOrdenado(100).criar();


//		new Teste("Bubble Sort", "Ordenado90", ordenado90.clone(), new BubbleSort()).print();
//		new Teste("Bubble Sort", "Ordenado", ordenado, new BubbleSort()).print();
//		new Teste("Bubble Sort", "Aleatorio", aleatorio, new BubbleSort()).print();
//		new Teste("Bubble Sort", "InversamenteOrdenado", invesamenteOrdenado, new BubbleSort()).print();

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
		for (int i = 0, count = 1; i < v.length; i++, count++) {
			System.out.print(v[i] + " ");
			if(count == 60) {
				System.out.println();
				count = 1;
			}
		}

		System.out.println();
		System.out.println();
		System.out.println();
	}

	public static void menu() {
		Vetor vetorBase = null;
		do {
			vetorBase = menuTipoVetor();
			if(vetorBase != null) {
				vetorBase.criar();
				Testable metodo;

				do {
					metodo = menuSort();
					if(metodo!=null){
						Integer[] vetorDeTeste = vetorBase.getVetor().clone();
						new Teste(metodo.getNome(), vetorBase.getTipo(), vetorDeTeste,  metodo).print();
					}
				} while (metodo != null);
			}
		} while (vetorBase != null);
		while (true) {


		}

	}

	private static Testable menuSort() {
		Scanner sc = new Scanner(System.in);
		int opSort = 0;
		System.out.println("Escolha um tipo de vetor");
		System.out.println("1->BubbleSort");
		System.out.println("2->HeapSort");
		System.out.println("3->InsertionSort");
		System.out.println("4->MergeSort");
		System.out.println("5->QuickSort");
		System.out.println("6->SelectionSort");
		System.out.println("7->Voltar ao menu anterior");
		opSort = sc.nextInt();
		sc.nextLine();
		Testable sort;
		switch (opSort) {
			case 1 -> sort = new BubbleSort();
			case 2 -> sort = new HeapSort();
			case 3 -> sort = new InsertionSort();
			case 4 -> sort = new MergeSort();
			case 5 -> sort = new QuickSort();
			case 6 -> sort = new SelectionSort();
			default -> sort = null;
		}
		return sort;

	}

	public static Vetor menuTipoVetor() {
		Scanner sc = new Scanner(System.in);
		Vetor novoVetor;
		int opVetor = 0;
		System.out.println("Escolha um tipo de vetor");
		System.out.println("1->Ordenado");
		System.out.println("2->Aleatório");
		System.out.println("3->Inversamente ordenado");
		System.out.println("4->Ordenado 90%");
		System.out.println("5->Encerrar programa");
		opVetor = sc.nextInt();
		System.out.println("Inserir tamanho do vertor: ");
		int tamanhoVetor = sc.nextInt();
		switch (opVetor) {
			case 1 -> {
			  novoVetor= new Ordenado(tamanhoVetor);

			}
			case 2 -> {
				novoVetor = new Aleatorio(tamanhoVetor);

			}
			case 3 -> {
				novoVetor = new InversamenteOrdenado(tamanhoVetor);

			}
			case 4 -> {
				novoVetor = new Ordenado90(tamanhoVetor);

			}
			default -> novoVetor = null;
		}


		return novoVetor;


	}


}
