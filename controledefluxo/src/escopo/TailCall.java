package escopo;

public class TailCall {
    
    public static void main(String[] args) {
        System.out.println(fatorialA(8));
    }

    public static double fatorialA( double valor) {
        return fatorialComTailCall(valor, 1);
    }

    public static double fatorialComTailCall(double valor, double numero) {
        if( valor == 0) return numero;
        
        return fatorialComTailCall(valor - 1, numero * valor );
    }
}
