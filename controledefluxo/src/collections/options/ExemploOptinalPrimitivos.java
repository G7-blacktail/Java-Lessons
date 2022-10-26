package collections.options;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptinalPrimitivos {
    
    public static void main(String[] args) {
        
        System.out.println("*** Valor Interio opcional ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("*** Valor Decimal Opcional ***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("*** Valor Longo Opcional ***");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
