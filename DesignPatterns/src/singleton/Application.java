package singleton;

public class Application {

	public static void main(String[] args) {
		Landline telephone1 = Landline.getLandline();
		System.out.println(telephone1);
		
		Landline telephone2 = Landline.getLandline();
		System.out.println(telephone2);
	}

}