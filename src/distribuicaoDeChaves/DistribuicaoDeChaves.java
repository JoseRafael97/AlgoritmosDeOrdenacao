package distribuicaoDeChaves;



import Interface.AlgoritmoOrdenacao;
/**
 * 
 * 
 *
 */
public class DistribuicaoDeChaves implements AlgoritmoOrdenacao{

	@Override
	public void ordenar( int[] v){
        
		int maior = v[0];
        int i;
        int exp = 1;
        int[] ordenaCasa = new int[v.length];
        
        for (i = 1; i < v.length; i++){
            if (v[i] > maior)
                maior = v[i];
        }
        
        while (maior / exp > 0){
        	int[] freq = new int[10];
        	int [] freqAcomulada = new int [10];
        	
        	for (i = 0; i < v.length; i++)
        		freq[(v[i] / exp) % 10]++; 
        	
        	for (i = 1; i < freq.length; i++)
            	freqAcomulada[i] = freqAcomulada[i-1] + freq[i-1];
        	
            for (i =0  ; i <v.length ; i++){
            	ordenaCasa[freqAcomulada[(v[i] / exp) % 10]] = v[i]; 
            	freqAcomulada[(v[i] / exp) % 10] +=1;
            }
            
            for (i = 0; i < v.length; i++)
            	v[i] = ordenaCasa[i];
           
            exp *= 10;
        }
        

    }    
  
}
