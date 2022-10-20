package collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer> SequenciaNumerica = new LinkedHashSet<>(); // o LinkedHashSet mantem a ordem de inserção

        // Adicionando os números no set
        SequenciaNumerica.add(16);
        SequenciaNumerica.add(2);
        SequenciaNumerica.add(8);
        SequenciaNumerica.add(4);
        SequenciaNumerica.add(1);

        System.out.println(SequenciaNumerica);

        // Remove o número do set
        SequenciaNumerica.remove(4);

        System.out.println(SequenciaNumerica);

        // Retorna a quantidade de itens do set
        System.out.println(SequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = SequenciaNumerica.iterator();

            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

            for(int numero : SequenciaNumerica) System.out.println(numero);

        // retorna se o set está vazio ou não
        System.out.println(SequenciaNumerica.isEmpty());

        SequenciaNumerica.clear();
            if(SequenciaNumerica.isEmpty()) System.out.println("Está lista está vazia");
            else System.out.println("Está lista não está vazia");

    }
    
}
