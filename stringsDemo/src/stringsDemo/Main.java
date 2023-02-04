package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "  Bugün hava çok güzel.  ";
		System.out.println(mesaj);
		//1
		System.out.println("Eleman Sayisi : " + mesaj.length());
		//2
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		//3
		System.out.println(mesaj.concat(" Yaþasýn!"));
		//4
		System.out.println(mesaj.startsWith("B")); // Metnin verdiðmiz karakterle baþlayýp baþlamadýðýný kontrol eder. Doðru ise True deðilse False döndürür
		//5
		System.out.println(mesaj.endsWith("l")); // Metnin verdiðmiz karakterle bitip bitmediðini kontrol eder. Doðru ise True deðilse False döndürür
		//6
		char[] karakterler =new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		//7
		System.out.println(mesaj.indexOf('a'));//Karakterin mesajýn içinde kaçýncý eleman olduðunu bulmaya yarar./ilk bulduðunu direk yazdýrýr
		//8
		System.out.println(mesaj.lastIndexOf('e'));
		
		//9 Karakter deðiþtirme
		String yeniMesaj=mesaj.replace(' ' , '-' );
		System.out.println(yeniMesaj);
		
		//10 Bir metnin n ninci indexinden itibaren parça almak
		System.out.println(mesaj.substring(2,5)); //2 den baþla 5 e kadar
		
		//11 Split bir metni bellli bir karakter veya karakter dizisini parçalamaya yarar
		
		for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		//12 Lower Case küçük harfe çevirme
		System.out.println(mesaj.toLowerCase());
		//13 Upper Case = Büyük harfe çevirme
		System.out.println(mesaj.toUpperCase());
		//14 Baþýna ve sonuna boþluk býrakma
		System.out.println(mesaj.trim());
		
		
		
		
	}

}
