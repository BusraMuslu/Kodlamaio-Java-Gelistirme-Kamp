package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -1;
		int remainder = number % 2;
		
		boolean isPrime = true;

		if (number==1) {
			System.out.println("Sayi Asal De�ildir");
			return;
		}
		
		if (number<1) {
			System.out.println("ge�ersiz sayi");
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
			System.out.println("Say� Asald�r");
		}else {
			System.out.println("Say� Asal de�ildir");
		}
		
	}

}
