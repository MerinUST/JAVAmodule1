package structural.adapter.phoneimpl;

import structural.adapter.phone.ifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
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

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("MicroUsb connected");
	}

}
