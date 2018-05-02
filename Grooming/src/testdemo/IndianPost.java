package testdemo;

public class IndianPost implements IDelivery {
	@Override
	public void deliverProduct(String name, long phone, String address){
		System.out.println("Indian Post delivered the product to "+name+" "+phone+" at "+address);

	}
}
