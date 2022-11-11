package interfacesfuncionais.Interacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

    public static void main(String[] args) {
        String[] nomes = {"Gustavo", "karoline", "Helena"};
        Integer[] numeros = {27, 23, 4};
        imprimirNomesFiltrados(nomes);
        imprimirTodosNomes(nomes);
        imprimirDobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
        .filter(profissao -> profissao.startsWith("Gerente"))
        .forEach(System.out::println);

    }
    


    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
            for(int i = 0; i < nomes.length; i++){
                if(nomes[i].equals("Helena")){
                    nomesParaImprimir += " " + nomes[i];
                }
            }   

            
            System.out.println("Nome do for " + nomesParaImprimir);
            
            String nomesParaImprimirDoStream = Stream.of(nomes).filter(nome -> nome.equals("Helena"))
            .collect(Collectors.joining());
            ;
            System.out.println("Nome da Stream " + nomesParaImprimirDoStream );
        
    }

    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes) System.out.println("Pelo For ->" + nome + " ");

        Stream.of(nomes)
       // .forEach(System.out::println);
       .forEach(nome -> System.out.println("Pelo Stream -> " + nome));
    }

    public static void imprimirDobroDeCadaItemDaLista(Integer... numeros){
        for(Integer numero : numeros) System.out.println((numero * 2)+ " ");

        Stream.of(numeros)
        .map(numero -> numero * 3)
        .forEach(System.out::println);
    }


}