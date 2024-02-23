package controller;

public class FatController {
	public FatController() {
		super();
	}
	
	public int calcFatorial (int num) {
		// A condição de parada é quando o número inserido for 0 ou 1, nesse caso retornando 1 que é o resultado do fatorial deles,
		// ou para quando a função recursiva chegar em 1, que é o último termo do fatorial.
		if (num <= 1) {
			return 1;
		} 
		// Caso o número inserido seja maior que 2, então a função irá multiplicar esse número pela função novamente, mas enviando n-1,
		// que é o próximo número menor, até chegar na condição de parada.
		else {
			return num * calcFatorial (num-1);
		}
	}
}
