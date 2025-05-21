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
        System.out.printf("%nRua: " + getRua() + "%tN " + getNumCasa() + "%tBairro: " + getBairro());
        System.out.printf("%nCidade: " + getCidade() + "%tEstado: " + getEstado());
    }

    public Endereco alterarEndereco(Endereco endereco){

        System.out.printf("%nEndereço atual: ");
        endereco.exibirEndereco();

        System.out.printf("%n%nQual informação deseja alterar? (Digite 0 para sair)");
        System.out.println("1) cep");
        System.out.println("2) rua");
        System.out.println("3) bairro");
        System.out.println("4) cidade");
        System.out.println("5) estado");
        System.out.println("6) numCasa");
        System.out.println("Opção: ");
        Scanner sc = new Scanner(System.in); int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                setCep(sc.nextLine());
                break;
                case 2:
                    setRua(sc.nextLine());
                    break;
                    case 3:
                        setBairro(sc.nextLine());
                        break;
                        case 4:
                            setCidade(sc.nextLine());
                            break;
                            case 5:
                                setEstado(sc.nextLine());
                                break;
                                case 6:
                                    setNumCasa(sc.nextInt());
                                    break;
                                    default:
                                        System.out.println("Opção inválida!");
                                        break;

        }

        return endereco;
    }
}