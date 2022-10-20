import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        System.out.println(multiplos(num));

        number.close();

    }

    static String multiplos(int valor){
        String A = "";
        String B = "";
        String C = String.valueOf(valor);
        if(valor % 3 == 0 || valor / 5 != 0){
            if (valor % 3 == 0) {
            A = "Fizz";
            }
            if(valor / 5 != 0) {
            B = "Buzz";
            }
        }else {
            return C;
        }
    
      return A + B;
    }
}