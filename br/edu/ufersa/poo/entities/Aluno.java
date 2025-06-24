import java.util.Scanner;

public class Aluno extends Usuario{
    private int matricula;
    private List<String> historicoEscolar;
    
    private Map<String, List<Double>> notasPorTurma;
    private Map<String, Integer> frequenciaPorTurma;
    
    // construtor vazio
    public Aluno() {
        super();
    }
    
    public Aluno(String login, String senha, String nome, String endereco, String cpf, String email, String matricula) {
    	super(login, senha, nome, endereco, cpf, email);
    	this.matricula = matricula;
    	this.historicoEscolar = new ArrayList<>();
    	this.notasPorTurma = new HashMap<>();
        this.frequenciaPorTurma = new HashMap<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<String> getHistoricoEscolar() {
        return historicoEscolar;
    }

    public void setHistoricoEscolar(List<String> historicoEscolar) {
        this.historicoEscolar = historicoEscolar;
    }
    
    public void verTurmas() {
    	// inserir implementação
    }
    
    public void verNotas() {
    	// inserir implementação
    }

    public void verFrequencia() {
    	// inserir implementação
    }
    
    public void mostrarDisciplinasConcluida() {
    	// inserir implementação
    }
    
    public void exibirAluno() {
        System.out.printf("%nMatricula: " + getMatriculaAluno());
        System.out.printf("%nNome: " + getNome());
        enderecoAluno.exibirEndereco();
    }
    
    public void adicionarNota(String nomeTurma, double nota) {
        notasPorTurma.putIfAbsent(nomeTurma, new ArrayList<>());
        notasPorTurma.get(nomeTurma).add(nota);
    }

    public List<Double> getNotas(String nomeTurma) {
        return notasPorTurma.getOrDefault(nomeTurma, new ArrayList<>());
    }

    public void adicionarFrequencia(String nomeTurma, int presencas) {
        int total = frequenciaPorTurma.getOrDefault(nomeTurma, 0);
        frequenciaPorTurma.put(nomeTurma, total + presencas);
    }

    public int getFrequencia(String nomeTurma) {
        return frequenciaPorTurma.getOrDefault(nomeTurma, 0);
    }

}



