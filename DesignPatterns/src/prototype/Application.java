package prototype;

public class Application {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		Mobile mobile1 = (Mobile) inventory.getDevice(DeviceType.MOBILE);
		mobile1.setNumberOfCameras(6);
		
		Laptop laptop = (Laptop) inventory.getDevice(DeviceType.LAPTOP);
		
		Mobile mobile2 = (Mobile) inventory.getDevice(DeviceType.MOBILE);
		
		System.out.println(mobile1);
		System.out.println(mobile2);
		System.out.println(laptop);
	}

}
