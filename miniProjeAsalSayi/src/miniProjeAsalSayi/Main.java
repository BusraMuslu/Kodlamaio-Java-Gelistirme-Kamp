package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		
		boolean isPrime = true;

		if (number==1) {
			System.out.println("Sayi Asal Deðildir");
			return;
		}
		
		if (number<1) {
			System.out.println("geçersiz sayi");
			return;
			
		}
		
		for (int i = 2; i < number; i++) {
			if (number%2==0) {
				isPrime = false;
				
			} else {
				isPrime = true;
				
			}
		}
		if (isPrime==true) {
			System.out.println("Sayý Asaldýr");
		}else {
			System.out.println("Sayý Asal deðildir");
		}
		
	}

}
