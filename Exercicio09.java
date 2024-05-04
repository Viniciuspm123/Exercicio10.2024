package tarefa10;

public class Exercicio09 {
	
	 public static void main(String[] args) {
	        int numero = 15;
	        int primeiro = 1;
	        int segundo = 1;
	        System.out.print("Série de Fibonacci até o décimo quinto termo : ");
	        System.out.print(primeiro + " " + segundo + " ");
	        for (int i = 3; i <= numero; i++) {
	            int proximo = primeiro + segundo;
	            System.out.print(proximo + " ");
	            primeiro = segundo;
	            segundo = proximo;
	        }
	    }
	}