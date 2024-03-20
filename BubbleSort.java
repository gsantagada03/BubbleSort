
/**
 * @author Giuseppe Santagada
 * @version 1.0
 * 
 */
public class Main {
	public static void main(String[] args) {
		int[] numeri = { 1, 3, 6, 5, 4, 9, 10, 2, 7, 8 };
		bubbleSort(numeri);
	}

	/**
	 * Questo metodo serve per iterare l'array e confrontare gli elementi precedenti con quelli successivi, in modo tale da ordinarlo in base a 
	 * questa comparazione. Alla fine si itera l'array con il nuovo ordinamento
	 * 
	 * @param numeri serve a passare l'array di numeri interi
	 * 
	 * @since versione 1.0
	 */
	public static void bubbleSort(int[] numeri) {
		for (int i = 0; i < numeri.length; i++) {

			for (int j = 0; j < numeri.length - 1; j++) {

				if (numeri[j] < numeri[j + 1]) {
					int temp = numeri[j];
					numeri[j] = numeri[j + 1];
					numeri[j + 1] = temp;
				}
			}
		}

		for (int numero : numeri) {
			System.out.println(numero);
		}
	}

}