import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;
    private String local;
    private boolean isAtiva;
    
    public Turma(){}
    
    public Turma(Disciplina disciplina, String horario, Professor professor, String local){
        this.disciplina = disciplina;
        this.horario = horario;
        this.alunos = new ArrayList<Aluno>();
        this.professor = professor;
        this.local = local;
        this.isAtiva = true;
    }

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

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean isAtiva) {
        this.isAtiva = isAtiva;
    }
    
    // método para lançar notas
    public void lancarNota(Aluno aluno, double nota) {
        if (alunos.contains(aluno)) {
            aluno.adicionarNota(this.disciplina.getNome(), nota);
            System.out.println("Nota lançada para " + aluno.nome + ": " + nota);
        }
    }
    
    // método para lançar frequência
    public void lancarFrequencia(Aluno aluno, int presencas) {
        if (alunos.contains(aluno)) {
            aluno.adicionarFrequencia(this.disciplina.getNome(), presencas);
            System.out.println("Frequência lançada para " + aluno.nome + ": " + presencas + " presenças.");
        }
    }
    
    // método para calcular média
    public double calculaMedia(Aluno aluno) {
        List<Double> notas = aluno.getNotas(this.disciplina.getNome());
        if (notas == null || notas.isEmpty()) return 0.0;

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }

}