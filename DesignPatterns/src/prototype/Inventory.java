package prototype;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private Map<DeviceType, Device> devices = new HashMap<>();

	public Inventory() {
		this.initialize();
	}
	
	private void initialize() {
		Laptop laptop = new Laptop();
		laptop.setBatteryCapacity(2100);
		laptop.setDisplaySize("15.6\"");
		laptop.setNumberOfPorts(5);
		
		Mobile mobile = new Mobile();
		mobile.setBatteryCapacity(3300);
		mobile.setDisplaySize("6.2\"");
		mobile.setNumberOfCameras(4);
		
		devices.put(DeviceType.MOBILE, mobile);
		devices.put(DeviceType.LAPTOP, laptop);
	}
	
}
