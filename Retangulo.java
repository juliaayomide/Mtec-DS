package exfixacao;
public class Retangulo extends Formag{
    private double base;
    private double altura;
 
 
    public Retangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
 
    }
    @Override
    public double Carea() {
       double area = base * altura;
       return area;
    }
}