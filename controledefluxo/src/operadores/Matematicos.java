package operadores;

public class Matematicos {
    public static void main(String[] args) {
        
        // atribuição (=)
        int valorInicial = 14;
            System.out.println(valorInicial);

        // aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20* 7;
        int divisao = 15/3;
        int modulo = 18 % 3;
        int resultado = (10 * 7 ) + ( 20 / 4);
        double resultado2 = (soma + subtracao) - ((multiplicacao * divisao) + modulo);
        System.out.println(resultado - resultado2);

        // a partir do momento que a depuração identifica uma String ele passa a concatenar e não consegue mais fazer operações matemáticas exceto na interação com evidência "()"

        


    }
}
