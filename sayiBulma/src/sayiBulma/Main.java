package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak=10;
		boolean varMi=false;
		
		for (int i = 1; i < sayilar.length; i++) {
			if (i==aranacak) {
				varMi=true;
			}
			else {
				varMi=false;
			}
		}
		
		if (varMi==true) {
			System.out.println("sayi dizide mevcuttur");
		}else {
			System.out.println("sayi bulunamamýþtýr");
		}

	}

}
