package chainofresponsibility;

public class NoTier extends Handler {

	@Override
	public void provideBenefit(Donation donation) {
		System.out.println("Thank you for your donation!");
		
		if(donation.getDonationAmount() >= 10) {
			successor.provideBenefit(donation);
		}
	}

}
