package br.ucsal.sort;

public class QuickSort {
	
	private String  nome = "Selection Sort";
	private  Integer numComparacao =0 ;
	private Integer numMovimento = 0;
	
	

	public String getNome() {
		return nome;
	}



	

	public Integer getNumComparacao() {
		return numComparacao;
	}




	public Integer getNumMovimento() {
		return numMovimento;
	}
		

	private int repart(Integer[] arr, int p, int r ) {
		int i,j,pivo;
		
		pivo = arr[p+r/2];
		
		i = p;
		j = r;
		this.numComparacao++;
		while(i<j) {
			do {
				j--;
			}while(arr[j]> pivo);
			
			do {
				i++;
			}while(arr[i]< pivo);
			
			if(i< j) {
				swap(arr,i,j);
			}
			
		}
		return j;
	
	}
	
	private  void swap(Integer[] arr, int i, int j) {
		this.numMovimento++;
		int aux = 0;
		aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
		
	}

	public  void sort(Integer[] arr,int p, int r) {
		
		int q;
		if(p<r) {
			q = repart(arr, p,r);
			sort(arr,0,q);
			sort(arr,q,r-1);
			
		}else {
		}
	}
	
	
}
