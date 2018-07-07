package staticblocks;

import java.util.ArrayList;
import java.util.List;

public class Shopping {

	static List<String> itemsToBuy;

	static { 								// STATIC BLOCK ---> it works one time.
		itemsToBuy = new ArrayList<>();
		itemsToBuy.add("coffee");
		itemsToBuy.add("wooden spoon");
		itemsToBuy.add("shirt");
		itemsToBuy.add("shoes");

		System.out.println("In Static Block");
	}
	
	public static void showShoppingList() {
		System.out.println(itemsToBuy);
	}
	

	public Shopping() {
		System.out.println("In Shopping Constructor");
	}

	public static void buy(String item) {
		itemsToBuy.remove(item);
		System.out.println("Buying: " + item);
	}

	public void returnItem(String item) {
		System.out.println("Returning: " + item);
	}

}
