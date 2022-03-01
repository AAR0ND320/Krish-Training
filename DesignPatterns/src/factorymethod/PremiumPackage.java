package factorymethod;

public class PremiumPackage extends TourismPackage{

	@Override
	protected void createPackage() {
		benefits.add(new SuiteBenefit());
		benefits.add(new TourBenefit());
		benefits.add(new BreakfastBenefit());
		benefits.add(new LunchBenefit());
		benefits.add(new DinnerBenefit());
	}

}
