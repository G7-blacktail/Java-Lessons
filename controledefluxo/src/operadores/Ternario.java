package operadores;


public class Ternario {
    public static void main(String[] args) {
     int a, b;

     a = 5;
     b = 10;
     String resultado;

     if( a != b) resultado = "Verdadeiro";
     else resultado = "Falso";

     System.out.println(resultado);

        // usando o ternario
    
    String  resultadoTernario = a == b ? "Verdadeiro" : "Falso";

    System.out.println(resultadoTernario);
    }
}
