package aulaternariocase;
import java.util.Scanner;
public class breakdance {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		String usuario;
		System.out.println("quem é você usuario? Digite um nome");
		usuario = ler.nextLine();
		
		System.out.println("Escolha um numero de 1 a 10");
		int numero = ler.nextInt();
		
		
		switch (numero) {
		case 1:
			System.out.println("o numero que o "+usuario+" selecionou é: 1");
			break;
		case 2:
			System.out.println("o numero que o "+usuario+"  selecionou é: 2");
			break;
		case 3:
			System.out.println("o numero que o "+usuario+"  selecionou é: 3");
			break;
		case 4:
			System.out.println("o numero que o "+usuario+"  selecionou é: 4");
			break;
		case 5:
			System.out.println("o numero que o "+usuario+"  selecionou é: 5");
			break;
		case 6:
			System.out.println("o numero que o "+usuario+"  selecionou é: 6");
			break;
		case 7:
			System.out.println("o numero que o "+usuario+"  selecionou é: 7");
			break;
		case 8:
			System.out.println("o numero que o "+usuario+"  selecionou é: 8");
			break;
		case 9:
			System.out.println("o numero que o "+usuario+"  selecionou é: 9");
			break;
		case 10:
			System.out.println("o numero que o "+usuario+"  selecionou é: 10");
		default:
			System.out.println("NÃO É UM NUMERO VALIDO! POR FAVOR TENTE NOVAMENTE");
		}
		

	}
	}

