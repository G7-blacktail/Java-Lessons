package condicionais.estruturasderepeticao;

public class ForInArrays {
    public static void main(String[] args) {
        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x<alunos.length; x++){
            System.out.println("O Aluno no indice x = " + x + " é " + alunos[x]);
        }

    }
}
