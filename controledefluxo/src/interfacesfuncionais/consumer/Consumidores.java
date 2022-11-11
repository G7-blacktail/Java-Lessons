package interfacesfuncionais.consumer;

import java.util.function.Consumer;

public class Consumidores {
    
    public static void main(String[] args) {
        // Method Reference

            // - Apenas utiliza o paramentro de forma que ele foi recebido;

        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World!");
        imprimirUmaFrase2.accept("Guerreiro na batalha");
    }
}
