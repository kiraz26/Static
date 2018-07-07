package staticVariable;

public class EtsyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Etsy etsy = new Etsy();
		Etsy.navigate(TestData.url);
		Etsy.login(TestData.userId, TestData.password);
		Etsy.search(TestData.searchItem);
		
		Etsy etsy = new Etsy();
		etsy.navigate(TestData.url);
		etsy.login(TestData.userId, TestData.password);
		etsy.search(TestData.searchItem);
		
		//Static way access is classname.methodname
	}

}
