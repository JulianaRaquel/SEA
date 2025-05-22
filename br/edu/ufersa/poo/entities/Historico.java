public class Historico {
    private String nomeDisciplina;
    private Notas notas;
    private Frequencia faltas;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Historico() {}

    public Historico(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


}
