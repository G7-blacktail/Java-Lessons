
import java.util.Scanner;

public class CheckPalindromos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine();

        String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        boolean teste = palavra.equals(palavraInvertida);
        if(teste)System.out.println("TRUE");
        else System.out.println("FALSE");

        entrada.close();
    }
}
