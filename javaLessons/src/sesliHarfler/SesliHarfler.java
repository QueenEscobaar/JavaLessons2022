package sesliHarfler;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'Ö';
//		if(harf=='A'||harf=='E'||harf=='I'||harf=='İ'||harf=='U'||harf=='Ü'||harf=='O'||harf=='Ö'){
//			System.out.println("Harf Seslidir");
//		}
//		else {
//			System.out.println(" Harf Sesli Değildir");
//		} veya

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

	}

}
