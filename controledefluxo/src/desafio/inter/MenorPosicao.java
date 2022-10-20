package inter;

import java.util.Scanner;
import java.io.IOException;


public class MenorPosicao {
    
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int E = entrada.nextInt();
        int[] x = new int[E];
        int numero = 0;
        int pos = 0;
       
            for(int i = 0; i < E; i++){
                x[i] = entrada.nextInt();
                    if(i == 0){
                        numero = i;
                        pos = i;
                    }else if(x[i] < numero){
                        numero = x[i];
                        pos = i;
                    }
            }

        System.out.println("Menor valor: " + numero);
        System.out.println("Posição: " + pos);
          

        entrada.close();
        
      }
}
