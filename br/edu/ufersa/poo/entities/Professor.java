public class Professor extends Usuario{
    private int matricula;
    private int qntTurmas;
    private List<String> turmas;
    
    public Professor() {
    	super();
    }
    
    public Professor(String login, String senha, String nome, String endereco, String cpf, String email) {
    	super(login, senha, nome, endereco, cpf, email);
    	this.matricula = matricula;
    	this.qntTurmas = qntTurmas;
    	this.turmas = new ArrayList<>();
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getQntTurmas() {
        return qntTurmas;
    }

    public void setQntTurmas(int qntTurmas) {
        this.qntTurmas = qntTurmas;
    }
    
    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }
    
    // metodo para que o professor veja suas turmas
    public verTurmas() {
    	// inserir implementação
    }
}