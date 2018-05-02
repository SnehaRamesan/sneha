package testdemo;

public class Person {
	void purchase(){
		System.out.println("Opened flipkart website");
		FlipKart f = new FlipKart();
		System.out.println("requesting flipkart to sell the product");
		f.sell();
	}
	public static void main(String[] args) {
		System.out.println("Person is present");
		Person p = new Person();
		System.out.println("He is purchasing the product");
		p.purchase();
		IDelivery.show();
		
	}

}
