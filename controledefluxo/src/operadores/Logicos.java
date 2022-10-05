package operadores;

public class Logicos {
    public static void main(String[] args) {
        

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) System.out.println("As duas condições são verdadeiras");
        else System.out.println("Uma condição é falsa");

        if(condicao1 || condicao2) System.out.println("Uma condição é verdadeira");
        if((condicao1 || condicao2)){
            if(condicao1 == true) System.out.println("A condição 1 é verdadeira");
            else if (condicao2 == true) System.out.println("A condição 2 é verdadeira");
        }
    }
}
