package paradigmasjava;

import java.util.function.Function;

public class FimAula1 {
    
    public static void main(String[] args) {
        Function<Integer, Object> buscarUsuario = idUsuario -> new Object();
        System.out.println(buscarUsuario);
    }

    // public static Object buscarUsuario(int idUsuario){
    //     // retornar usuário :
    //     return new Object();
    // }
}
