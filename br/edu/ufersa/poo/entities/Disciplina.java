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

    public void exibirDisciplina() {
        System.out.println("Nome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
    }
}
