package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total=0;
		double max=myList[0];
		
		for (double number:myList) {
			//En b�y�k sayiyi bulma
			if (max<number) {
				max=number;
			}
			total=total+number;// say�lar� Toplama 
			System.out.println(number);
		}
		System.out.println("Toplam=" + total);
		System.out.println("En B�y�k Say�=" + max );
	}

}
