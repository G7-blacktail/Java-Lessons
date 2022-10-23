package string;

public class StringFormat {

    public static void main(String[] args) {
        
        String nome = "Gustavo";
        String sobreNome = "Fernandes";
        final String nomeCompleto = nome + " " + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente : " + nome);
        System.out.println("Nome completo do cliente : " + nomeCompleto);
        final String mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
        System.out.println(mensagem);

        System.out.println(String.format("Número %.2f ", 1.2375d));

    }
    
}
