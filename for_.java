package aula;
import java.util.Scanner;
public class for_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("numero que quer ver a tabuada ");
		int num = sc.nextInt();
		int par=0, impar=0;
		int result;
		for (int i= 0;  i<=10 ; i++) {
			result = num*i;
			System.out.println(num+" x "+i+" = "+ result);
			if (result%2==0) 
				par++;
			else
				impar++;
			
		}
		System.out.println("quantidade de números pares "+par);
		System.out.println("quantidade de números impares "+impar);
		sc.close();
	}
}
