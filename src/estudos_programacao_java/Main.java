package estudos_programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double preco_m2 = sc.nextDouble();
		
		double area = x * y;
		double precott = area * preco_m2;
		
		
		System.out.println("Essas são as informações do seu terreno");
		System.out.printf("%.2f%n", area);
		System.out.printf("%.2f%n", precott);
		
		sc.close();
		
==========================================================		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
===========================================================		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double z;
		char c;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		c = sc.next().charAt(0);

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		
		sc.close();
				
==========================================================
		
		/*
		int y = 32;
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		String nome = "Maria";
		
		Locale.setDefault(Locale.US);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADOS = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
		//System.out.println(y);
		//System.out.println(x);
		
		*/
		
	}

}
