
public class Exercicio1 {
	public static void main(String args[]) {
		int somaImpar = 0;
		for (int i=0;i<=500;i++) {
			if(i%2 != 0 && i%3 == 0) {
				somaImpar = somaImpar+i;
			}
		}
		System.out.println("A soma de todos os n�meros impares m�ltiplos de 3 entre 1 e 500 �: "+somaImpar);
	}

}
