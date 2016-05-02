package radixSort;
import java.util.ArrayList;

import Interface.AlgoritmoOrdenacao;


public class RadixSort implements AlgoritmoOrdenacao {

	@Override
	public void ordenar(int[] v) {
		int maior = v[0];
	    int i;
	    int exp = 1;
	    int j = 0;
	        
	    for (i = 1; i < v.length; i++){
	    	if (v[i] > maior)
	        maior = v[i];
	    }
	        
	    while (maior / exp > 0){
			ArrayList[] balde = new ArrayList [10];

			for( i = 0 ; i<balde.length ; i++){
				ArrayList<Integer> xi = new ArrayList<Integer>(); 
				balde[i] = xi;
			}
			
			for (i = 0; i < v.length; i++)
				balde[(v[i] / exp) % 10].add(v[i]); 
			

			for (i = 0; i <balde.length; i++){
				while(!balde[i].isEmpty()){
					v[j] = (int) balde[i].get(0);
					balde[i].remove(0);
					j++;
				}

			}     	
			exp *= 10;
	        }
	  	}
	
	
	
	
	
	
}

