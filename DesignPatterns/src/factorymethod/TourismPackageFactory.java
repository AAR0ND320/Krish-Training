package factorymethod;

public class TourismPackageFactory {
	
	public static TourismPackage bookPackage(PackageType packageType) {
		switch(packageType) {
		case BASIC:
			return new BasicPackage();
		case EXTRA:
			return new ExtraPackage();
		case PREMIUM:
			return new PremiumPackage();
		default:
			return null; 
		}
	}
	
}
