package br.ucsal.sort;

import br.ucsal.Testable;

public class BubbleSort implements Testable	 {
	
			private  Integer numComparacao =0 ;
			private Integer numMovimento = 0;
			


			public Integer getNumComparacao() {
				return numComparacao;
			}




			public Integer getNumMovimento() {
				return numMovimento;
			}





		public <T extends Comparable<T>> void sort(T[] arr ) {
			
				for (int p = 1; p <= arr.length; p++) {
					boolean teste = true;
		
					for (int i = 0; i < arr.length-p; i++) {
						this.numComparacao++;
						if(arr[i].compareTo(arr[i+1]) > 0) {
							this.numMovimento ++;
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
