package prototype;

public class Mobile extends Device {

	private int numberOfCameras;

	public int getNumberOfCameras() {
		return numberOfCameras;
	}

	public void setNumberOfCameras(int numberOfCameras) {
		this.numberOfCameras = numberOfCameras;
	}

	@Override
	public String toString() {
		return "Mobile [numberOfCameras=" + numberOfCameras + "]";
	}
	
}
