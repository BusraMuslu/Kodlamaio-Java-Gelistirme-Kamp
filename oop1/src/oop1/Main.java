package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oraný";

		Product product1 = new Product();

		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("kahve.jpg");
		/*
		 * product1.name = "Delonghi Kahve Makinesi"; product1.unitPrice = 7500;
		 * product1.discount = 7; product1.unitsInStock = 3; product1.imageUrl =
		 * "kahve.jpg";
		 */

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("kahve2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("kahve3.jpg");

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {

			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05111111111");
		individualCustomer.setCustomerNumber("147258");
		individualCustomer.setFirstName("Büþra Nur");
		individualCustomer.setLastName("Muslu");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers= {individualCustomer,corporateCustomer};
	}

}
