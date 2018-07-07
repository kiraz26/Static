package staticVariable;

public class Parking {

	static int numberOfSpacesAvailable = 20;

	public void parkACar(String model) {
		System.out.println("Parking: " + model);
		numberOfSpacesAvailable--;

	}

	public boolean parkingAvailable() {
		if (numberOfSpacesAvailable > 0) {
			return true;
		}
		return false;
	}

}
