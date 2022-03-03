package chainofresponsibility;

public class ThirdTier extends Handler {

	@Override
	public void provideBenefit(Donation donation) {
		System.out.println("You have received a Custom Mug!");
	}

}
