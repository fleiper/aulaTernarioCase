package aulaternariocase;

import java.util.Scanner;

public class denovoif {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double salario,tempo,bonus1,bonus2;
		
		System.out.println("o salario do funcionario é: ");
		salario = ler.nextDouble();
	
		System.out.println("o tempo de trabalho é de: ");
		tempo = ler.nextDouble();
		
		bonus1 = (salario*0.05);
		bonus2 = (salario*0.07);
		
		
	   if ( tempo <= 3) {
		System.out.println("você recebera "+salario+ "como pagamento mais "+bonus1+ "como um bonus pelos" +tempo+ "de trabalho");
	   }
		
		else {
			System.out.println("você recebera "+salario+ "e mais "+bonus2+ "como um bonus");
		}
	}

	}


