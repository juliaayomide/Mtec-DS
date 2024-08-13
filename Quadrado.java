package exfixacao;
public class Quadrado extends Formag{
    private double base;
    private double altura;
 
 
    public Quadrado (double base, double altura) {
        this.base = base;
        this.altura = altura;
 
    }
    @Override
    public double Carea() {
       double area = base * altura;
       return area;
    }
}