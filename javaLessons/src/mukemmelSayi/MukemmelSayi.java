package mukemmelSayi;

public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = i + total;

			}

		}
		if (number == total) {
			System.out.println("Mükemmel sayı");

		} 
		else {
			System.out.println("Mükemmel sayı değil");
		}

	}

}
