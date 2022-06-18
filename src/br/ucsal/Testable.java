package br.ucsal;

public interface Testable {
	
	public <T extends Comparable<T> > void sort(T[] arr);
	public Integer getNumComparacao();
	public Integer getNumMovimento();

}
