package condicionais.ifs;

public class IF {
    
    public static void main(String[] args) {
        
        final boolean condicao = false;

        if(condicao){
            System.out.println("A condição é verdadeira");
        }else{
            System.out.println("A condição é falsa");
        }

        if(!condicao) System.out.println("Uma única linha...");

        final String ternario = condicao ? "é verdadeira":"é falsa";

        System.out.println(ternario);
    }
}
