package staticblocks;

public class Mall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopping sh1 = new Shopping();
		sh1.buy("coffee");
		Shopping sh2 = new Shopping();
		sh2.buy("wooden spoon");

		// Shopping.buy("Wooden spoon");
		// Shopping.buy("Wooden plate");

		// Shopping.showShoppingList();
		// Shopping.buy("coffee");
		// Shopping.showShoppingList();
		
		isOpen();
		
		
	}

	public static boolean isOpen() {
		System.out.println("Mall is open");
		return true;
	}
	
	

}
