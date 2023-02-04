package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int i = 1; i < sayilar.length; i++) {
			if (i == aranacak) {
				varMi = true;
			} else {
				varMi = false;
			}
		}
		
		String mesaj="";
		if (varMi == true) {
			mesaj="Sayý mevcuttur: " + aranacak;
			mesajVer(mesaj);
			//System.out.println("sayi dizide mevcuttur: " + aranacak);
		} else {
			mesajVer("Sayý mevcut deðildir: " + aranacak);
		}
	}
	public static void mesajVer(String mesaj) {//paramaetreli metod
		System.out.println(mesaj);
	}
	/*public static void mesajVer() {
		System.out.println("sayi dizide mevcuttur: " + aranacak);
	}*/
}
