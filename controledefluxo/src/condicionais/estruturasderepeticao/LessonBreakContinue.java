package condicionais.estruturasderepeticao;

public class LessonBreakContinue {
    public static void main(String[] args) {

    System.out.println("Utilizando o break");
        for(int numero = -10; numero <= 5; numero++){
            if(numero == 3) break;
            System.out.println(numero);
        }

     System.out.println("Agora com continue");

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3) continue;
            System.out.println(numero);
        }
    }
}
