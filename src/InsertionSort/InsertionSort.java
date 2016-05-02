package InsertionSort;


import java.util.Arrays;

import Interface.AlgoritmoOrdenacao;

public class InsertionSort implements AlgoritmoOrdenacao{
	/**
	 * 
	 */

	@Override
	public void ordenar(int[] v) {
		int chave;
		for (int i = 1; i < v.length; i++) {
			chave = v[i];
			int j;
			for (j = i - 1 ; j>=0 && v[j]>chave ; j--){
				v[j+1] = v[j];
			}
			v[j+1]=chave;
		}
		
		System.out.println(Arrays.toString(v));
	}
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		
		int[] v = {1,34,21,3,6,7,2,0};
		
		is.ordenar(v);
	}
	
}
