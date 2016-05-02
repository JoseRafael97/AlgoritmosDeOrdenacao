package bubbleSort;


import Interface.AlgoritmoOrdenacao;

public class BubbleSort implements AlgoritmoOrdenacao {

	/**
	 * Nesta Classe foi implementado o algoritmo de troca Bubble Sort
	 * 
	 * @param
	 * @return
	 */
	@Override
	public void ordenar(int[] v) {

		for (int i = 0; i < v.length; i++) {
			for (int j = 1; j < v.length - 1; j++) {
				if (v[j] > v[j]) {
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}

	}
}
