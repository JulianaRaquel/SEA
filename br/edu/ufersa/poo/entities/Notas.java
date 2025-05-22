public class Nota {
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    
    public Nota(double n1, double n2, double n3){
    	this.nota1 = n1;
	this.nota2 = n2;
	this.nota3 = n3;
    }
	
    public double calcularMedia(){
    	double media = (nota1 + nota2 + nota3) / 3.0;
	return media;
    }

    public double getNota1(){
    	return nota1;
    }

    public void setNota1(double n1){
    	this.nota1 = n1;
    }

    public double getNota2(){
    	return nota2;
    }

    public void setNota2(double n2){
    	this.nota2 = n2;
    }

    public double getNota3(){
    	return nota3;
    }

    public void setNota3(double n3){
    	this.nota3 = n3;
    }


}
