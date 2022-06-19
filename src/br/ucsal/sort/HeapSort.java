package br.ucsal.sort;

import br.ucsal.Testable;

public class HeapSort implements Testable {
	
	private  Integer numComparacao =0 ;
	private Integer numMovimento = 0;
	


	public Integer getNumComparacao() {
		return numComparacao;
	}


	public Integer getNumMovimento() {
		return numMovimento;
	}


	public <T extends Comparable<T>> void sort(T[] pq) {
		int n = pq.length;

		// heapify phase
		for (int k = n/2; k >= 1; k--)
			sink(pq, k, n);

		// sortdown phase
		int k = n;
		while (k > 1) {
			exch(pq, 1, k--);
			sink(pq, 1, k);
		}
//		System.out.println("número de movimento:" + numMovimento);
//		System.out.println("número de comparações:" + numComparacao);
	}


	private  void sink(Comparable[] pq, int k, int n) {
		while (2*k <= n) {
			int j = 2*k;
			if (j < n && less(pq, j, j+1)) j++;
			if (!less(pq, k, j)) break;
			exch(pq, k, j);
			k = j;
		}
	} private boolean less(Comparable[] pq, int i, int j) {
		this.numComparacao++;
		return pq[i-1].compareTo(pq[j-1]) < 0;
	}

	private  void exch(Object[] pq, int i, int j) {
		this.numMovimento++;
		Object swap = pq[i-1];
		pq[i-1] = pq[j-1];
		pq[j-1] = swap;
	}



}
