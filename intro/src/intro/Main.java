package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");

		String ortaMetin = "Ýlginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println("ortaMetin");
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;

		double dolarDun = 18.25;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;
		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array

		String[] krediler = { "Hýzlý Kredi", "Maaþýný Halkbanktan Alanlar", "Mutlu Emekli" };

		/*
		 * System.out.println(krediler[1]); System.out.println(krediler[2]);
		 */
		for (int i = 0; i < krediler.length; i++) {

			System.out.println(krediler[i]);
		}

	}
}
