package tarefa10;

public class Exercicio08 { 
	
	public static void main(String[] args) {
    int base = 2; //pode ser mudado com a classe Scanner
    int expoente = 3; //pode ser mudado com a classe Scanner
    int resultado = 1;
    for (int i = 0; i < expoente; i++) {
        resultado *= base;
    }
    System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
}
}