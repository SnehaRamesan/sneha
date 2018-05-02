package testdemo;

import java.util.Random;
import java.util.Scanner;

public class FlipKart {
	void sell(){
		Random r = new Random();
		int option = r.nextInt(3)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();
		System.out.println("enter your phone number");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the address");
		String address = sc.nextLine();
		if (option==1) {
			FedEx f = new FedEx();
			f.deliverProduct(name, phone, address);
			
		} else if (option==2) {
			IndianPost i = new IndianPost();
			i.deliverProduct(name, phone, address);
			
		} else if(option==3){
			DHL d = new DHL();
			d.deliverProduct(name, phone, address);

		} 
	}

}
