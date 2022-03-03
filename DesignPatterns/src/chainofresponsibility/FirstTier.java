package chainofresponsibility;

public class FirstTier extends Handler {

	@Override
	public void provideBenefit(Donation donation) {
		System.out.println("You have received a Custom T-shirt!");
		
		if(donation.getDonationAmount() >= 20) {
			successor.provideBenefit(donation);
		}
	}

}
