package aulaternariocase;
import java.util.Scanner;
public class issoenovo {

	public static void main(String[] args) {
		 double a;
		 Scanner ler = new Scanner (System.in);
		 
		 System.out.print("informe um valor: ");
		 a = ler.nextDouble();
		 
		 String msg = a % 5 == 0 ?  "multiplo de 5" : "não divisivel por 5";
		 System.out.print(msg);
	}

}
