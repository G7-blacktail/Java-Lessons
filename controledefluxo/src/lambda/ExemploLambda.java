package lambda;


public class ExemploLambda {
    public static void main(String[] args) {
        
    Funcao colocarPrefixoSenhorNaString = valor -> "Sr. " + valor;
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}

@FunctionalInterface
interface Funcao {
    String gerar(String valor);
}
