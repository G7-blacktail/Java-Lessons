package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExampleSet {
    
    public static void main(String[] args) {
        
        Set<Double> notasAlunos = new HashSet<>();

        // Adicionar as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(4.0);
        notasAlunos.add(3.8);

        System.out.println(notasAlunos);

        // remove a nota do set
        notasAlunos.remove(5.8);
        System.out.println(notasAlunos);

        // retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // Navetga em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();
            while(iterator.hasNext()){
                System.out.println("Usando While --> " + iterator.next());
            }

            for(double nota : notasAlunos){
                System.out.println("Usando For Each ===> " + nota);
            }

        /*  boolean teste = notasAlunos.removeIf(null);
         *   System.out.println(teste);
         */

         notasAlunos.clear();
         System.out.println(notasAlunos.isEmpty());
    }
}
