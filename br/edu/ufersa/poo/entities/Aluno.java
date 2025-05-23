import java.util.Scanner;

public class Aluno {
    private static int matricula = 20250000;
    private String nome;
    private String matriculaAluno;
    private Endereco enderecoAluno;
    private Historico[] historicoDisciplinas;

    public Aluno(String nome, Endereco endereco) {
        setMatriculaAluno();
        setNome(nome);
        setEnderecoAluno(endereco);
    }

    public Aluno() {
        setMatriculaAluno();
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno() {
        ++matricula;
        this.matriculaAluno = String.valueOf(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(Endereco enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public Historico[] getHistoricoDisciplinas() {
        return historicoDisciplinas;
    }

    public void setHistoricoDisciplinas(Historico[] historicoDisciplinas) {
        this.historicoDisciplinas = historicoDisciplinas;
    }

    public void exibirAluno() {
        System.out.printf("%nMatricula: " + getMatriculaAluno());
        System.out.printf("%nNome: " + getNome());
        enderecoAluno.exibirEndereco();
    }

    public Aluno alterarAluno() {
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

    public Aluno delAluno() {
        setNome(null);
        setEnderecoAluno(null);
        System.out.printf("%nAluno deletado com sucesso!%n");
        return this;
    }

    public Aluno criarAluno() {
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

}



