package escopo;

import java.util.HashMap;
import java.util.Map;

public class Memorization {
    
   static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

   public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        long F = System.nanoTime();
        System.out.println("FATORIAL 1 " + (F - I ));

        I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        F = System.nanoTime();
        System.out.println("FATORIAL 2 " + (F - I));
   }

   public static Integer fatorialComMemorization( Integer value ){
        if(value == 1) return value;
        else{
            if(MAPA_FATORIAL.containsKey(value)) return MAPA_FATORIAL.get(value);
            else{
                Integer resultado = value * fatorialComMemorization(value - 1);
                return resultado;
            }
        }
   }
} 
