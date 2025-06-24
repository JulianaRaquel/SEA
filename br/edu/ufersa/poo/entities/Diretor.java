import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Diretor extends Usuario{
	private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();
	
    public Diretor() {
    	super();
    }
    
    public Diretor(String login, String senha, String nome, String endereco, String cpf, String email) {
    	super(login, senha, nome, endereco, cpf, email);
    }
    
    // cadastrar aluno
    public Aluno cadastrarAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%nCriando o cadastro do aluno!%n");
        System.out.println("Digite o nome do aluno: ");
        setNome(sc.nextLine());
        System.out.println("Digite as informações do endereco do aluno: ");
        Endereco endereco = new Endereco();
        endereco.criarEndereco();
        setEnderecoAluno(endereco);

        return this;
    }
    
    // editar aluno
    public Aluno editarAluno() {
        System.out.printf("%nInformações atuais: %n");
        exibirAluno();

        Scanner sc = new Scanner(System.in);
        int info;

        do {

            System.out.printf("%n%nQual informação deseja alterar? (Digite 0 para sair)%n");
            System.out.println("1) nome");
            System.out.println("2) endereco");
            System.out.println("Opção: ");

            info = sc.nextInt();
            sc.nextLine();

            switch (info) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.print("Informe o novo nome: ");
                    String novonome = sc.nextLine();
                    setNome(novonome);
                    break;
                case 2:
                    enderecoAluno.alterarEndereco();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        while (info != 0);

        System.out.println("Alterações salvas!");

        return this;
    }
    
    // deletar aluno
    public Aluno deletarAluno() {
        setNome(null);
        setEnderecoAluno(null);
        System.out.printf("%nAluno deletado com sucesso!%n");
        return this;
    }
    
    // buscar aluno por nome
    public Aluno buscarAluno(String nome) {
        for (Aluno a : alunos) {
            if (a.nome.equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }
    
    // buscar alunos por turma
    public List<Aluno> buscarAlunos(String nomeTurma) {
        for (Turma t : turmas) {
            if (t.getNome().equalsIgnoreCase(nomeTurma)) {
                return t.getAlunos();
            }
        }
        return new ArrayList<>();
    }
    
    // cadastrar professor
    public void cadastrarProfessor(Professor professor) {
        professores.add(professor);
    }
    
    // editar professor
    public void editarProfessor(String nome, Professor novo) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome().equalsIgnoreCase(nome)) {
                professores.set(i, novo);
                break;
            }
        }
    }
    
    // deletar professor
    public void deletarProfessor(String nome) {
        professores.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }
    
    // buscar professor por nome
    public Professor buscarProfessor(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
    
    // cadastrar disciplina
    public void cadastrarDisciplina(Disciplina d) {
        disciplinas.add(d);
    }
    
    // editar disciplina
    public void editarDisciplina(String nome, Disciplina nova) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getNome().equalsIgnoreCase(nome)) {
                disciplinas.set(i, nova);
                break;
            }
        }
    }
    
    // deletar disciplina
    public void deletarDisciplina(String nome) {
        disciplinas.removeIf(d -> d.getNome().equalsIgnoreCase(nome));
    }
    
    // método que busca disciplina por nome
    public Disciplina buscarDisciplina(String nome) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nome)) {
                return d;
            }
        }
        return null;
    }
    
    // cadastra turma
    public void cadastrarTurma(Turma turma) {
        turmas.add(turma);
    }
    
    // edita turma
    public void editarTurma(String nome, Turma nova) {
        for (int i = 0; i < turmas.size(); i++) {
            if (turmas.get(i).getNome().equalsIgnoreCase(nome)) {
                turmas.set(i, nova);
                break;
            }
        }
    }
    
    // deleta turma
    public void deletarTurma(String nome) {
        turmas.removeIf(t -> t.getNome().equalsIgnoreCase(nome));
    }
    
    // método que busca turma por professor
    public List<Turma> buscarTurmaPorProfessor(String nomeProfessor) {
        List<Turma> resultado = new ArrayList<>();
        for (Turma t : turmas) {
            if (t.getProfessor() != null && t.getProfessor().getNome().equalsIgnoreCase(nomeProfessor)) {
                resultado.add(t);
            }
        }
        return resultado;
    }
    
    // método que aloca turma a professor
    public void alocarTurmaParaProfessor(String nomeTurma, Professor professor) {
        for (Turma t : turmas) {
            if (t.getNome().equalsIgnoreCase(nomeTurma)) {
                t.setProfessor(professor);
                break;
            }
        }
    }
    
    // método que aloca aluno para turma
    public void alocarAlunoParaTurma(String nomeTurma, Aluno aluno) {
        for (Turma t : turmas) {
            if (t.getNome().equalsIgnoreCase(nomeTurma)) {
                t.adicionarAluno(aluno);
                break;
            }
        }
    }   
    
}
