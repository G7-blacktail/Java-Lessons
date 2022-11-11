package interfacesfuncionais.fuctions;

import java.util.function.Function;

public class Funcoes {
    
    public static void main(String[] args) {
        
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto)
        .reverse()
        .toString();
        Function<String, Integer> converterParaNumeroInteiroDobro = string -> Integer.valueOf(string) * 2;

        Function<String, Integer> converterParaNumeroInteiro = Integer::valueOf;   // Com Method Reference "::"


            System.out.println(retornaNomeAoContrario.apply("reverso deste texto"));
            System.out.println(converterParaNumeroInteiro.apply("20")); // com Method reference "::" metodo de referencia
            System.out.println(converterParaNumeroInteiroDobro.apply("400"));
    }
}
