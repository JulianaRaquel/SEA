import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;
    private boolean isAtiva;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Turma(Disciplina disciplina, Professor professor){
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
        this.isAtiva = true;
    }

    public Turma(){}

}