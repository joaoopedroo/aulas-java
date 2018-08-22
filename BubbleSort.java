
package bubblesort;


public class BubbleSort {

    public static void main(String[] args) {
            int vetor[] = {15,222,6,778,74,23,17,7};
        int aux;
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];    
                    vetor[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" ");            
        }  
    }
}