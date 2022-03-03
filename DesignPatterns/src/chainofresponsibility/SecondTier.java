package chainofresponsibility;

public class SecondTier extends Handler {

	@Override
	public void provideBenefit(Donation donation) {
		System.out.println("You have received a Dinner Voucher!");
		
		if(donation.getDonationAmount() >= 30) {
			successor.provideBenefit(donation);
		}
	}

}
