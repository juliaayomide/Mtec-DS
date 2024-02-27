package revisao_ds;
import java.util.Scanner;
public class ex_while2 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		String resposta;
		do {
			
			System.out.println("Digite seu ano de nascimento.");
			anoNasc = in.nextInt();
			
			System.out.println("Digite o ano atual.");
			anoAtual = in.nextInt();
			
			idade = anoAtual - anoNasc;
			
			System.out.println("Você tem "+ idade +" anos e");
			
			if (idade>=18) {
				System.out.println("é Maior de idade.");
			} else{
				System.out.println("é Menor de idade.");
			}
			System.out.println("Deseja calcular a idade de mais uma pessoa? (sim ou não).");
			resposta = in.next();
			
		}while(resposta.equals("sim"));
		
	}
}
