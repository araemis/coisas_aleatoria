package aula;
import java.util.Scanner;
public class aula_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		System.out.print("numero inicial ");
		int num_i = sc.nextInt();
		System.out.print("numero final ");
		int num_m = sc.nextInt();
		System.out.println("n�meros ");
		for (int i=num_i;  i<=num_m ; i++) {
			System.out.print(i+" ");
		}System.out.println();
		System.out.println("n�meros pares: ");
		for (int i = num_i; i < num_m; i++) {
			if (i%2==0) {
				System.out.print(i+ " ");
			}
			}System.out.println();
			System.out.println("n�meros impares: ");	
		for (int i = num_i; i < num_m; i++) {
			if (i%2!=0) 
				System.out.print(i+" ");
		}
		sc.close();
}}