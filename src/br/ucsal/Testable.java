package br.ucsal;

public interface Testable {
	
	public <T extends Comparable<T> > void sort(T[] arr);
	public Long getNumComparacao();
	public Long getNumMovimento();

	String getNome();

}
