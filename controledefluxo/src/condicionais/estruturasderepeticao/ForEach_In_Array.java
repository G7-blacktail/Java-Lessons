package condicionais.estruturasderepeticao;

public class ForEach_In_Array {
    public static void main(String[] args) {
        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
