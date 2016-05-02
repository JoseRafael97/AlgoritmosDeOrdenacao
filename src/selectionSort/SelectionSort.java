package selectionSort;

import Interface.AlgoritmoOrdenacao;

public class SelectionSort implements AlgoritmoOrdenacao {

	/**
	 * Esta classe implementa o algoritmo de seleзгo Selection Sort
	 * 
	 */
	@Override
	public void ordenar(int[] v) {

		for (int i = 0; i < v.length; i++) {
			int menor = i;

			for (int j = i + 1; j < v.length; j++) { // verifica se o proximo elemento da sequencia É menor do que 
													// a variaveis menor
				if (v[j] < v[menor]) {
					menor = j;
				}
			}
			if (menor != i) {  // se a posicaзгo de i for diferente da posicгo menor realiza a troca
				int aux = v[i];
				v[i] = v[menor];
				v[menor] = aux;
			}
		}
	}
}
