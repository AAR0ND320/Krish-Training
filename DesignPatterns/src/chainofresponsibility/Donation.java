package chainofresponsibility;

public class Donation {
	
	private int donationID;
	private double donationAmount;
	
	public Donation(int donationID, double donationAmount) {
		this.donationID = donationID;
		this.donationAmount = donationAmount;
	}

	public int getDonationID() {
		return donationID;
	}

	public double getDonationAmount() {
		return donationAmount;
	}
	
}
