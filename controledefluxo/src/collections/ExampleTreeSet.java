package collections;

import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>(); // mantém a ordem dos nós
        
        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capital acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Forianópolis"));

        // Retorna exibe todas as capitais no console
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Exibe todas as capitais no console
        System.out.println(treeCapitais);
    }
    
}
