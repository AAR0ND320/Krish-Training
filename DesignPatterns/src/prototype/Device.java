package prototype;

public abstract class Device {

	private String brand;
	private int batteryCapacity;
	
	public String getDisplaySize() {
		return brand;
	}
	
	public void setDisplaySize(String displaySize) {
		this.brand = displaySize;
	}
	
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
}
