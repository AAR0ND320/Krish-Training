package factorymethod;

public class ExtraPackage extends TourismPackage {

	@Override
	protected void createPackage() {
		benefits.add(new RoomBenefit());
		benefits.add(new TourBenefit());
		benefits.add(new BreakfastBenefit());
		benefits.add(new DinnerBenefit());
	}

}
