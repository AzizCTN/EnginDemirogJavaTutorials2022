package oop1;

public class Main {

	public static void main(String[] args) {
//set values --- Bir ürünün değerleri
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageURL("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		product2.setImageURL("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageURL("image3.jpg");

		Product[] products = { product1, product2, product3 };
//get --- for each --- Bir kategorideki ürünleri sıralar
		for (Product product : products) {
			System.out.println(product.getName());
			
		}
		
		//inheritance
		//bayi girişi / kullanıcı girişi
		
		IndividualCustomer individualCustomer = new IndividualCustomer();	
		
		individualCustomer.setId(0);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Aziz");
		individualCustomer.setLastName("Cetin");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();		
		corporateCustomer.setId(1);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	
	}

}
