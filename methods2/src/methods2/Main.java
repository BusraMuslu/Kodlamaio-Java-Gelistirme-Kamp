package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		// String yeniMesaj=mesaj.substring(0,2);
		// String yeniMesaj=topla(); //Hata verir çünkü int döndürüyor
		String yeniMesaj = sehirVer(); // Hata yok çünkü String döndürüyor
		System.out.println(yeniMesaj);
		
		
		int sayi = topla(15, 7);
		System.out.println(sayi);
		
		
		int toplam=topla2(2,3,4,5,6,10);
		System.out.println(toplam);

	}

	// Void operasyonunda bir þeyi yap dersiniz
	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	//Sadece 2 adet sayý gönderebiliyorsun
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			
			toplam+=sayi;
			
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
