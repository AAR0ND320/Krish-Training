package factorymethod;

public class BasicPackage extends TourismPackage {

	@Override
	protected void createPackage() {
		benefits.add(new RoomBenefit());
		benefits.add(new BreakfastBenefit());
	}

}
