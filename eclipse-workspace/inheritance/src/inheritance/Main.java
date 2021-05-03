package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin= new IndividualCustomer();
		engin.customerNumber="12345 ";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="6789 ";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.sendikaBiseyi="10000 ";
		
		CustomerManager customerManager= new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(engin);
		//customerManager.add(abc);
		
		Customer[] customers = {engin, abc, hepsiBurada};
		customerManager.addMultiple(customers);
	}
}