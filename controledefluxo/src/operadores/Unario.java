package operadores;

public class Unario {
    public static void main(String[] args) {
       
        boolean conta1 = true;
        int cont = 0;

        do{
            if(conta1){
                cont++;
                if(cont == 10) conta1 = false;
            }
        }while(cont < 10 );

        --cont;
        cont++;

        System.out.println(cont);

        System.out.println(!conta1);
    }
}
