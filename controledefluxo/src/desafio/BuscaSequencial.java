

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);
         int busca = entrada.nextInt();
         int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int localizado = procurar(busca, elementos);
        if(localizado > -1) System.out.println("Achei " + busca + " na posicao " + localizado);
        else System.out.println("Numero " + busca + " nao encontrado!");
        entrada.close();
    }

    static int procurar(int numero, int[] elem){
        int index = 0;
        for(int i = 0; i < elem.length; i++){
            if(numero == elem[i]) {
             index = i;
             break;
            }
            else index = -1;
        }
        
        return index;
    }
}
