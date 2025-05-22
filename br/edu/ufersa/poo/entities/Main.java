import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("12319412", "teste", "ufersa", "mossoro", "rn", 3);
        Aluno aluno = new Aluno("Pedro", endereco);

        aluno.exibirAluno();

        aluno.delAluno();

        aluno.exibirAluno();
    }
}
