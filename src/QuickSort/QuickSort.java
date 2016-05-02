package QuickSort;


import Interface.AlgoritmoOrdenacao;

public class QuickSort implements AlgoritmoOrdenacao {

	public void ordenar(int[] v) {
		ordenaSubSequencia(v, 0, v.length - 1);
	}

	// funcao que responsavel por ordenar as subSequencia separadas pelo pivo
	// usando recursao
	private static void ordenaSubSequencia(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			particionaSequencia(vetor, inicio, fim);
			ordenaSubSequencia(vetor, inicio + 1, fim); 
			ordenaSubSequencia(vetor, inicio, fim - 1);
		}
	}

	private static void particionaSequencia(int[] v, int inicio, int fim) {
		int pivo = v[inicio]; // define a posicao do pivô
		int i = inicio;
			while (i <= fim) { // faz a interação dos elementos menores e maiores que o pivô
				if (pivo >= v[i])
					i++;
				else if (pivo <= v[fim])
					fim--;
				else {
					int troca = v[i]; // realiza troca do elemento menor p/ lado esquerdo do vetor
					v[i] = v[fim];
					v[fim] = troca;
					i++;
					fim--;
				}
			}
		v[inicio] = v[fim]; // realiza troca do elemento maior p/ lado direito da sequencia
		v[fim] = pivo;
		return;
	}

}
