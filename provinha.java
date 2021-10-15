package aula;
import java.util.Scanner;
public class provinha {
	public static void main(String[] args) {
		System.err.println("-->Cone<--");
		double pi = 3.14f;
		double preco_total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o valor do raio ");
		double r = sc.nextDouble();
		System.out.print("digite o valor da altura ");
		double h = sc.nextDouble();
		System.out.println("digite o tipo de tinta a ser usado");
		System.out.println("1 – R$ 238,90");
		System.out.println("2 – R$ 467,98");
		System.out.println("3 – R$ 758,34");
		int tipo = sc.nextInt();	
		double g = Math.sqrt((r*r) + (h*h));
		
		System.out.println("Raio:"+r);
		System.out.println("Altura:"+h);
		System.out.println("Nível:"+tipo);
		System.out.println("____________");				
		System.out.printf("Geratriz:%.2f ",g);
		System.out.println();
		System.out.println("____________");			
		double area = pi*r*r;
		System.out.println("____________");			
		System.out.printf("Área do Circulo:%.2f ",area);
		System.out.println();
		area = pi*r*g;
		System.out.printf("Área do lateral do Circulo:%.2f ",area);
		System.out.println();
		area = pi*r*(r + g);	
		System.out.printf("area total:%.2f ",area);
		System.out.println();
		System.out.println("____________");			
		double litros = area*3.45;
		System.out.printf("Litros:%.2f ",litros);
		System.out.println();
		double latas = Math.ceil(litros/18);
		System.out.println("Latas: "+latas);
		System.out.println("____________");		
		switch(tipo) {
		case 1:
			preco_total = 238.90;
			preco_total *= latas;		
		break;
		case 2:
			preco_total = 467.98;
			preco_total *= latas;
		break;
		case 3:
			preco_total = 758.34;
			preco_total *= latas;
		break;
	}
		System.out.printf("Preço Total R$ %.2f",preco_total);
		
		sc.close();
	}}
