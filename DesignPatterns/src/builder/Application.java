package builder;

public class Application {
	
	public static void main(String[] args) {
		Mobile.Builder mBuilder = new Mobile.Builder(2600);
		
		Mobile phone1 = mBuilder.waterproof(false).dropProtection("2yrs").serviceWarranty("1yr").build();
		
		System.out.println(phone1);
	}

}
