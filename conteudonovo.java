package aulaternariocase;
import java.util.Scanner;
public class conteudonovo {
	
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	System.out.println("E MINHA IDADE É DE ");
	int idade = ler.nextInt();
	
	String mensagem = idade >= 18 ? "MAIOR DE IDADE" : "MENOR DE IDADE";
	System.out.println(mensagem);
	}
}