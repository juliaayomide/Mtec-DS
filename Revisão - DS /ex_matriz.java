package revisao_ds;
import java.util.Scanner;
public class ex_matriz {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		double a[][] = new double [3][4];
		int j, i=1;
		a[0][0] = 2; 
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.println("Digite as notas do aluno "+(i+1)+".");
				a[i][j] = in.nextDouble();

			}
		}
		
		for(i=0;i<3;i++) {
			
			
			for(j=0;j<4;j++) {
				System.out.print( "["+ a[i][j]+ "] ");
			
			}
			System.out.println("-> Notas do aluno "+(i+1));
		}
	
	}
}

