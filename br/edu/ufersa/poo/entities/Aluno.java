import java.util.Scanner;

class Aluno{
    private static int matricula = 20250000;
    private String nome;
    private String matriculaAluno;
    private Endereco enderecoAluno;
    //private String senha;
    private Historico[] historicoDisciplinas;

    public Aluno(String nome, String senha){
        setMatriculaAluno();
        setNome(nome);
    }

    public Aluno(){
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

//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }

    public Historico[] getHistoricoDisciplinas() {
        return historicoDisciplinas;
    }

    public void setHistoricoDisciplinas(Historico[] historicoDisciplinas) {
        this.historicoDisciplinas = historicoDisciplinas;
    }

    public void exibirAluno(){
        System.out.printf("%nMatricula: " + getMatriculaAluno());
        System.out.printf("%nNome: " + getNome());
        System.out.printf("%nEndereço: " + getEnderecoAluno());
    }

//    public Aluno criarAluno(){
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("%nDigite o nome do aluno: ");
//        setNome(sc.nextLine());
//        sc.close();
//        return this;
//    }

//    public Aluno editarAluno(Aluno aluno){
//        aluno.exibirAluno();
//    }
}