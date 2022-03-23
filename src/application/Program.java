package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante[] vect = new Estudante[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int q = sc.nextInt();
		
		for (int i=1; i<q; i++) {
			System.out.println();
			System.out.println("Locador nº"+i+":");
			System.out.println("Nome do locador: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail do locador: ");
			String email = sc.nextLine();
			System.out.println("Quarto?");
			int quarto = sc.nextInt();
			vect [quarto] = new Estudante(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i=0; i<10; i++) {
			if(vect[i]!=null) {
				System.out.println(i+":"+vect[i]);
			}
		}
		
		sc.close();

	}

}
