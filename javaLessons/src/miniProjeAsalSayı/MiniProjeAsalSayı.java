package miniProjeAsalSayı;

public class MiniProjeAsalSayı {

	public static void main(String[] args) {
		int number = 0;
		boolean isPrime = true;
		if(number<1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			}

		}

		if (isPrime) {
			System.out.println("Sayı asaldır");

		} else {
			System.out.println("Sayı asal değildir");
		}
	}

}
