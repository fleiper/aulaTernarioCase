package aulaternariocase;
import java.util.Scanner;
public class novotextao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario,tempo,bonus1,bonus2;
		
		System.out.println("o salario do funcionario é: ");
		salario = ler.nextDouble();
	
		System.out.println("o tempo de trabalho é de: ");
		tempo = ler.nextDouble();
		
		bonus1 = (salario*0.05);
		bonus2 = (salario*0.07);
		
		
	    String msg = ( tempo > 3 ? "salario com bonus de +3 anos "+ bonus2 : " salario com apenas 5% de bonus "+bonus1);
		System.out.println(msg);
	}
}
