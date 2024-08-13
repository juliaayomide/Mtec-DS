package exfixacao;
public class Trapezio extends Formag{
    public double bmaior;
    public double bmenor;
    public double altura;
  
 
    public Trapezio (double bmaior, double bmenor, double altura){
        this.bmaior = bmaior;
        this.bmenor = bmenor;
        this.altura = altura;
   
    }
    @Override
    public double Carea() {
        double area = (bmaior+bmenor)*altura/2 ;
        return area;
    }
}