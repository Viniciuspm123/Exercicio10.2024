package tarefa10;

import java.util.Scanner;

public class Exercicio02 {

		public static void main (String[]args) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Digite um número do tipo inteiro : ");
			
			int contador=1;
			
			int numero = sc.nextInt();
			
			while(contador<11) {
				System.out.println(numero +"X"+contador+"="+numero*contador);
				contador++;
			
			}
			sc.close();
		}
		}
