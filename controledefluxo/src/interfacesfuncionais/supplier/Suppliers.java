package interfacesfuncionais.supplier;

import java.util.function.Supplier;

public class Suppliers {
    
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = () -> new Pessoa();

            System.out.println(suppliers.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Gustavo";
        idade = 27;
    }

    @Override
    public String toString(){
        return String.format("Nome : %s, idade %d ", nome, idade);
    }
}
