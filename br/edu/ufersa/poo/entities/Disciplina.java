import java.sql.SQLOutput;
import java.util.Scanner;

public class Disciplina {
    private static int idDisciplina = 0;
    private String nome;
    private String codigo;

    public Disciplina() {}

    public Disciplina(String nome) {
        setNome(nome);
        setCodigo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        ++idDisciplina;
        this.codigo = String.valueOf(idDisciplina);
    }

    public Disciplina criarDisciplina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Disciplina: ");
        String nome = sc.nextLine();
        System.out.println("Disciplina criada com sucesso!");
        return new Disciplina(nome);
    }

    public void exibirDisciplina() {
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
    }

    public static void buscarDisciplina(String nome) {
        System.out.println("Nome da Disciplina: " + nome);
    }

    public Disciplina delDisciplina() {
        setNome(null);
        this.codigo = null;
        System.out.printf("%nDisciplina deletada com sucesso!%n");
        return this;
    }
}
