package oop1;

public class Main {

	public static void main(String[] args) {
		                                                                               // yapılan işleme Set işleme denir 
		Product product1 =new Product();                                              //Class çağırma şekli  
		product1.setName("huavei");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setImageUrl("image1.jpg");
        product1.setUnitsInStock(40); 
        
        
        Product product2 =new Product();          
        product2.setName("casper");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setImageUrl("image2.jpg");
        product2.setUnitsInStock(40); 
       
        
        
        Product product3 =new Product();         
        product3.setName("apple ");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setImageUrl("image3.jpg");
        product3.setUnitsInStock(40); 
        
           
        
        
       Product[] products= {product1,product2,product3,};
     for (Product product : products) {                                     // veri tipi Product olanın  dön 
		System.out.println(product.getName());
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(0);                              // Extends ile customerden gelen özellikler
		individualCustomer.setCustomerNumber("121545");
		individualCustomer.setPhone("053665454688");
		individualCustomer.setFirstName("Yakup");
		individualCustomer.setFirstName("Kurt");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Selçuk Üniversitesi");
		corporateCustomer.setPhone("54645445464468");
		corporateCustomer.setCustomerNumber("545648546484");
		corporateCustomer.setTaxNumber("222222222222");
		
		
		Customer[]customer= {individualCustomer,corporateCustomer};
		
	}
	}
        
}
