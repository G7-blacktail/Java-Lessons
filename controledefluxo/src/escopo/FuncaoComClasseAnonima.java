package escopo;

public class FuncaoComClasseAnonima {
    
    public static void main(String[] args) {
        System.out.println(fatorialRecursivo(5));
    }

    public static int fatorialRecursivo(int value) {
        if( value == 1) return value;
        else return value * fatorialRecursivo((value -1));
    }
}
