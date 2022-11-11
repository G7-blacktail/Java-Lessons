package  interfacesfuncionais.funcoesdealtaordem;

public class FuncaoAltaOrdem1 {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo subtracao = (a, b) -> a - b;
        Calculo multipicacao = (a, b) -> a * b;
        Calculo divisao = (a, b) -> a / b;
            System.out.println(executarOperacao(soma, 1, 3));
            System.out.println(executarOperacao(subtracao, 154, 200));
            System.out.println(executarOperacao(multipicacao, 2, 40));
            System.out.println(executarOperacao(divisao, 100 , 25));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a, b);
    }
}

@FunctionalInterface
interface Calculo {
    public int calcular(int a, int b);
}

// Por parametro recebe outra função
// Retorna outra função