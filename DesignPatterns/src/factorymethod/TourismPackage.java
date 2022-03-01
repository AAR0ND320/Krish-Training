package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class TourismPackage {
	
	protected List<Benefit> benefits = new ArrayList<>();
	
	public TourismPackage() {
		createPackage();
	}
	
	protected abstract void createPackage();
	
	@Override
	public String toString() {
		return "Package includes the following benefits: " + benefits;
	}
	
}
