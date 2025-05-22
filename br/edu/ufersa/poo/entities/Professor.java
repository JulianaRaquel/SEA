public class Professor {
    private static int matriculaProfessor = 0000;
    private String matricula;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private int qntTurmas;

    public void setMatricula(){
        ++matriculaProfessor;
        this.matricula = String.valueOf(matriculaProfessor);
    }

    public String getMatricula(){
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getQntTurmas() {
        return qntTurmas;
    }

    public void setQntTurmas(int qntTurmas) {
        this.qntTurmas = qntTurmas;
    }

    public Professor(String nome, String cpf, Endereco endereco) {
        setMatricula();
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }
}