package collections.option;

import java.util.Optional;

public class ExampleOpitiomStates {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor opcinal que está presente");
        System.out.println(optionalString);
    //    optionalString.ifPresentOrElse(System.out::println, () -> System.out.prinln("Não está presente"));
    }
}
