import java.util.Scanner;

public class Endereco{
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int numCasa;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public Endereco(){}

    public Endereco(String cep, String rua, String bairro, String cidade, String estado, int numCasa) {
        setCep(cep);
        setRua(rua);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setNumCasa(numCasa);
    }

    public void exibirEndereco(){
        System.out.printf("%nEndereço");
        System.out.printf("%nCep: " + getCep());
        System.out.printf("%nRua: " + getRua() + " Nº " + getNumCasa() + "\tBairro: " + getBairro());
        System.out.printf("%nCidade: " + getCidade() + "\tEstado: " + getEstado());
    }

    public Endereco alterarEndereco(){
        System.out.printf("%nEndereço atual: %n");
        exibirEndereco();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {

            System.out.printf("%n%nQual informação deseja alterar? (Digite 0 para sair)%n");
            System.out.println("1) cep");
            System.out.println("2) rua");
            System.out.println("3) bairro");
            System.out.println("4) cidade");
            System.out.println("5) estado");
            System.out.println("6) numCasa");
            System.out.println("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 0:
                    System.out.println("");
                break;
                case 1:
                    System.out.print("Informe o cep: ");
                    String novocep = sc.nextLine();
                    setCep(novocep);
                break;
                case 2:
                    System.out.print("Informe a rua: ");
                    String novarua = sc.nextLine();
                    setRua(novarua);
                break;
                case 3:
                    System.out.print("Informe o bairro: ");
                    String novobairro = sc.nextLine();
                    setBairro(novobairro);
                break;
                case 4:
                    System.out.print("Informe a cidade: ");
                    String novacidade = sc.nextLine();
                    setCidade(novacidade);
                break;
                case 5:
                    System.out.print("Informe o estado: ");
                    String novoestado = sc.nextLine();
                    setEstado(novoestado);
                break;
                case 6:
                    System.out.print("Informe o número da casa: ");
                    int novonum = sc.nextInt();
                    setNumCasa(novonum);
                break;
                default:
                    System.out.println("Opção inválida!");
                    break;
                }

            } while (opcao != 0);

        System.out.println("Alterações salvas!");

        return this;
    }

}