package interfacesfuncionais.predicados;

import java.util.function.Predicate;

public class Predicados {
    
    public static void main(String[] args) {
        
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazioM = String::isEmpty;
            System.out.println(estaVazio.test(""));
            System.out.println(estaVazio.test("Com uma String"));
            System.out.println(estaVazioM.test("Method Reference"));
    }
}
