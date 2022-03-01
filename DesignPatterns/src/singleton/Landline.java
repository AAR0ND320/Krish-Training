package singleton;

public class Landline {
	private static volatile Landline landline;
	
	private Landline() {
		
	}
	
	public static Landline getLandline() {
		if (landline == null) {
			landline = new Landline();
		}
		
		return landline;
	}
}