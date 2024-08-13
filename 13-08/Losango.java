package exfixacao;
public class Losango extends Formag{
    public double dmaior;
    public double dmenor;
   
 
    public Losango (double dmaior, double dmenor) {
    this.dmaior = dmaior;
    this.dmenor = dmenor;
   
}
 
@Override
public double Carea() {
    double area = dmaior* dmenor/2;
		return area;
}
}

