package factorymethod;

public class Application {

	public static void main(String[] args) {
		TourismPackage basicPackage = TourismPackageFactory.bookPackage(PackageType.BASIC);
		System.out.println(basicPackage);

		TourismPackage extraPackage = TourismPackageFactory.bookPackage(PackageType.EXTRA);
		System.out.println(extraPackage);

		TourismPackage premiumPackage = TourismPackageFactory.bookPackage(PackageType.PREMIUM);
		System.out.println(premiumPackage);
	}

}
