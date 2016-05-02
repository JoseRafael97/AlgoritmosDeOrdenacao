package shellSort;


import Interface.AlgoritmoOrdenacao;

public class ShellSort implements AlgoritmoOrdenacao{
	
	@Override
	public void ordenar(int[] v) {
		int h = v.length / 2; // determina o tamanho de h inicial

		while (h > 0) {
			for (int i = h; i < v.length; i++) {
				int troca = v[i];
				int j = i;

				while (j >= h && v[j-h] > troca) {
					v[j] = v[j - h];
					j -= h;
				}
				v[j] = troca;
			}
			h /= 2; // divide o h por 2, quando chega-se ao final da sequencia
		}

	}



}
