package prototype;

public class Laptop extends Device {
	
	private int numberOfPorts;

	public int getNumberOfPorts() {
		return numberOfPorts;
	}

	public void setNumberOfPorts(int numberOfPorts) {
		this.numberOfPorts = numberOfPorts;
	}

	@Override
	public String toString() {
		return "Laptop [numberOfPorts=" + numberOfPorts + "]";
	}
	
}
