package exfixacao;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tipo;
        double base, altura, dmaior, dmenor, bmaior, bmenor;
        System.out.println("Digite o n�mero de formas: ");
        n = scanner.nextInt();
 
        for (int i = 0; i < n; i++) {
            System.out.println("Escolha o tipo de forma (1-Quadrado, 2-Losango, 3-Trapezio, 4-Triangulo e 5-Retangulo): ");
           tipo = scanner.nextInt();
 
            if (tipo == 1) {
                System.out.print("Digite a base do Quadrado: ");
                base = scanner.nextDouble();
                System.out.print("Digite a altura do Quadrado: ");
                altura = scanner.nextDouble();
                Quadrado qua1 = new Quadrado(base, altura);
                System.out.println("A area da forma �: "+qua1.Carea()); 
 
            }else if (tipo == 2) {
                    System.out.print("Digite a diagonal maior do Losango: ");
                    dmaior = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do Losango: ");
                    dmenor = scanner.nextDouble();
                    Losango lo1 = new Losango(dmaior, dmenor);
                    System.out.println("A area da forma �: "+lo1.Carea());  
 
            }else if (tipo == 3) {
                        System.out.print("Digite a base maior do trap�zio: ");
                        bmaior = scanner.nextDouble();
                        System.out.print("Digite a base menor do trap�zio: ");
                        bmenor = scanner.nextDouble();
                        System.out.print("Digite a altura do trap�zio: ");
                        altura = scanner.nextDouble();
                        Trapezio tra1 = new Trapezio(bmaior,bmenor, altura);
                        System.out.println("A area da forma �: "+tra1.Carea()); 
 
            }else if (tipo == 4) {
                        System.out.print("Digite a base do triangulo: ");
                        base = scanner.nextDouble();
                        System.out.print("Digite a altura do triangulo: ");
                        altura = scanner.nextDouble();
                        Triangulo tri1 = new Triangulo(base, altura);
                        System.out.println("A area da forma �: "+tri1.Carea()); 
 
            } else if (tipo == 5) {
                System.out.print("Digite a base do ret�ngulo: ");
                base = scanner.nextDouble();
                System.out.print("Digite a altura do ret�ngulo: ");
                altura = scanner.nextDouble();
                Retangulo re1 = new Retangulo(base, altura);
                System.out.println("A area da forma �: "+re1.Carea()); 
                
            } else {
                System.out.println("Tipo inv�lido. Tente novamente.");
             
            }
 
         
        }
 
        scanner.close();
    }
}



