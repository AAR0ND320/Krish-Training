package chainofresponsibility;

public class Application {
	
	public static void main(String[] args) {
		NoTier noTier = new NoTier();
		FirstTier firstTier = new FirstTier();
		SecondTier secondTier = new SecondTier();
		ThirdTier thirdTier = new ThirdTier();
	}
	
}
