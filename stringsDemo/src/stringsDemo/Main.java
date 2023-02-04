package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "  Bug�n hava �ok g�zel.  ";
		System.out.println(mesaj);
		//1
		System.out.println("Eleman Sayisi : " + mesaj.length());
		//2
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		//3
		System.out.println(mesaj.concat(" Ya�as�n!"));
		//4
		System.out.println(mesaj.startsWith("B")); // Metnin verdi�miz karakterle ba�lay�p ba�lamad���n� kontrol eder. Do�ru ise True de�ilse False d�nd�r�r
		//5
		System.out.println(mesaj.endsWith("l")); // Metnin verdi�miz karakterle bitip bitmedi�ini kontrol eder. Do�ru ise True de�ilse False d�nd�r�r
		//6
		char[] karakterler =new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		//7
		System.out.println(mesaj.indexOf('a'));//Karakterin mesaj�n i�inde ka��nc� eleman oldu�unu bulmaya yarar./ilk buldu�unu direk yazd�r�r
		//8
		System.out.println(mesaj.lastIndexOf('e'));
		
		//9 Karakter de�i�tirme
		String yeniMesaj=mesaj.replace(' ' , '-' );
		System.out.println(yeniMesaj);
		
		//10 Bir metnin n ninci indexinden itibaren par�a almak
		System.out.println(mesaj.substring(2,5)); //2 den ba�la 5 e kadar
		
		//11 Split bir metni bellli bir karakter veya karakter dizisini par�alamaya yarar
		
		for (String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		//12 Lower Case k���k harfe �evirme
		System.out.println(mesaj.toLowerCase());
		//13 Upper Case = B�y�k harfe �evirme
		System.out.println(mesaj.toUpperCase());
		//14 Ba��na ve sonuna bo�luk b�rakma
		System.out.println(mesaj.trim());
		
		
		
		
	}

}
