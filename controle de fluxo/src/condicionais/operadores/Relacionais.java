package condicionais.operadores;

public class Relacionais {
    
    public static void main(String[] args) {
        
        final var numero = 4;
        int numero2 = 50;
        double numero3 = 3.5;
        float sameNumber = numero;
        int greatNumber = 4;
        double lowerNumber = numero2;

        boolean maiorQue = numero > numero2;
        boolean menorQue = numero < numero3;
        boolean igualA = numero == sameNumber;
        boolean diferenteDe = numero != numero2;
        boolean igualMaior = numero >= greatNumber;
        boolean igualMenor = numero <= lowerNumber;

        System.out.println(" Este é o maior que :" + maiorQue);
        System.out.println(" Este é o menor que :" + menorQue);
        System.out.println("Este é o igual A :" + igualA);
        System.out.println("Este é diferente de :" + diferenteDe);
        System.out.println("Este é o igual ou maior que :" + igualMaior);
        System.out.println("Este é o menor ou igual que :" + igualMenor);
    }
}
