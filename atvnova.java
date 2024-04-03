package aulaternariocase;
import java.util.Scanner;
public class atvnova {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1, n2, n3, n4, media;
		
		System.out.println("a nota do primeiro bimestre é de: ");
		n1= ler.nextDouble();
		
		System.out.println("a nota do segundo bimestre é de: ");
		n2= ler.nextDouble();
		
		System.out.println("a nota do terceiro bimestre é de: ");
		n3= ler.nextDouble();
		
		System.out.println("a nota do quarto bimestre é de: ");
		n4= ler.nextDouble();
		
		media = (n1+n2+n3+n4)/4;
		
		String mensagem = media >= 6 ? "o aluno foi aprovado" : "este aluno está reprovado";
		System.out.println(mensagem);
	}
}
