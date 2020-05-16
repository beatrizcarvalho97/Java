
public class Exercicio2 {
	public static void main (String args[]) {
		System.out.println("No conjunto entre 1000 e 1999, estes são os números divisíveis por 11 ou com resto igual a 5: ");
			for (int i=1000;i<=1999;i++) {
				if(i%11 == 0 || i%11 == 5) {
				System.out.println(i);
				}
				
			}
	}
}
