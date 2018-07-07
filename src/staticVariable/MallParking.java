package staticVariable;

public class MallParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parking p1 = new Parking();

		p1.parkACar("Tesla S");
		p1.parkACar("Mercedes S63 AMG");
		p1.parkACar("BMW 7.60Li");
		System.out.println(p1.numberOfSpacesAvailable);

		Parking p2 = new Parking();
		p2.parkACar("Audi S7");
		System.out.println("===============================");

		System.out.println(Parking.numberOfSpacesAvailable);
		System.out.println(p2.numberOfSpacesAvailable);
		System.out.println(p1.numberOfSpacesAvailable);

	}

}
