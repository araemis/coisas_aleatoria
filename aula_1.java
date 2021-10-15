package aula;
import java.util.Scanner;
public class aula_1 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.err.println("digite um valor maior que 1");
		num = sc.nextInt();
		while(num<1) {
			System.err.println("digite um valor maior que 1");
		num = sc.nextInt();
		}sc.close();
	}

}
