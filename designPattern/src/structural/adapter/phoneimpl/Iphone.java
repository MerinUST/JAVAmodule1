package structural.adapter.phoneimpl;

import structural.adapter.phone.ifaces.LightningPhone;

public class Iphone implements LightningPhone {
	private boolean connector;
	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharged finished");
			
		}
		else {
			System.out.println("Connect MicroUsb first");
		}

	}

	public void useLightning() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("Lightning connected");
	


	}

}
