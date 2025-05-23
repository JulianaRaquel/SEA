
import java.util.Scanner;

public class Notas {
    private double[] notas;
    private double media;
    private Boolean isP4;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double[] notas, boolean isP4) {
        this.media = (notas[0] + notas[1] + notas[2]) / 3;

        if (isP4 == true) {
            this.media = ((6*this.media) + (4*notas[3]))/10;
        }
    }

    public Boolean getP4() {
        return isP4;
    }

    public void setP4(Boolean p4) {
        this.isP4 = p4;
    }

    public Notas(){
        setP4(false);
    }

    public double[] lancarNotas(){
        Scanner sc = new Scanner(System.in);
        notas = new double[4];
        System.out.println("Digite as notas do aluno:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }
        setMedia(notas, isP4);

        if (this.media < 7){
            setP4(true);
        }

        if (isP4 == true) {
            System.out.printf("Nota %d: ", 4);
            notas[3] = sc.nextDouble();
        }
        setMedia(notas, isP4);

        System.out.println("Notas lançadas!");

        return notas;
    }

    public void verNotas(){
        System.out.printf("%nNotas do aluno:%n");
        System.out.printf("UND1\tUND2\tUND3\tP4\tMEDIA%n");
        System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\t%.1f%n", this.notas[0], this.notas[1], this.notas[2], this.notas[3], this.media);


    }

}