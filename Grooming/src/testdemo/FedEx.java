package testdemo;

public class FedEx implements IDelivery{
	@Override
	public void deliverProduct(String name, long phone, String address){
		System.out.println("FedEx delivered the product to "+name+" "+phone+" at "+address);
	}

}
